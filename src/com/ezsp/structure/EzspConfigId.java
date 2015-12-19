package com.ezsp.structure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zigbee.util.ByteUtils;

public class EzspConfigId {
	
	
	private static Logger logger = LogManager.getLogger(EzspConfigId.class.getName());
	
	private byte ezspConfigId;
	
	public EzspConfigId(byte _ezspConfigId){
		this.ezspConfigId = _ezspConfigId;
	}
	
	public byte getEzspConfigid(){
		return this.ezspConfigId;
	}

	
	// The number of packet buffers available to the stack.
	public static final byte EZSP_CONFIG_PACKET_BUFFER_COUNT = (byte)0x01;
	
	// The maximum number of router neighbors the stack can keep track of. A neighbor is a node within radio range.
	public static final byte EZSP_CONFIG_NEIGHBOR_TABLE_SIZE = (byte)0x02;
	
	// The maximum number of APS retried messages the stack can be transmitting at any time.
	public static final byte EZSP_CONFIG_APS_UNICAST_MESSAGE_COUNT = (byte)0x03;
	
	// The maximum number of non-volatile bindings supported by the stack.
	public static final byte EZSP_CONFIG_BINDING_TABLE_SIZE = (byte)0x04;
	
	// The maximum number of EUI64 to network address associations that the stack can maintain.
	public static final byte EZSP_CONFIG_ADDRESS_TABLE_SIZE = (byte)0x05;
	
	// The maximum number of multicast groups that the device may be a member of.
	public static final byte EZSP_CONFIG_MULTICAST_TABLE_SIZE = (byte)0x06;
	
	// The maximum number of destinations to which a node can route messages. This includes both messages originating at this node and those relayed for others.
	public static final byte EZSP_CONFIG_ROUTE_TABLE_SIZE = (byte)0x07;
		
	// The number of simultaneous route discoveries that a node will support.
	public static final byte EZSP_CONFIG_DISCOVERY_TABLE_SIZE = (byte)0x08;
		
	// The size of the alarm broadcast buffer.
	public static final byte EZSP_CONFIG_BROADCAST_ALARM_DATA_SIZE = (byte)0x09;
		
	// The size of the unicast alarm buffers allocated for end device children.
	public static final byte EZSP_CONFIG_UNICAST_ALARM_DATA_SIZE = (byte)0x0A;
		
	// Specifies the stack profile.
	public static final byte EZSP_CONFIG_STACK_PROFILE = (byte)0x0C;
		
	// The security level used for security at the MAC and network layers. The supported values are 0 (no security) and 5 (payload is encrypted and a four-byte MIC is used for authentication).
	public static final byte EZSP_CONFIG_SECURITY_LEVEL = (byte)0x0D;
	
	// The maximum number of hops for a message.
	public static final byte EZSP_CONFIG_MAX_HOPS = (byte)0x10;
		
	// The maximum number of end device children that a router will support.
	public static final byte EZSP_CONFIG_MAX_END_DEVICE_CHILDREN = (byte)0x11;
		
	// The maximum amount of time that the MAC will hold a message for indirect transmission to a child.
	public static final byte EZSP_CONFIG_INDIRECT_TRANSMISSION_TIMEOUT = (byte)0x12;
		
	// The maximum amount of time that an end device child can wait between polls. If no poll is heard within this timeout, then the parent removes the end device from its tables.
	public static final byte EZSP_CONFIG_END_DEVICE_POLL_TIMEOUT = (byte)0x13;
		
	// The maximum amount of time that a mobile node can wait between polls. If no poll is heard
	public static final byte EZSP_CONFIG_MOBILE_NODE_POLL_TIMEOUT = (byte)0x14;
	
	// The number of child table entries reserved for use only by mobile nodes.
	public static final byte EZSP_CONFIG_RESERVED_MOBILE_CHILD_ENTRIES = (byte)0x15;
	
	// Enables boost power mode and/or the alternate transmitter output.
	public static final byte EZSP_CONFIG_TX_POWER_MODE = (byte)0x17;
	
	// 0: Allow this node to relay messages. 1: Prevent this node from relaying messages.
	public static final byte EZSP_CONFIG_DISABLE_RELAY = (byte)0x18;
	
	// The maximum number of EUI64 to network address associations that the Trust Center can maintain.
	public static final byte EZSP_CONFIG_TRUST_CENTER_ADDRESS_CACHE_SIZE = (byte)0x19;
	
	// The size of the source route table.
	public static final byte EZSP_CONFIG_SOURCE_ROUTE_TABLE_SIZE = (byte)0x1A;
	
	// The units used for timing out end devices on their parents.
	public static final byte EZSP_CONFIG_END_DEVICE_POLL_TIMEOUT_SHIFT = (byte)0x1B;
	
	// The number of blocks of a fragmented message that can be sent in a single window.
	public static final byte EZSP_CONFIG_FRAGMENT_WINDOW_SIZE = (byte)0x1C;
	
	// The time the stack will wait (in milliseconds) between sending blocks of a fragmented message.
	public static final byte EZSP_CONFIG_FRAGMENT_DELAY_MS = (byte)0x1D;
	
	// The size of the Key Table used for storing individual link keys (if the device is a Trust Center) or Application Link Keys (if the device is a normal node).
	public static final byte EZSP_CONFIG_KEY_TABLE_SIZE = (byte)0x1E;
	
	// The APS ACK timeout value. The stack waits this amount of time between resends of APS retried messages.
	public static final byte EZSP_CONFIG_APS_ACK_TIMEOUT = (byte)0x1F;
	
	// The duration of an active scan, in the units used by the 15.4 scan parameter (((1 << duration) + 1) * 15ms). This also controls the jitter used when responding to a beacon request.
	public static final byte EZSP_CONFIG_ACTIVE_SCAN_DURATION = (byte)0x20;
	
	// The time the coordinator will wait (in seconds) for a second end device bind request to arrive.
	public static final byte EZSP_CONFIG_END_DEVICE_BIND_TIMEOUT = (byte)0x21;
	
	// The number of PAN id conflict reports that must be received by the network manager within one minute to trigger a PAN id change.
	public static final byte EZSP_CONFIG_PAN_ID_CONFLICT_REPORT_THRESHOLD = (byte)0x22;
	
	// The timeout value in minutes for how long the Trust Center or a normal node waits for the ZigBee Request Key to complete. On the Trust Center this controls whether or not the device buffers the request, waiting for a matching pair of ZigBee Request Key. If the value is non-zero, the Trust Center buffers and waits for that amount of time. If the value is zero, the Trust Center does not buffer the request and immediately responds to the request. Zero is the most compliant behavior.
	public static final byte EZSP_CONFIG_REQUEST_KEY_TIMEOUT = (byte)0x24;
	
	// This value indicates the size of the runtime modifiable certificate table. Normally certificates are stored in MFG tokens but this table can be used to field upgrade devices with new Smart Energy certificates. This value cannot be set, it can only be queried.
	public static final byte EZSP_CONFIG_CERTIFICATE_TABLE_SIZE = (byte)0x29;
	
	// This is a bitmask that controls which incoming ZDO request messages are passed to the application. The bits are defined in the EmberZdoConfigurationFlags enumeration. To see if the application is required to send a ZDO response in reply to an incoming message, the application must check the APS options bitfield within the incomingMessageHandler callback to see if the EMBER_APS_OPTION_ZDO_RESPONSE_REQUIRED flag is set.
	public static final byte EZSP_CONFIG_APPLICATION_ZDO_FLAGS = (byte)0x2A;
	
	// The maximum number of broadcasts during a single broadcast timeout period.
	public static final byte EZSP_CONFIG_BROADCAST_TABLE_SIZE = (byte)0x2B;
	
	// The size of the MAC filter list table.
	public static final byte EZSP_CONFIG_MAC_FILTER_TABLE_SIZE = (byte)0x2C;
	
	// The number of supported networks.
	public static final byte EZSP_CONFIG_SUPPORTED_NETWORKS = (byte)0x2D;
	
	// Whether multicasts are sent to the RxOnWhenIdle=TRUE address (0xFFFD) or the sleepy broadcast address (0xFFFF). The RxOnWhenIdle=TRUE address is the ZigBee compliant destination for multicasts.
	public static final byte EZSP_CONFIG_SEND_MULTICASTS_TO_SLEEPY_ADDRESS = (byte)0x2E;
	
	// ZLL group address initial configuration.
	public static final byte EZSP_CONFIG_ZLL_GROUP_ADDRESSES = (byte)0x2F;
	
	// ZLL rssi threshold initial configuration.
	public static final byte EZSP_CONFIG_ZLL_RSSI_THRESHOLD = (byte)0x30;
	
	
	
	
	
	public String printDetails(){
		switch(this.ezspConfigId){
			case EZSP_CONFIG_PACKET_BUFFER_COUNT:
				return "{ EzspConfigId : EZSP_CONFIG_PACKET_BUFFER_COUNT }";
			case EZSP_CONFIG_NEIGHBOR_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_NEIGHBOR_TABLE_SIZE }";
			case EZSP_CONFIG_APS_UNICAST_MESSAGE_COUNT:
				return "{ EzspConfigId : EZSP_CONFIG_APS_UNICAST_MESSAGE_COUNT }";
			case EZSP_CONFIG_BINDING_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_BINDING_TABLE_SIZE }";
			case EZSP_CONFIG_ADDRESS_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_ADDRESS_TABLE_SIZE }";
			case EZSP_CONFIG_MULTICAST_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_MULTICAST_TABLE_SIZE }";
			case EZSP_CONFIG_ROUTE_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_ROUTE_TABLE_SIZE }";	
			case EZSP_CONFIG_DISCOVERY_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_DISCOVERY_TABLE_SIZE }";
			case EZSP_CONFIG_BROADCAST_ALARM_DATA_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_BROADCAST_ALARM_DATA_SIZE }";
			case EZSP_CONFIG_UNICAST_ALARM_DATA_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_UNICAST_ALARM_DATA_SIZE }";
			case EZSP_CONFIG_STACK_PROFILE:
				return "{ EzspConfigId : EZSP_CONFIG_STACK_PROFILE }";
			case EZSP_CONFIG_SECURITY_LEVEL:
				return "{ EzspConfigId : EZSP_CONFIG_SECURITY_LEVEL }";
			case EZSP_CONFIG_MAX_HOPS:
				return "{ EzspConfigId : EZSP_CONFIG_MAX_HOPS }";
			case EZSP_CONFIG_MAX_END_DEVICE_CHILDREN:
				return "{ EzspConfigId : EZSP_CONFIG_MAX_END_DEVICE_CHILDREN }";
			case EZSP_CONFIG_INDIRECT_TRANSMISSION_TIMEOUT:
				return "{ EzspConfigId : EZSP_CONFIG_INDIRECT_TRANSMISSION_TIMEOUT }";
			case EZSP_CONFIG_END_DEVICE_POLL_TIMEOUT:
				return "{ EzspConfigId : EZSP_CONFIG_END_DEVICE_POLL_TIMEOUT }";
			case EZSP_CONFIG_MOBILE_NODE_POLL_TIMEOUT:
				return "{ EzspConfigId : EZSP_CONFIG_MOBILE_NODE_POLL_TIMEOUT }";
			case EZSP_CONFIG_RESERVED_MOBILE_CHILD_ENTRIES:
				return "{ EzspConfigId : EZSP_CONFIG_RESERVED_MOBILE_CHILD_ENTRIES }";
			case EZSP_CONFIG_TX_POWER_MODE:
				return "{ EzspConfigId : EZSP_CONFIG_TX_POWER_MODE }";
			case EZSP_CONFIG_DISABLE_RELAY:
				return "{ EzspConfigId : EZSP_CONFIG_DISABLE_RELAY }";
			case EZSP_CONFIG_TRUST_CENTER_ADDRESS_CACHE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_TRUST_CENTER_ADDRESS_CACHE_SIZE }";	
			case EZSP_CONFIG_SOURCE_ROUTE_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_SOURCE_ROUTE_TABLE_SIZE }";
			case EZSP_CONFIG_END_DEVICE_POLL_TIMEOUT_SHIFT:
				return "{ EzspConfigId : EZSP_CONFIG_END_DEVICE_POLL_TIMEOUT_SHIFT }";
			case EZSP_CONFIG_FRAGMENT_WINDOW_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_FRAGMENT_WINDOW_SIZE }";
			case EZSP_CONFIG_FRAGMENT_DELAY_MS:
				return "{ EzspConfigId : EZSP_CONFIG_FRAGMENT_DELAY_MS }";
			case EZSP_CONFIG_KEY_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_KEY_TABLE_SIZE }";
			case EZSP_CONFIG_APS_ACK_TIMEOUT:
				return "{ EzspConfigId : EZSP_CONFIG_APS_ACK_TIMEOUT }";
			case EZSP_CONFIG_ACTIVE_SCAN_DURATION:
				return "{ EzspConfigId : EZSP_CONFIG_ACTIVE_SCAN_DURATION }";
			case EZSP_CONFIG_END_DEVICE_BIND_TIMEOUT:
				return "{ EzspConfigId : EZSP_CONFIG_END_DEVICE_BIND_TIMEOUT }";
			case EZSP_CONFIG_PAN_ID_CONFLICT_REPORT_THRESHOLD:
				return "{ EzspConfigId : EZSP_CONFIG_PAN_ID_CONFLICT_REPORT_THRESHOLD }";
			case EZSP_CONFIG_REQUEST_KEY_TIMEOUT:
				return "{ EzspConfigId : EZSP_CONFIG_REQUEST_KEY_TIMEOUT }";
			case EZSP_CONFIG_CERTIFICATE_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_CERTIFICATE_TABLE_SIZE }";
			case EZSP_CONFIG_APPLICATION_ZDO_FLAGS:
				return "{ EzspConfigId : EZSP_CONFIG_APPLICATION_ZDO_FLAGS }";
			case EZSP_CONFIG_BROADCAST_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_BROADCAST_TABLE_SIZE }";
			case EZSP_CONFIG_MAC_FILTER_TABLE_SIZE:
				return "{ EzspConfigId : EZSP_CONFIG_MAC_FILTER_TABLE_SIZE }";	
			case EZSP_CONFIG_SUPPORTED_NETWORKS:
				return "{ EzspConfigId : EZSP_CONFIG_SUPPORTED_NETWORKS }";
			case EZSP_CONFIG_SEND_MULTICASTS_TO_SLEEPY_ADDRESS:
				return "{ EzspConfigId : EZSP_CONFIG_SEND_MULTICASTS_TO_SLEEPY_ADDRESS }";
			case EZSP_CONFIG_ZLL_GROUP_ADDRESSES:
				return "{ EzspConfigId : EZSP_CONFIG_ZLL_GROUP_ADDRESSES }";
			case EZSP_CONFIG_ZLL_RSSI_THRESHOLD:
				return "{ EzspConfigId : EZSP_CONFIG_ZLL_RSSI_THRESHOLD }";
			default:
				logger.error("Can't handle this type of this type of EzspConfigId : {}", ByteUtils.byteToHex(this.ezspConfigId));
				throw new IllegalArgumentException("Can't handle this type of EzspConfigId");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
