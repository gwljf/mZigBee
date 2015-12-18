package com.ezsp.frame.control;

public class CallbakTypes {

	// 2 bits
	
	private byte lsb;
	private byte msb;
	
	public static final int RESERVED = 0;
	
	// (UART interface only) This response is an asynchronous callback. It was not sent in response to a callback command.
	public static final int ASYNCHRONOUS_CALLBACK = 1;
	
	// This response is a synchronous callback. It was sent in response to a callback command.
	public static final int SYNCHRONOUS_CALLBACK = 2;
	public static final int NOT_CALLBACK = 3;
	
	public CallbakTypes(int mode){
		switch(mode){
			case  RESERVED:
				lsb = 1;
				msb = 1;
				break;
			case ASYNCHRONOUS_CALLBACK:
				lsb = 1;
				msb = 0;
				break;
			case SYNCHRONOUS_CALLBACK:
				lsb = 0;
				msb = 1;
				break;
			case NOT_CALLBACK:
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
