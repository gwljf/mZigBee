package com.ezsp.frame.packet.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.emberznet.stack.configuration.values.ConfigurationValues;
import com.ezsp.frame.EzspFrameParametersCmd;
import com.ezsp.named.values.EzspConfigId;
import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

/**
 * EzspConfigId configId : Identifies which configuration value to change.
 * int16u value : The new configuration value.
 * 
 */

public class SetConfigurationValueCmd  extends EzspFrameParametersCmd {
	
	private static Logger logger = LogManager.getLogger(SetConfigurationValueCmd.class.getName());
	
	private EzspConfigId ezspConfigId;
	private ConfigurationValues configurationValue;
	
	public SetConfigurationValueCmd(EzspConfigId _ezspConfigId, ConfigurationValues _configurationValue){
		this.ezspConfigId = _ezspConfigId;
		this.configurationValue = _configurationValue;
		logger.info("Identifies configuration id: ({}) value to read..", ByteUtils.byte2Hex(this.ezspConfigId.getEzspConfigid()));
		logger.info("The new configurtaion value is ({})", ByteUtils.byteArray2Hex(this.configurationValue.getConfigurationVal()));
	}

	public EzspConfigId getEzspConfigId() {
		return ezspConfigId;
	}

	public ConfigurationValues getConfigurationValue() {
		return configurationValue;
	}

	@Override
	public String printDetails() {
		return CommonValue.SWITCH_LINE +
				"{ SetConfigurationValueCmd:" + CommonValue.SWITCH_LINE +
				CommonValue.BLANK + this.ezspConfigId.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.configurationValue.printDetails() + CommonValue.SWITCH_LINE +
				"}";
	}
}
