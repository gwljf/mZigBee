package com.ezsp.frame.packet.configuration.frameId;

import com.ezsp.frame.FrameId;

/**
 * 
 * Description: Reads a configuration value from the NCP.
 *
 */
public class GetConfigurationValue implements FrameId{

	private byte id = (byte) 0x52;
	
	@Override
	public byte getFrameId(){
		return this.id;
	}
	
	@Override
	public String printDetails(){
		return "{ FrameId : GetConfigurationValue (0x52)}";
	}
}
