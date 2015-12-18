package com.ezsp.frame.control;

public class TruncatedStatus {

	// 1 bit
	
	// The NCP truncated the current response to avoid exceeding the maximum EZSP frame length.
	public static final boolean TRUNCATED = true;	// 1
	
	// The current response was not truncated.
	public static final boolean NONETRUNCATED = false;	//0
}
