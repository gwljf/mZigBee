package com.ezsp.frame;

import com.ezsp.value.details.SequenceNumber;
import com.zigbee.util.CommonValue;

public class EzspFrame {

	private SequenceNumber sequenceNumber;
	private FrameControl frameControl;
	private FrameId frameId;
	private EzspFrameParameters ezspFrameParameters;
	
	public EzspFrame(SequenceNumber sequenceNumber, FrameControl frameControl, FrameId frameId, EzspFrameParameters ezspFrameParameters){
		this.sequenceNumber = sequenceNumber;
		this.frameControl = frameControl;
		this.frameId = frameId;
		this.ezspFrameParameters = ezspFrameParameters;
	}
	
	public String printDetails(){
		return CommonValue.SWITCH_LINE +
				"{ EzspFrame:" + CommonValue.SWITCH_LINE +
				CommonValue.BLANK + this.sequenceNumber.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.frameControl.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.frameId.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				CommonValue.BLANK + this.ezspFrameParameters.printDetails() + CommonValue.COMMA_SWITCH_LINE +
				"}";
	}

	public SequenceNumber getSequenceNumber() {
		return sequenceNumber;
	}

	public FrameControl getFrameControl() {
		return frameControl;
	}

	public FrameId getFrameId() {
		return frameId;
	}

	public EzspFrameParameters getEzspFrameParameters() {
		return ezspFrameParameters;
	}
	
	
}
