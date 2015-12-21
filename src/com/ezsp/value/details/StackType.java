package com.ezsp.value.details;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zigbee.util.ByteUtils;

/**
 * int8u The type of stack running on the NCP (2).
 *
 */

public class StackType {

	private static Logger logger = LogManager.getLogger(StackType.class.getName());
	
	private byte stackType;
	
	public StackType(byte _stackType){
		this.stackType = _stackType;
	}
	
	public void setStackType(byte _stackType){
		if(this.stackType != _stackType){
			logger.info("StackType changed from {} to {}", this.toString(), "["+ByteUtils.byte2Hex(_stackType)+"]");
			this.stackType = _stackType;
		}
	}
	
	public byte getStackType(){
		return this.stackType;
	}


	public String printDetails(){
		return "{ StackType : "+ByteUtils.byte2Hex(this.stackType)+"}";
	}
}
