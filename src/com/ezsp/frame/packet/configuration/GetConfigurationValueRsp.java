package com.ezsp.frame.packet.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.emberznet.stack.configuration.values.ConfigurationValues;
import com.ezsp.frame.EzspFrameParametersRsp;
import com.ezsp.named.values.EzspStatus;
import com.zigbee.util.CommonValue;

/**
 * 
 * EzspStatus status : EZSP_SUCCESS if the value was read successfully, EZSP_ERROR_INVALID_ID if the NCP does not recognize configId.
 * int16u value : The configuration value.
 */

public class GetConfigurationValueRsp extends EzspFrameParametersRsp{

	private static Logger logger = LogManager.getLogger(GetConfigurationValueRsp.class.getName());
	
	private EzspStatus ezspStatus;
	private ConfigurationValues configurationValue;
	
	public GetConfigurationValueRsp(byte[] rsp){
		super(rsp);
		if(rsp.length != 3){
			logger.error("GetConfigurationValueRsp' parameters length should be 3");
			throw new IllegalArgumentException("GetConfigurationValueRsp' parameters length should be 3");
		}
		this.ezspStatus = new EzspStatus(rsp[0]);
		this.configurationValue = new ConfigurationValues(new byte[]{rsp[1], rsp[2]});
	}

	public EzspStatus getEzspStatus() {
		return ezspStatus;
	}

	public ConfigurationValues getConfigurationValue() {
		return configurationValue;
	}
	
	@Override
	public String printDetails() {
		return CommonValue.SWITCH_LINE +
				"{ GetConfigurationValueRsp:" + CommonValue.SWITCH_LINE +
				CommonValue.BLANK + this.ezspStatus.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.configurationValue.printDetails() + CommonValue.SWITCH_LINE +
				"}";
	}

}
