package com.ezsp.value.details;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zigbee.util.ByteUtils;
import com.zigbee.util.CommonValue;

/**
 * The application profile ID that describes the format of the message.
 *
 */

public class ApplicationProfileId implements Comparable<ApplicationProfileId>{

	private static Logger logger = LogManager.getLogger(ApplicationProfileId.class.getName());
	
	// int16u
	private byte[] profileId;
	
	public ApplicationProfileId(byte[] _profileId){
		if(_profileId.length != 2){
			throw new IllegalArgumentException("ProfileId should be two bytes.");
		}		
		this.profileId = _profileId;
	}
	
	public void setProfileId(byte[] _profileId){
		if(_profileId.length != 2){
			throw new IllegalArgumentException("ProfileId should be two bytes.");
		}
		if(this.profileId != _profileId){
			logger.info("ProfileId changed from {} to {}", this.toString(), "["+ByteUtils.byteArray2Hex(_profileId)+"]");
			this.profileId = _profileId;
		}
	}
	
	public byte[] getProfileId(){
		return this.profileId;
	}

	@Override
	public int compareTo(ApplicationProfileId _applicationProfileId) {
		if(this.profileId == _applicationProfileId.getProfileId()){
			return CommonValue.Equal;
		}
		return CommonValue.NotEqual;
	}
	
	public String printDetails(){
		return "{ ApplicationProfileId : "+ByteUtils.byteArray2Hex(this.profileId)+"}";
	}
	
}
