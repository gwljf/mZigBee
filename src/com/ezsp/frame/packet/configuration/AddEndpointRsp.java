package com.ezsp.frame.packet.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.ezsp.frame.EzspFrameParametersRsp;
import com.ezsp.named.values.EzspStatus;
import com.zigbee.util.CommonValue;

/**
 * 
 * EzspStatus status : EZSP_SUCCESS if the configuration value was changed, 
 * 					   EZSP_ERROR_OUT_OF_MEMORY if the new value exceeded the available memory, 
 * 					   EZSP_ERROR_INVALID_VALUE if the new value was out of bounds, 
 * 					   EZSP_ERROR_INVALID_CALL if configuration values can no longer be modified.
 */

public class AddEndpointRsp extends EzspFrameParametersRsp{

	private static Logger logger = LogManager.getLogger(AddEndpointRsp.class.getName());
	
	private EzspStatus ezspStatus;
	
	public AddEndpointRsp(byte[] rsp){
		super(rsp);
		if(rsp.length != 1){
			logger.error("AddEndpointRsp' parameters length should be 1");
			throw new IllegalArgumentException("AddEndpointRsp' parameters length should be 1");
		}
		this.ezspStatus = new EzspStatus(rsp[0]);
	}

	public EzspStatus getEzspStatus() {
		return ezspStatus;
	}
	
	@Override
	public String printDetails() {
		return CommonValue.SWITCH_LINE +
				"{ AddEndpointRsp:" + CommonValue.SWITCH_LINE +
				CommonValue.BLANK + this.ezspStatus.printDetails() + CommonValue.SWITCH_LINE +
				"}";
	}

}
