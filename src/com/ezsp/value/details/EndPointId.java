package com.ezsp.value.details;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

public class EndPointId implements Comparable<EndPointId>{
	private static Logger logger = LogManager.getLogger(EndPointId.class.getName());
	
	// int8u
	private byte endpointId;
	
	public EndPointId(byte _endpointId){
		this.endpointId = _endpointId;
	}
	
	public void setEndPointId(byte _endpointId){
		if(this.endpointId != _endpointId){
			logger.info("EndPointId changed from {} to {}", this.toString(), "["+ByteUtils.byte2Hex(_endpointId)+"]");
			this.endpointId = _endpointId;
		}
	}
	
	public byte getEndPointId(){
		return this.endpointId;
	}

	@Override
	public int compareTo(EndPointId _endpointId) {
		if(this.endpointId == _endpointId.getEndPointId()){
			return CommonValue.Equal;
		}
		return CommonValue.NotEqual;
	}
	
	public String printDetails(){
		return "{ EndPointId : "+ByteUtils.byte2Hex(this.endpointId)+"}";
	}

}
