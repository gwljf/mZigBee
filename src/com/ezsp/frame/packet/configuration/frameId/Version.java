package com.ezsp.frame.packet.configuration.frameId;

import com.ezsp.frame.FrameId;

/**
 * Description: The command allows the Host to specify the desired EZSP version and must be sent before any other command. 
 * This document describes EZSP version 4 and stack type 2 (mesh). The response provides information about the firmware running on the NCP.
 * 
 *
 */
public class Version implements FrameId{

	private byte id = (byte) 0x00;
	
	@Override
	public byte getFrameId(){
		return this.id;
	}
	
	@Override
	public String printDetails(){
		return "{ FrameId : Version (0x00)}";
	}
}
