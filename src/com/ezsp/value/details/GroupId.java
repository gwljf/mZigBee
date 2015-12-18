package com.ezsp.value.details;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

public class GroupId  implements Comparable<GroupId>{

	private static Logger logger = LogManager.getLogger(GroupId.class.getName());
	
	// int16u
	private byte[] groupId;
	
	public GroupId(byte[] _groupId){
		logger.trace("Begin Init GroupId (byte[] [{}])", ByteUtils.byteArrayToHex(_groupId));
		if(_groupId.length != 2){
			throw new IllegalArgumentException("GroupId should be two bytes.");
		}		
		this.groupId = _groupId;
		logger.trace("Exit init GroupId");
	}
	
	public void setGroupId(byte[] _groupId){
		logger.trace("Enter into setGroupId method");
		if(_groupId.length != 2){
			throw new IllegalArgumentException("GroupId should be two bytes.");
		}
		if(this.groupId != _groupId){
			logger.info("GroupId changed from {} to {}", this.toString(), "["+ByteUtils.byteArrayToHex(_groupId)+"]");
			this.groupId = _groupId;
		}
		logger.trace("Exit setGroupId method");
	}
	
	public byte[] getGroupId(){
		return this.groupId;
	}

	@Override
	public int compareTo(GroupId _groupId) {
		if(this.groupId == _groupId.getGroupId()){
			return CommonValue.Equal;
		}
		return CommonValue.NotEqual;
	}
	
	@Override
	public String toString(){
		return "["+ByteUtils.byteArrayToHex(this.groupId)+"]";
	}
}
