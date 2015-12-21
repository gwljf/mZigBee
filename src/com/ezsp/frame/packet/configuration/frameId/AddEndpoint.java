package com.ezsp.frame.packet.configuration.frameId;

import com.ezsp.frame.FrameId;

/**
 * Description: Configures endpoint information on the NCP. 
 * The NCP does not remember these settings after a reset. 
 * Endpoints can be added by the Host after the NCP has reset. 
 * Once the status of the stack changes to EMBER_NETWORK_UP, endpoints can no longer be added 
 * and this command will respond with EZSP_ERROR_INVALID_CALL.
 *
 */
public class AddEndpoint implements FrameId{

	private byte id = (byte) 0x02;
	
	@Override
	public byte getFrameId(){
		return this.id;
	}
	
	@Override
	public String printDetails(){
		return "{ FrameId : AddEndpoint (0x02)}";
	}
}
