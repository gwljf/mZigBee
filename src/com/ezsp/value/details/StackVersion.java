package com.ezsp.value.details;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zigbee.util.ByteUtils;

/**
 * int16u The version number of the stack.
 *
 */

public class StackVersion {

	private static Logger logger = LogManager.getLogger(StackVersion.class.getName());
	
	// int16u
	private byte[] stackVersion;
	
	public StackVersion(byte[] _stackVersion){
		if(_stackVersion.length != 2){
			throw new IllegalArgumentException("StackVersion should be two bytes.");
		}		
		this.stackVersion = _stackVersion;
	}
	
	public void setStackVersion(byte[] _stackVersion){
		if(_stackVersion.length != 2){
			throw new IllegalArgumentException("StackVersion should be two bytes.");
		}
		if(this.stackVersion != _stackVersion){
			logger.info("StackVersion changed from {} to {}", this.toString(), "["+ByteUtils.byteArray2Hex(_stackVersion)+"]");
			this.stackVersion = _stackVersion;
		}
	}
	
	public byte[] getStackVersion(){
		return this.stackVersion;
	}

	
	public String printDetails(){
		return "{ StackVersion : "+ByteUtils.byteArray2Hex(this.stackVersion)+"}";
	}
}
