package com.ezsp.frame.control;

public class TruncatedStatus {

	// 1 bit
	
	private boolean isTruncated;
	// The NCP truncated the current response to avoid exceeding the maximum EZSP frame length.
	public static final int TRUNCATED = 1;	// true
	
	// The current response was not truncated.
	public static final int NONETRUNCATED = 0;	//false
	
	public TruncatedStatus(int TruncatedStatusType) {
		switch(TruncatedStatusType){
			case TRUNCATED:
				this.isTruncated = true;
				break;
			case NONETRUNCATED:
				this.isTruncated = false;
				break;
			default:
				throw new IllegalArgumentException("Can't handle this TruncatedStatusType");
		}
	}

	public boolean isTruncated() {
		return this.isTruncated;
	}
	
	public String printDetails() {
		if(this.isTruncated){
			return "{ TruncatedStatus : TRUNCATED}";
		}
		return  "{ TruncatedStatus : NONETRUNCATED}";
	}
}
