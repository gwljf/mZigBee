package com.ezsp.frame.packet.configuration.frameId;

import com.ezsp.frame.FrameId;

/**
 * 
 * Description: Writes a configuration value to the NCP. 
 * Configuration values can be modified by the Host after the NCP has reset. 
 * Once the status of the stack changes to EMBER_NETWORK_UP, configuration values can no longer be modified and this command will respond with EZSP_ERROR_INVALID_CALL.
 *
 */
public class SetConfigurationValue implements FrameId{

	private byte id = (byte) 0x53;
	
	@Override
	public byte getFrameId(){
		return this.id;
	}
	
	@Override
	public String printDetails(){
		return "{ FrameId : SetConfigurationValue (0x53)}";
	}
}
