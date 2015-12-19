package com.ezsp.frame.control;

public class SleepModes {

	// 2 bits
	
	private boolean lsb;
	private boolean msb;
	
	public static final int RESERVED = 0;
	public static final int POWER_DOWN = 1;
	public static final int DEEP_SLEEP = 2;
	public static final int IDLE = 3;
	
	public SleepModes(int mode){
		switch(mode){
			case  RESERVED:
				lsb = true;		//1
				msb = true;		//1
				break;
			case POWER_DOWN:
				lsb = true;		//1
				msb = false;	//0
				break;
			case DEEP_SLEEP:
				lsb = false;	//0
				msb = true;		//1
				break;
			case IDLE:
				lsb = false;	//0
				msb =false;		//0
				break;
			default:
				throw new IllegalArgumentException("Can't handle this sleep mode");
		}
	}

	public boolean getLsb() {
		return lsb;
	}

	public boolean getMsb() {
		return msb;
	}
	
	public String printDetails() {
		if(this.msb && this.lsb){
			return "{ SleepMode : RESERVED }";
		} else if(!this.msb && this.lsb){
			return "{ SleepMode : POWER_DOWN }";
		} else if(this.msb && !this.lsb){
			return "{ SleepMode : DEEP_SLEEP }";
		}
		return "{ SleepMode : IDLE }";
	}
}
