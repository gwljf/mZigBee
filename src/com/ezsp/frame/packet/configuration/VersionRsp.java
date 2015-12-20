package com.ezsp.frame.packet.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.ezsp.frame.EzspFrameParametersRsp;
import com.ezsp.value.details.ProtocolVersion;
import com.ezsp.value.details.StackType;
import com.ezsp.value.details.StackVersion;
import com.zigbee.util.CommonValue;


/**
 * int8u protocolVersion : The EZSP version the NCP is using (4).
 * int8u stackType : The type of stack running on the NCP (2).
 * int16u stackVersion : The version number of the stack.
 */

public class VersionRsp extends EzspFrameParametersRsp{
	
	private static Logger logger = LogManager.getLogger(VersionRsp.class.getName());
	
	private ProtocolVersion protocolVersion;
	private StackType stackType;
	private StackVersion stackVersion;
	
	public VersionRsp(byte[] rsp){
		super(rsp);
		if(rsp.length != 4){
			logger.error("VersionRsp' parameters length should be 4");
			throw new IllegalArgumentException("VersionRsp' parameters length should be 4");
		}
		protocolVersion = new ProtocolVersion(rsp[0]);
		stackType = new StackType(rsp[1]);
		stackVersion = new StackVersion(new byte[]{rsp[2], rsp[3]});
	}

	public ProtocolVersion getProtocolVersion() {
		return protocolVersion;
	}

	public StackType getStackType() {
		return stackType;
	}

	public StackVersion getStackVersion() {
		return stackVersion;
	}

	@Override
	public String printDetails() {
		return CommonValue.SWITCH_LINE +
				"{ VersionRsp:" + CommonValue.SWITCH_LINE +
				CommonValue.BLANK + this.protocolVersion.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.stackType.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.stackVersion.printDetails() + CommonValue.SWITCH_LINE +
				"}\n";
	}

}
