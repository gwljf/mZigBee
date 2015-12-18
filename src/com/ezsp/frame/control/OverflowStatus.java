package com.ezsp.frame.control;

public class OverflowStatus {

	// 1 bit
	
	// The NCP ran out of memory since the previous response.
	public static final boolean OVERFLOW = true; // 1
	
	// No memory shortage since the previous response.
	public static final boolean NONEOVERFLOW = false; // 0
}
