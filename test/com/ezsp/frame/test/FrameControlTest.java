package com.ezsp.frame.test;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.ezsp.frame.FrameControlCmd;
import com.ezsp.frame.FrameControlRsp;
import com.ezsp.frame.control.CallbackPendingStatus;
import com.ezsp.frame.control.CallbackTypes;
import com.ezsp.frame.control.NetworkIndex;
import com.ezsp.frame.control.OverflowStatus;
import com.ezsp.frame.control.SleepModes;
import com.ezsp.frame.control.TruncatedStatus;

public class FrameControlTest {

	private static Logger logger = LogManager.getLogger(FrameControlTest.class.getName());
	
	@Test
	public void testFrameControlCmd(){
		String frameControlCmdStr1 = "\n{ FrameControlCmd:\n" +
                "\t{ NetworkIndex : (msb:1),(lsb:0) },\n" +
                "\t{ SleepMode : IDLE }\n" +
                "}";
		NetworkIndex networkIndex1 = new NetworkIndex(1,0);
		SleepModes sleepMode1 = new SleepModes(SleepModes.IDLE);
		FrameControlCmd frameControlCmd1 = new FrameControlCmd(networkIndex1, sleepMode1);
		logger.debug(frameControlCmd1.printDetails());
		assertEquals(frameControlCmdStr1, frameControlCmd1.printDetails());
		
		
		String frameControlCmdStr2 = "\n{ FrameControlCmd:\n" +
                "\t{ NetworkIndex : (msb:0),(lsb:1) },\n" +
                "\t{ SleepMode : DEEP_SLEEP }\n" +
                "}";
		NetworkIndex networkIndex2 = new NetworkIndex(0,1);
		SleepModes sleepMode2 = new SleepModes(SleepModes.DEEP_SLEEP);
		FrameControlCmd frameControlCmd2 = new FrameControlCmd(networkIndex2, sleepMode2);
		logger.debug(frameControlCmd2.printDetails());
		assertEquals(frameControlCmdStr2, frameControlCmd2.printDetails());
		
	}
	
	@Test
	public void testFrameControlRsp(){
		String frameControlRspStr1 = "\n{ FrameControlRsp:\n" +
                "\t{ NetworkIndex : (msb:1),(lsb:0) },\n" +
                "\t{ CallbackType : SYNCHRONOUS_CALLBACK},\n" +
                "\t{ CallbackPendingStatus : PENDING},\n" +
                "\t{ TruncatedStatus : TRUNCATED},\n" +
                "\t{ OverflowStatus : OVERFLOW},\n" +
                "}";
		NetworkIndex networkIndex1 = new NetworkIndex(1,0);
		CallbackTypes callbackType1 = new CallbackTypes(CallbackTypes.SYNCHRONOUS_CALLBACK);
		CallbackPendingStatus callbackPending1 = new CallbackPendingStatus(CallbackPendingStatus.PENDING);
		TruncatedStatus truncated1 = new TruncatedStatus(TruncatedStatus.TRUNCATED);
		OverflowStatus overflowStatus1 = new OverflowStatus(OverflowStatus.OVERFLOW);
		FrameControlRsp frameControlRsp1 = new FrameControlRsp(networkIndex1, callbackType1, callbackPending1, truncated1, overflowStatus1);
		assertEquals(frameControlRspStr1, frameControlRsp1.printDetails());
		logger.debug(frameControlRsp1.printDetails());
		
		String frameControlRspStr2 = "\n{ FrameControlRsp:\n" +
                "\t{ NetworkIndex : (msb:1),(lsb:1) },\n" +
                "\t{ CallbackType : ASYNCHRONOUS_CALLBACK},\n" +
                "\t{ CallbackPendingStatus : NONEPENDING},\n" +
                "\t{ TruncatedStatus : NONETRUNCATED},\n" +
                "\t{ OverflowStatus : NONEOVERFLOW},\n" +
                "}";
		NetworkIndex networkIndex2 = new NetworkIndex(1,1);
		CallbackTypes callbackType2 = new CallbackTypes(CallbackTypes.ASYNCHRONOUS_CALLBACK);
		CallbackPendingStatus callbackPending2 = new CallbackPendingStatus(CallbackPendingStatus.NONEPENDING);
		TruncatedStatus truncated2 = new TruncatedStatus(TruncatedStatus.NONETRUNCATED);
		OverflowStatus overflowStatus2 = new OverflowStatus(OverflowStatus.NONEOVERFLOW);
		FrameControlRsp frameControlRsp2 = new FrameControlRsp(networkIndex2, callbackType2, callbackPending2, truncated2, overflowStatus2);
		assertEquals(frameControlRspStr2, frameControlRsp2.printDetails());
		logger.debug(frameControlRsp2.printDetails());
	}
}
