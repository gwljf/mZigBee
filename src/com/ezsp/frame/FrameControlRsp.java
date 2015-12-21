package com.ezsp.frame;

import com.ezsp.frame.control.CallbackPendingStatus;
import com.ezsp.frame.control.CallbackTypes;
import com.ezsp.frame.control.NetworkIndex;
import com.ezsp.frame.control.OverflowStatus;
import com.ezsp.frame.control.TruncatedStatus;
import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

// 8bits
public class FrameControlRsp  implements FrameControl{
	
	private byte rsp;
	private NetworkIndex networkIndex;
	private CallbackTypes callbackType;
	private CallbackPendingStatus callbackPending;
	private TruncatedStatus truncated;
	private OverflowStatus overflow;
	
	/**
	 * 	8bits
	 * 
	 * 	bit		value
	 * 	7(MSB) 	1,
	 * 	6		networkIndex[1],
	 * 	5		networkIndex[0],
	 * 	4		callbackType[1],
	 * 	3		callbackType[0],
	 * 	2		callbackPending,
	 * 	1		truncated,
	 * 	0(LSB)	overflow
	 */
	
	public FrameControlRsp(NetworkIndex _networkIndex, CallbackTypes _callbackType, CallbackPendingStatus _callbackPending, TruncatedStatus _truncated, OverflowStatus _overflow){
		
		this.networkIndex = _networkIndex;
		this.callbackType = _callbackType;
		this.callbackPending = _callbackPending;
		this.truncated = _truncated;
		this.overflow = _overflow;
		
		ByteUtils.setBit(rsp, 7, networkIndex.getMsb());
		ByteUtils.setBit(rsp, 6, networkIndex.getMsb());
		ByteUtils.setBit(rsp, 5, networkIndex.getLsb());
		ByteUtils.setBit(rsp, 4, callbackType.getMsb());
		ByteUtils.setBit(rsp, 3, callbackType.getLsb());
		ByteUtils.setBit(rsp, 2, callbackPending.getPendingStatus());
		ByteUtils.setBit(rsp, 1, truncated.isTruncated());
		ByteUtils.setBit(rsp, 0, overflow.getOverflowStatus());
	}

	public byte getResponse() {
		return rsp;
	}
	
	@Override
	public String printDetails(){
		return CommonValue.SWITCH_LINE +
				"{ FrameControlRsp:"+CommonValue.SWITCH_LINE +
				CommonValue.BLANK + this.networkIndex.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.callbackType.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.callbackPending.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.truncated.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.overflow.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				"}";
	}

	@Override
	public String isCmdOrRsp() {
		return isRsp;
	}
}
