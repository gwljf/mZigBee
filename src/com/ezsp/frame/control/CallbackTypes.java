package com.ezsp.frame.control;

public class CallbackTypes {

	// 2 bits
	
	private boolean lsb;
	private boolean msb;
	
	public static final int RESERVED = 0;
	
	// (UART interface only) This response is an asynchronous callback. It was not sent in response to a callback command.
	public static final int ASYNCHRONOUS_CALLBACK = 1;
	
	// This response is a synchronous callback. It was sent in response to a callback command.
	public static final int SYNCHRONOUS_CALLBACK = 2;
	
	// This response is not a callback.
	public static final int NOT_CALLBACK = 3;
	
	public CallbackTypes(int mode){
		switch(mode){
			case  RESERVED:
				lsb = true;		//1
				msb = true;		//1
				break;
			case ASYNCHRONOUS_CALLBACK:
				lsb = true;		//1
				msb = false;	//0
				break;
			case SYNCHRONOUS_CALLBACK:
				lsb = false;	//0
				msb = true;		//1
				break;
			case NOT_CALLBACK:
				lsb = false;	//0
				msb = false;	//0
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
	
	public String printDetails(){
		if(this.lsb && this.msb){
			return "{ CallbackType : RESERVED}";
		}else if(this.lsb && !this.msb){
			return "{ CallbackType : ASYNCHRONOUS_CALLBACK}";
		}else if(!this.lsb && this.msb){
			return "{ CallbackType : SYNCHRONOUS_CALLBACK}";
		}
		return "{ CallbackType : NOT_CALLBACK}";
	}
}
