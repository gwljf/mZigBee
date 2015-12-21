package com.ezsp.frame.control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zigbee.util.ByteUtils;

// 2bits
public class NetworkIndex {

	private static Logger logger = LogManager.getLogger(NetworkIndex.class.getName());
	
	private boolean lsb, msb;
	
	public NetworkIndex(byte _msb, byte _lsb){
		if(((_msb!=(byte)0x01)&&(_msb!=(byte)0x00)) || ((_lsb!=(byte)0x01)&&(_lsb!=(byte)0x00))){
			logger.warn("NetworkIndex lsb and msb should be 0x00 or 0x01");
		}
		this.lsb = ByteUtils.byte2Bool(_lsb);
		this.msb = ByteUtils.byte2Bool(_msb);
	}
	
	public NetworkIndex(boolean _msb, boolean _lsb){
		this.lsb = _lsb;
		this.msb = _msb;
	}
	
	public NetworkIndex(int _msb, int _lsb){
		if(((_msb!=1)&&(_msb!=0)) || ((_lsb!=1)&&(_lsb!=0))){
			logger.fatal("NetworkIndex lsb and msb should be 0 or 1");
			return;
		}
		this.lsb = ByteUtils.byte2Bool((byte)_lsb);
		this.msb = ByteUtils.byte2Bool((byte)_msb);
	}
	
	public boolean getLsb() {
		return lsb;
	}

	public boolean getMsb() {
		return msb;
	}
	
	public String printDetails() {
		StringBuilder sb = new StringBuilder();
		if(this.msb && this.lsb){
			sb.append("(msb:1),(lsb:1)");
		} else if(!this.msb && this.lsb){
			sb.append("(msb:0),(lsb:1)");
		} else if(this.msb && !this.lsb){
			sb.append("(msb:1),(lsb:0)");
		} else {
			sb.append("(msb:1),(lsb:1)");
		}
		return "{ NetworkIndex : "+sb.toString()+" }";
	}
}
