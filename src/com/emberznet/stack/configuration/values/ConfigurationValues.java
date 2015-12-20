package com.emberznet.stack.configuration.values;

import com.ezsp.named.values.EzspBoolean;

public class ConfigurationValues {

	
	/**
	 * The number of packet buffers available to the stack.
	 * min : 5
	 * def : 24
	 * max :
	 * Units : packet buffers
	 * ram cost : 39
	 */
	public static int EZSP_CONFIG_PACKET_BUFFER_COUNT = 24;
	
	/**
	 * The maximum number of router neighbors the stack can keep track of. A neighbor is a node within radio range.
	 * min : 8
	 * def : 16
	 * max : 16
	 * Units : neighbors
	 * ram cost 18
	 */
	public static int EZSP_CONFIG_NEIGHBOR_TABLE_SIZE = 16;
	
	/**
	 * The maximum number of APS retried messages the stack can be transmitting at any time.
	 * min : 0
	 * def : 10
	 * max :
	 * Units : messages
	 * ram cost : 6
	 */
	public static int EZSP_CONFIG_APS_UNICAST_MESSAGE_COUNT = 10;
	
	/**
	 * The maximum number of non-volatile bindings supported by the stack.
	 * min : 0
	 * def : 0
	 * max : 32
	 * Units : entries
	 * ram cost : 2
	 */
	public static int EZSP_CONFIG_BINDING_TABLE_SIZE = 0;
	
	/**
	 * The maximum number of EUI64 to network address associations that the stack can maintain.
	 * min : 0
	 * def : 8
	 * max :
	 * Units: entries
	 * ram cost : 12
	 */
	public static int EZSP_CONFIG_ADDRESS_TABLE_SIZE = 8;
	
	/**
	 * The maximum number of multicast groups that the device may be a member of.
	 * min : 0
	 * def : 8
	 * max :
	 * Units : entries
	 * ram cost : 4
	 */
	public static int EZSP_CONFIG_MULTICAST_TABLE_SIZE = 8;
	
	/**
	 * The maximum number of destinations to which a node can route messages. This includes both messages originating at this node and those relayed for others.
	 * min : 0
	 * def : 16
	 * max :
	 * Units : entries
	 * ram cost : 6
	 */
	public static int EZSP_CONFIG_ROUTE_TABLE_SIZE = 16;
	
	/**
	 * The number of simultaneous route discoveries that a node will support.
	 * min : 0
	 * def : 8
	 * max :
	 * Units : entries
	 * ram cost : 10
	 */
	public static int EZSP_CONFIG_DISCOVERY_TABLE_SIZE = 8;
	
	/**
	 * The size of the alarm broadcast buffer.
	 * min : 0
	 * def : 0
	 * max : 16
	 * Units : bytes
	 * ram cost : 1
	 */
	public static int EZSP_CONFIG_BROADCAST_ALARM_DATA_SIZE = 0;
	
	/**
	 * (A)
	 * The size of the unicast alarm buffers allocated for end device children.
	 * min : 0
	 * def : 0
	 * max : 16
	 * Units : bytes
	 * ram cost : (C)
	 */
	public static int EZSP_CONFIG_UNICAST_ALARM_DATA_SIZE = 0;
	
	/**
	 * Specifies the stack profile.
	 * min : 0
	 * def : 0
	 * max : 
	 * Units :
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_STACK_PROFILE = 0;
	
	/**
	 * The security level used for security at the MAC and network layers. The supported values are 0 (no security) and 5 (payload is encrypted and a four-byte MIC is used for authentication).
	 * min : 0
	 * def : 5
	 * max : 5
	 * Units:
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_SECURITY_LEVEL = 5;
	
	/**
	 * (B)
	 * The maximum number of hops for a message.
	 * min : 0
	 * def : 30
	 * max :
	 * Units : hops
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_MAX_HOPS = 30;
	
	/**
	 * (C)
	 * The maximum number of end device children that a router will support.
	 * min : 0
	 * def : 6
	 * max : 32
	 * Units : children
	 * ram cost : 9+(A)
	 */
	public static int EZSP_CONFIG_MAX_END_DEVICE_CHILDREN = 6;
	
	/**
	 * The maximum amount of time that the MAC will hold a message for indirect transmission to a child.
	 * min : 0
	 * def : 3000
	 * max : 30000
	 * Units : mili-seconds
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_INDIRECT_TRANSMISSION_TIMEOUT = 3000;
	
	/**
	 * The maximum amount of time that an end device child can wait between polls. If no poll is heard within this timeout, then the parent removes the end device from its tables.
	 * min : 0
	 * def : 5
	 * max : 255
	 * Units : 2^(D) seconds
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_END_DEVICE_POLL_TIMEOUT = 5;
	
	/**
	 * The maximum amount of time that a mobile node can wait between polls. If no poll is heard within this timeout, then the parent removes the mobile node from its tables.
	 * min : 0
	 * def : 20
	 * max :
	 * Units : quarter seconds
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_MOBILE_NODE_POLL_TIMEOUT = 20;
	
	/**
	 * The number of child table entries reserved for use only by mobile nodes.
	 * min : 0
	 * def : 0
	 * max : (C)
	 * Units : entries
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_RESERVED_MOBILE_CHILD_ENTRIES = 0;
	
	/**
	 * Enables boost power mode and/or the alternate transmitter output.
	 * min : 0
	 * def : 0
	 * max : 3
	 * Units :
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_TX_POWER_MODE = 0;
	
	/**
	 * 0: Allow this node to relay messages. 1: Prevent this node from relaying messages.
	 * min : 0
	 * def : 0
	 * max : 1
	 * Units :
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_DISABLE_RELAY = 0;
	
	/**
	 * The maximum number of EUI64 to network address associations that the Trust Center can maintain.
	 * min : 0
	 * def : 0
	 * max :
	 * Units : entries
	 * ram cost : 12
	 */
	public static int EZSP_CONFIG_TRUST_CENTER_ADDRESS_CACHE_SIZE = 0;
	
	/**
	 * The size of the source route table.
	 * min : 0
	 * def : 0
	 * max :
	 * Units : entries
	 * ram cost : 4
	 */
	public static int EZSP_CONFIG_SOURCE_ROUTE_TABLE_SIZE = 0;
	
	/**
	 * (D)
	 * The units used for timing out end devices on their parents.
	 * min : 0
	 * def : 6
	 * max : 10
	 * Units :
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_END_DEVICE_POLL_TIMEOUT_SHIFT = 6;
	
	/**
	 * The number of blocks of a fragmented message that can be sent in a single window.
	 * min : 0
	 * def : 0
	 * max : 8
	 * Units : blocks
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_FRAGMENT_WINDOW_SIZE = 0;
	
	/**
	 * The time the stack will wait between sending blocks of a fragmented message.
	 * min : 0
	 * def : 0
	 * max :
	 * Units : mili-seconds
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_FRAGMENT_DELAY_MS = 0;
	
	/**
	 * The size of the Key Table used for storing individual link keys (if the device is a Trust Center) or Application Link Keys (if the device is a normal node).
	 * min : 0
	 * def : 0
	 * max :
	 * Units : entries
	 * ram cost : 4
	 */
	public static int EZSP_CONFIG_KEY_TABLE_SIZE = 0;
	
	/**
	 * The APS ACK timeout value. The stack waits this amount of time between resends of APS retried messages.
	 * min :
	 * def : 50*(B)+100
	 * max :
	 * Units : mili-seconds
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_APS_ACK_TIMEOUT = 50*30+100;
	
	/**
	 * The duration of an active scan. This also controls the jitter used when responding to a beacon request.
	 * min : 0
	 * def : 3
	 * max : 6
	 * Units : 15.4 scan duration units
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_ACTIVE_SCAN_DURATION = 3;
	
	/**
	 * The time the coordinator will wait for a second end device bind request to arrive.
	 * min : 1
	 * def : 60
	 * max :
	 * Units : seconds
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_END_DEVICE_BIND_TIMEOUT = 60;
	
	/**
	 * The number of PAN id conflict reports that must be received by the network manager within one minute to trigger a PAN id change.
	 * min : 1
	 * def : 1
	 * max : 63
	 * Units : reports per minute
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_PAN_ID_CONFLICT_REPORT_THRESHOLD = 1;
	
	/**
	 * The timeout value in minutes for how long the Trust Center or a normal node waits for the ZigBee Request Key to complete. 
	 * On the Trust Center this controls whether or not the device buffers the request, waiting for a matching pair of ZigBee Request Key. 
	 * If the value is non-zero, the Trust Center buffers and waits for that amount of time. 
	 * If the value is zero, the Trust Center does not buffer the request and immediately responds to the request. Zero is the most compliant behavior.
	 * min : 0
	 * def : 0
	 * max : 10
	 * Units : minutes
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_REQUEST_KEY_TIMEOUT = 0;
	
	/**
	 * This value indicates the size of the runtime modifiable certificate table. 
	 * Normally certificates are stored in MFG tokens but this table can be used to field upgrade devices with new Smart Energy certificates. 
	 * This value cannot be set, it can only be queried.
	 * min : 0
	 * def : 1
	 * max : 1
	 * Units : 
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_CERTIFICATE_TABLE_SIZE = 1;
	
	/**
	 * This is a bitmask that controls which incoming ZDO request messages are passed to the application. 
	 * The bits are defined in the EmberZdoConfigurationFlags enumeration. 
	 * To see if the application is required to send a ZDO response in reply to an incoming message, 
	 * the application must check the APS options bitfield within the incomingMessageHandler callback to see if the EMBER_APS_OPTION_ZDO_RESPONSE_REQUIRED flag is set.
	 * min : 0
	 * def : 0
	 * max : 255
	 * Units :
	 * ram cost : 0
	 */
	public static int EZSP_CONFIG_APPLICATION_ZDO_FLAGS = 0;
	
	/**
	 * The maximum number of broadcasts during a single broadcast timeout period.
	 * min : 15
	 * def : 15
	 * max : 254
	 * Units : entries
	 * ram cost : 6
	 */
	public static int EZSP_CONFIG_BROADCAST_TABLE_SIZE = 15;
	
	/**
	 * The size of the MAC filter list table.
	 * min : 0
	 * def : 0
	 * max : 254
	 * Units : entries
	 * ram cost : 2
	 */
	public static int EZSP_CONFIG_MAC_FILTER_TABLE_SIZE = 0;
	
	/**
	 * The number of supported networks.
	 * min : 1
	 * def : 2
	 * max : 2
	 * Units : entries
	 * ram cost : 72
	 */
	public static int EZSP_CONFIG_SUPPORTED_NETWORK = 2;
	
	/**
	 * Whether multicasts are sent to the RxOnWhenIdle=TRUE address (0xFFFD) or the sleepy broadcast address (0xFFFF). 
	 * The RxOnWhenIdle=TRUE address is the ZigBee compliant destination for multicasts.
	 * min : 
	 * def : FALSE
	 * max :
	 * Units:
	 * ram cost :
	 */
	public static int EZSP_CONFIG_SEND_MULTICASTS_TO_SLEEPY_ADDRESS = EzspBoolean.FALSE;
	
	/**
	 * ZLL group address initial configuration.
	 * min : 0
	 * def : 0
	 * max : 255
	 * Units :
	 * ram cost:
	 */
	public static int EZSP_CONFIG_ZLL_GROUP_ADDRESSES = 0;
	
	/**
	 * ZLL rssi threshold initial configuration.
	 * min : -128
	 * def : -128
	 * max : 127
	 * Units : 
	 * ram cost :
	 */
	public static int EZSP_CONFIG_ZLL_RSSI_THRESHOLD = -128;
	
}
