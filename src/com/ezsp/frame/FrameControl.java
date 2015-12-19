package com.ezsp.frame;

public interface FrameControl {

	public final static String isCmd = "FrameControlCmd";
	public final static String isRsp = "FrameControlRsp";
	public String isCmdOrRsp();
	public String printDetails();
}
