package com.ezsp.frame.control;

public class SleepModes {

	// 2 bits
	
	private byte lsb;
	private byte msb;
	
	public static final int RESERVED = 0;
	public static final int POWER_DOWN = 1;
	public static final int DEEP_SLEEP = 2;
	public static final int IDLE = 3;
	
	public SleepModes(int mode){
		switch(mode){
			case  RESERVED:
				lsb = 1;
				msb = 1;
				break;
			case POWER_DOWN:
				lsb = 1;
				msb = 0;
				break;
			case DEEP_SLEEP:
				lsb = 0;
				msb = 1;
				break;
			case IDLE:
				lsb = 0;
				msb =0;
				break;
			default:
				throw new IllegalArgumentException("Can't handle this sleep mode");
		}
	}

	public byte getLsb() {
		return lsb;
	}

	public byte getMsb() {
		return msb;
	}
	
	
}
