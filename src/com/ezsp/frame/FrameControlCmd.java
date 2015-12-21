package com.ezsp.frame;

import com.ezsp.frame.control.NetworkIndex;
import com.ezsp.frame.control.SleepModes;
import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

// 8bits
public class FrameControlCmd implements FrameControl{

	private byte cmd;
	private NetworkIndex networkIndex;
	private SleepModes sleepMode;
	
	/**
	 * 	8bits
	 * 
	 * 	bit		value
	 * 	7(MSB) 	0,
	 * 	6		networkIndex[1],
	 * 	5		networkIndex[0],
	 * 	4		0(reserved),
	 * 	3		0(reserved),
	 * 	2		0(reserved),
	 * 	1		sleepMode[1],
	 * 	0(LSB)	sleepMode[0]
	 */
	
	public FrameControlCmd(NetworkIndex _networkIndex, SleepModes _sleepMode){
		
		this.networkIndex = _networkIndex;
		this.sleepMode = _sleepMode;
		ByteUtils.setBit(cmd, 7, false);
		ByteUtils.setBit(cmd, 6, networkIndex.getMsb());
		ByteUtils.setBit(cmd, 5, networkIndex.getLsb());
		for(int i=3; i<=5; ++i){
			ByteUtils.setBit(cmd, i, false);
		}
		ByteUtils.setBit(cmd, 1, sleepMode.getMsb());
		ByteUtils.setBit(cmd, 0, sleepMode.getLsb());
		
	}

	public byte getCommand() {
		return cmd;
	}

	public NetworkIndex getNetworkIndex() {
		return networkIndex;
	}

	public SleepModes getSleepMode() {
		return sleepMode;
	}
	
	@Override
	public String printDetails(){
		 return CommonValue.SWITCH_LINE +
				"{ FrameControlCmd:"+CommonValue.SWITCH_LINE +
				CommonValue.BLANK+this.networkIndex.printDetails()+CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK+this.sleepMode.printDetails()+CommonValue.SWITCH_LINE +
				"}";
	}

	@Override
	public String isCmdOrRsp() {
		return isCmd;
	}
	
	
}
