package com.ezsp.frame.control;

public class OverflowStatus {

	// 1 bit
	private boolean overflowStatus;
	
	// The NCP ran out of memory since the previous response.
	public static final int OVERFLOW = 1; // true
	
	// No memory shortage since the previous response.
	public static final int NONEOVERFLOW = 0; // false
	
	public OverflowStatus(int OverflowStatus){
		switch(OverflowStatus){
			case OVERFLOW:
				this.overflowStatus = true;
				break;
			case NONEOVERFLOW:
				this.overflowStatus = false;
				break;
			default:
				throw new IllegalArgumentException("Can't handle this OverflowStatus");
		}
	}
	
	public boolean getOverflowStatus(){
		return this.overflowStatus;
	}
	
	public String printDetails() {
		if(this.overflowStatus){
			return "{ OverflowStatus : OVERFLOW}";
		}
		return "{ OverflowStatus : NONEOVERFLOW}";
	}
}
