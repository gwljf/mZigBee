package com.ezsp.value.details;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

public class ClusterId implements Comparable<ClusterId>{

	private static Logger logger = LogManager.getLogger(ClusterId.class.getName());
	
	// int16u
	private byte[] clusterId;
	
	public ClusterId(byte[] _clusterId){
		if(_clusterId.length != 2){
			throw new IllegalArgumentException("ClusterId should be two bytes.");
		}		
		this.clusterId = _clusterId;
	}
	
	public void setClusterId(byte[] _clusterId){
		if(_clusterId.length != 2){
			throw new IllegalArgumentException("ClusterId should be two bytes.");
		}
		if(this.clusterId != _clusterId){
			logger.info("ClusterId changed from {} to {}", this.toString(), "["+ByteUtils.byteArrayToHex(_clusterId)+"]");
			this.clusterId = _clusterId;
		}
	}
	
	public byte[] getClusterId(){
		return this.clusterId;
	}

	@Override
	public int compareTo(ClusterId _clusterId) {
		if(this.clusterId == _clusterId.getClusterId()){
			return CommonValue.Equal;
		}
		return CommonValue.NotEqual;
	}
	
	public String printDetails(){
		return "{ ClusterId : "+ByteUtils.byteArrayToHex(this.clusterId)+"}";
	}
}
