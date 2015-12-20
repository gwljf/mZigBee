package com.ezsp.frame.packet.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ezsp.frame.EzspFrameParametersRsp;
import com.ezsp.named.values.EzspStatus;
import com.ezsp.value.details.ProtocolVersion;
import com.ezsp.value.details.StackType;
import com.ezsp.value.details.StackVersion;
import com.zigbee.util.CommonValue;

/**
 * 
 * EzspStatus status : EZSP_SUCCESS if the value was read successfully, EZSP_ERROR_INVALID_ID if the NCP does not recognize configId.
 * int16u value : The configuration value.
 */

public class GetConfigurationValueRsp extends EzspFrameParametersRsp{

//	private static Logger logger = LogManager.getLogger(GetConfigurationValueRsp.class.getName());
//	
//	private EzspStatus ezspStatus;
//	
//	public GetConfigurationValueRsp(byte[] rsp){
//		super(rsp);
//		if(rsp.length != 4){
//			logger.error("VersionRsp' parameters length should be 4");
//			throw new IllegalArgumentException("VersionRsp' parameters length should be 4");
//		}
//		protocolVersion = new ProtocolVersion(rsp[0]);
//		stackType = new StackType(rsp[1]);
//		stackVersion = new StackVersion(new byte[]{rsp[2], rsp[3]});
//	}
//
//	public EzspStatus getEzspStatus() {
//		return this.ezspStatus;
//	}
//
//
//	@Override
//	public String printDetails() {
//		return CommonValue.SWITCH_LINE +
//				"{ VersionRsp:" + CommonValue.SWITCH_LINE +
//				CommonValue.BLANK + this.protocolVersion.printDetails() + CommonValue.COMMA_SWITCH_LINE +
//				CommonValue.BLANK + this.stackType.printDetails() + CommonValue.COMMA_SWITCH_LINE +
//				CommonValue.BLANK + this.stackVersion.printDetails() + CommonValue.SWITCH_LINE +
//				"}\n";
//	}
	
	
}
