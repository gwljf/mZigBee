package com.zigbee.util;

import java.nio.ByteBuffer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ByteUtils {

	private final static Logger logger = LogManager.getLogger(ByteUtils.class.getName());
	private final static String hexStr = "0123456789ABCDEF";
	
	public static String byte2Hex(byte byteVal){
		logger.trace("Begin into byteToHex");
		StringBuilder sb = new StringBuilder();
		int lowVal = 0, highVal = 0;
		for(int i=0; i<4; ++i){
			 lowVal += ((byteVal>>i)&1)*(1<<i);
		}
		for(int j=4; j<8; ++j){
			highVal += ((byteVal>>j)&1)*(1<<(j-4));
		}
		sb.append("0x");
		sb.append(hexStr.charAt(highVal));
		sb.append(hexStr.charAt(lowVal));
		logger.trace("Exit byteToHex");
		return sb.toString();
	}
	
	public static int getBit(byte byteVal, int position){
		logger.trace("Begin into getBit");
		if(position<0 || position>7){
			throw new IllegalArgumentException("Position of bit can't <0 or >3 for a byte");
		}
		if(((byteVal>>position) & 1)==1){
			logger.trace("Exit getBit with return value: {}", true);
			return 1;
		}
		logger.trace("Exit getBit with return value: {}", false);
		return 0;
	}
	
	// position: right to left, start from 0
	public static byte setBit(byte byteVal, int position, boolean setVal){
		logger.trace("Begin into setBit");
		if(position<0 || position>7){
			throw new IllegalArgumentException("Position of bit can't <0 or >3 for a byte");
		}
		int bitMask = 1;
		if(setVal){
			logger.trace("Exit setBit");
			return (byte) (byteVal|(bitMask<<position));
		}
		logger.trace("Exit setBit");
		for(int i=7; i>=0; --i){
			if(i==position){
				bitMask = bitMask<<1;
				continue;
			}
			bitMask = (bitMask<<1)+1;
		}
		return (byte) (byteVal&bitMask);
	}
	
	public static String byteArray2Hex(byte[] byteAryVal){
		logger.trace("Begin into byteArrayToHex");
		if(byteAryVal.length == 0){
			throw new IllegalArgumentException("Byte Array length should not be 0");
		}
		StringBuilder sb = new StringBuilder();
		int len = byteAryVal.length;
		for(int i=0; i<len; ++i){
			sb.append(byte2Hex(byteAryVal[i])+",");
		}
		sb.delete(sb.length()-1, sb.length());
		logger.trace("Exit byteArrayToHex");
		return sb.toString();
	}
	
	public static byte bool2Byte(boolean boolVal){
		if(boolVal){
			return (byte)0x01;
		}
		return (byte) 0x00;
	}
	
	public static boolean byte2Bool(byte byteVal){
		// only swith lsb to bool, 1 to true, 0 to false
		if(1 == getBit(byteVal, 0)){
			return true;
		}
		return false;
	}
	
	// length should be 2 or 4
	public static byte[] int2ByteArray(int intVal, int len){
		if(len!=2 && len!=4){
			throw new IllegalArgumentException("The lenght should be 2 or 4");
		}
		byte[] _4bytes = new byte[4];
		_4bytes = ByteBuffer.allocate(4).putInt(intVal).array();
		if(len == 2){
			// min:-65536, max:65535
			if(intVal > ((2>>15)-1) && intVal < -(2>>15)){
				throw new IllegalArgumentException("The int value should be less than 0xFF if the length is 2");
			}
			byte[] ret = new byte[2];
			ret[0] = _4bytes[2];
			ret[1] = _4bytes[3];
			return ret;
		}
		return _4bytes;
	}
	
	public static int byteArray2Int(byte[] byteAry){
		if(byteAry.length != 2 && byteAry.length != 4){
			throw new IllegalArgumentException("Byte Array value size is larger than a int size");
		}
		if(byteAry.length == 2){
			return (int) ByteBuffer.wrap(byteAry).getShort();
		}
		return ByteBuffer.wrap(byteAry).getInt();
	}
	
}
