package com.ezsp.frame.control;

public class CallbackPendingStatus {

	// 1bit
	
	private boolean pendingStatus;
	// A callback is pending on the NCP. If this response is a callback, at least one more callback is available.
	public static final int PENDING = 1; // true
	
	// All callbacks have been delivered to the host.
	public static final int NONEPENDING = 0; // false
	
	public CallbackPendingStatus(int pendingStatusType){
		switch(pendingStatusType){
			case PENDING:
				this.pendingStatus = true;
				break;
			case NONEPENDING:
				this.pendingStatus = false;
				break;
			default:
				throw new IllegalArgumentException("Can't handle this pendingStatusType");
		}
	}
	
	public boolean getPendingStatus(){
		return this.pendingStatus;
	}
	
	public String printDetails(){
		if(this.pendingStatus){
			return "{ CallbackPendingStatus : PENDING}";
		}
		return "{ CallbackPendingStatus : NONEPENDING}";
	}
}
