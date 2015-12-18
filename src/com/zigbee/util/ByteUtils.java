package com.zigbee.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ByteUtils {

	private final static Logger logger = LogManager.getLogger(ByteUtils.class.getName());
	private final static String hexStr = "0123456789ABCDEF";
	
	public static String byteToHex(byte byteVal){
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
	
	public static String byteArrayToHex(byte[] byteAryVal){
		logger.trace("Begin into byteArrayToHex");
		if(byteAryVal.length == 0){
			throw new IllegalArgumentException("Byte Array length should not be 0");
		}
		StringBuilder sb = new StringBuilder();
		int len = byteAryVal.length;
		for(int i=0; i<len; ++i){
			sb.append(byteToHex(byteAryVal[i])+",");
		}
		sb.delete(sb.length()-1, sb.length());
		logger.trace("Exit byteArrayToHex");
		return sb.toString();
	}
}
