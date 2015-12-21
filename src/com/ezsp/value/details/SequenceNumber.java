package com.ezsp.value.details;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

public class SequenceNumber implements Comparable<SequenceNumber>{
	private static Logger logger = LogManager.getLogger(SequenceNumber.class.getName());
	
	// int8u
	private byte sequenceNumber;
	
	public SequenceNumber(byte _sequenceNumber){
		this.sequenceNumber = _sequenceNumber;
	}
	
	public void setSequenceNumber(byte _sequenceNumber){
		if(this.sequenceNumber != _sequenceNumber){
			logger.info("SequenceNumber changed from {} to {}", this.toString(), "["+ByteUtils.byte2Hex(_sequenceNumber)+"]");
			this.sequenceNumber = _sequenceNumber;
		}
	}
	
	public byte getSequenceNumber(){
		return this.sequenceNumber;
	}

	@Override
	public int compareTo(SequenceNumber _sequenceNumber) {
		if(this.sequenceNumber == _sequenceNumber.getSequenceNumber()){
			return CommonValue.Equal;
		}
		return CommonValue.NotEqual;
	}
	
	public String printDetails(){
		return "{ SequenceNumber : "+ByteUtils.byte2Hex(sequenceNumber)+"}";
	}
}
