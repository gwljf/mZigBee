package com.ezsp.frame.packet.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ezsp.frame.EzspFrameParametersCmd;
import com.ezsp.named.values.EzspConfigId;
import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

/**
 * EzspConfigId configId : Identifies which configuration value to read.
 * 
 */

public class GetConfigurationValueCmd  extends EzspFrameParametersCmd {
	
	
	private static Logger logger = LogManager.getLogger(GetConfigurationValueCmd.class.getName());
	private EzspConfigId ezspConfigId;
	
	public GetConfigurationValueCmd(EzspConfigId _ezspConfigId){
		this.ezspConfigId = _ezspConfigId;
		logger.info("Identifies configuration id: ({}) value to read..", ByteUtils.byte2Hex(this.ezspConfigId.getEzspConfigid()));
	}

	public EzspConfigId getEzspConfigId(){
		return this.ezspConfigId;
	}

	@Override
	public String printDetails() {
		return CommonValue.SWITCH_LINE +
				"{ GetConfigurationValueCmd:" + CommonValue.SWITCH_LINE +
				CommonValue.BLANK + this.ezspConfigId.printDetails() + CommonValue.SWITCH_LINE +
				"}";
	}
}
