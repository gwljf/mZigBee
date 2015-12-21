package com.ezsp.value.details;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zigbee.util.ByteUtils;

// int8u
public class ProtocolVersion {

	private static Logger logger = LogManager.getLogger(ProtocolVersion.class.getName());
	
	private byte protocolVersion;
	
	public ProtocolVersion(byte _protocolVersion){
		this.protocolVersion = _protocolVersion;
	}
	
	public void setProtocolVersion(byte _protocolVersion){
		if(this.protocolVersion != _protocolVersion){
			logger.info("Protocol Version changed from {} to {}", this.toString(), "["+ByteUtils.byte2Hex(_protocolVersion)+"]");
			this.protocolVersion = _protocolVersion;
		}
	}
	
	public byte getProtocolVersion(){
		return this.protocolVersion;
	}


	public String printDetails(){
		return "{ ProtocolVersion : "+ByteUtils.byte2Hex(this.protocolVersion)+"}";
	}
}
