package com.ezsp.frame.control;

public class CallbakPendingStatus {

	// 1bit
	
	// A callback is pending on the NCP. If this response is a callback, at least one more callback is available.
	public static final boolean PENDING = true; // 1
	
	// All callbacks have been delivered to the host.
	public static final boolean NONEPENDING = false; // 0
}
