package com.ezsp.structure;

import com.ezsp.value.details.ApplicationProfileId;
import com.ezsp.value.details.ClusterId;
import com.ezsp.value.details.EndPointId;
import com.ezsp.value.details.GroupId;
import com.ezsp.value.details.SequenceNumber;
import com.zigbee.util.CommonValue;

public class EmberApsFrame {
	
	// The application profile ID that describes the format of the message.
	private ApplicationProfileId appProfileId;
	
	// The cluster ID for this message.
	private ClusterId clusterId;
	
	// The source endpoint.
	private EndPointId sourceEndpoint;
	
	// The destination endpoint.
	private EndPointId destinationEndpoint;
	
	// A bitmask of options.
	private EmberApsOption options;
	
	// The group ID for this message, if it is multicast mode.
	private GroupId groupId;
	
	// The sequence number.
	private SequenceNumber sequenceNumber;

	public EmberApsFrame(ApplicationProfileId _appProfileId, ClusterId _clusterId, EndPointId _sourceEndpoint, EndPointId _destinationEndpoint, EmberApsOption _options, GroupId _groupId, SequenceNumber _sequenceNumber){
		this.appProfileId = _appProfileId;
		this.clusterId = _clusterId;
		this.sourceEndpoint = _sourceEndpoint;
		this.destinationEndpoint = _destinationEndpoint;
		this.groupId = _groupId;
		this.options = _options;
		this.sequenceNumber = _sequenceNumber;
	}
	
	public ApplicationProfileId getAppProfileId() {
		return appProfileId;
	}

	public ClusterId getClusterId() {
		return clusterId;
	}

	public EndPointId getSourceEndpoint() {
		return sourceEndpoint;
	}

	public EndPointId getDestinationEndpoint() {
		return destinationEndpoint;
	}

	public EmberApsOption getOptions() {
		return options;
	}

	public GroupId getGroupId() {
		return groupId;
	}

	public SequenceNumber getSequenceNumber() {
		return sequenceNumber;
	}
	
	public String printDetails(){ 
		return CommonValue.SWITCH_LINE+
				"{ EmberApsFrame:"+CommonValue.SWITCH_LINE+
				CommonValue.BLANK+this.appProfileId.printDetails()+CommonValue.COMMA_SWITCH_LINE+
				CommonValue.BLANK+this.clusterId.printDetails()+CommonValue.COMMA_SWITCH_LINE+
				CommonValue.BLANK+"srcEndpoint: ("+this.sourceEndpoint.printDetails()+")"+CommonValue.COMMA_SWITCH_LINE+
				CommonValue.BLANK+"dstEndpoint: ("+this.destinationEndpoint.printDetails()+")"+CommonValue.COMMA_SWITCH_LINE+
				CommonValue.BLANK+this.groupId.printDetails()+CommonValue.COMMA_SWITCH_LINE+
				CommonValue.BLANK+this.options.printDetails()+CommonValue.COMMA_SWITCH_LINE+
				CommonValue.BLANK+this.sequenceNumber.printDetails()+CommonValue.SWITCH_LINE+
				"}";
	}

}
