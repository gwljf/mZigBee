package com.ezsp.frame.packet.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.ezsp.frame.EzspFrameParametersCmd;
import com.ezsp.value.details.ProtocolVersion;
import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

/**
 * int8u desiredProtocolVersion : The EZSP version the Host wishes to use. To successfully set the version and allow other commands, this must be 4.
 * 
 */
public class VersionCmd extends EzspFrameParametersCmd{
	
	private static Logger logger = LogManager.getLogger(VersionCmd.class.getName());
	
	// int8u : The EZSP version the Host wishes to use. To successfully set the version and allow other commands, this must be 4.
	private ProtocolVersion desiredProtocolVersion;
	
	public VersionCmd(ProtocolVersion _desiredProtocolVersion){
		this.desiredProtocolVersion = _desiredProtocolVersion;
		logger.info("Set _desired Protocol Version as {}.", ByteUtils.byte2Hex(this.desiredProtocolVersion.getProtocolVersion()));
	}

	public ProtocolVersion getDesiredProtocolVersion(){
		return this.desiredProtocolVersion;
	}
	
	@Override
	public String printDetails() {
		return CommonValue.SWITCH_LINE +
				"{ VersionCmd:" + CommonValue.SWITCH_LINE +
				CommonValue.BLANK + this.desiredProtocolVersion.printDetails() + CommonValue.SWITCH_LINE +
				"}";
	}

}
