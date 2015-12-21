package com.ezsp.named.values;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zigbee.util.ByteUtils;

/**
 * int8u : Status values used by EZSP.
 *
 */
public class EzspStatus {
	
	private static Logger logger = LogManager.getLogger(EzspStatus.class.getName());
	
	private byte ezspStatus;
	
	public EzspStatus(byte _ezspStatus){
		this.ezspStatus = _ezspStatus;
	}
	
	public byte getEzspStatus(){
		return this.ezspStatus;
	}
	
	
	// Success.
	public static final byte EZSP_SUCCESS = (byte)0x00;
	
	// Fatal error.
	public static final byte EZSP_SPI_ERR_FATAL = (byte)0x10;
	
	// The Response frame of the current transaction indicates the NCP has reset.
	public static final byte EZSP_SPI_ERR_NCP_RESET = (byte)0x11;	
	
	// The NCP is reporting that the Command frame of the current transaction is oversized (the length byte is too large).
	public static final byte EZSP_SPI_ERR_OVERSIZED_EZSP_FRAME = (byte)0x12;
	
	// The Response frame of the current transaction indicates the previous transaction was aborted (nSSEL deasserted too soon).
	public static final byte EZSP_SPI_ERR_ABORTED_TRANSACTION = (byte)0x13;
	
	// The Response frame of the current transaction indicates the frame terminator is missing from the Command frame.
	public static final byte EZSP_SPI_ERR_MISSING_FRAME_TERMINATOR = (byte)0x14;	
	
	// The NCP has not provided a Response within the time limit defined by WAIT_SECTION_TIMEOUT.
	public static final byte EZSP_SPI_ERR_WAIT_SECTION_TIMEOUT = (byte)0x15;
	
	// The Response frame from the NCP is missing the frame terminator.
	public static final byte EZSP_SPI_ERR_NO_FRAME_TERMINATOR = (byte)0x16;
	
	// The Host attempted to send an oversized Command (the length byte is too large) and the AVR's spi-protocol.c blocked the transmission.
	public static final byte EZSP_SPI_ERR_EZSP_COMMAND_OVERSIZED = (byte)0x17;	
	
	// The NCP attempted to send an oversized Response (the length byte is too large) and the AVR's spi-protocol.c blocked the reception.
	public static final byte EZSP_SPI_ERR_EZSP_RESPONSE_OVERSIZED = (byte)0x18;
	
	// The Host has sent the Command and is still waiting for the NCP to send a Response.
	public static final byte EZSP_SPI_WAITING_FOR_RESPONSE = (byte)0x19;
	
	// The NCP has not asserted nHOST_INT within the time limit defined by WAKE_HANDSHAKE_TIMEOUT.
	public static final byte EZSP_SPI_ERR_HANDSHAKE_TIMEOUT = (byte)0x1A;
	
	// The NCP has not asserted nHOST_INT after an NCP reset within the time limit defined by STARTUP_TIMEOUT.
	public static final byte EZSP_SPI_ERR_STARTUP_TIMEOUT = (byte)0x1B;
	
	// The Host attempted to verify the SPI Protocol activity and version number, and the verification failed.
	public static final byte EZSP_SPI_ERR_STARTUP_FAIL = (byte)0x1C;
	
	// The Host has sent a command with a SPI Byte that is unsupported by the current mode the NCP is operating in.
	public static final byte EZSP_SPI_ERR_UNSUPPORTED_SPI_COMMAND = (byte)0x1D;	
	
	// Operation not yet complete.
	public static final byte EZSP_ASH_IN_PROGRESS = (byte)0x20;
	
	// Fatal error detected by host.
	public static final byte EZSP_ASH_HOST_FATAL_ERROR = (byte)0x21;
	
	// Fatal error detected by NCP.
	public static final byte EZSP_ASH_NCP_FATAL_ERROR = (byte)0x22;	
	
	// Tried to send DATA frame too long.
	public static final byte EZSP_ASH_DATA_FRAME_TOO_LONG = (byte)0x23;
	
	// Tried to send DATA frame too short.
	public static final byte EZSP_ASH_DATA_FRAME_TOO_SHORT = (byte)0x24;
	
	// No space for tx'ed DATA frame.
	public static final byte EZSP_ASH_NO_TX_SPACE = (byte)0x25;	
	
	// No space for rec'd DATA frame.
	public static final byte EZSP_ASH_NO_RX_SPACE = (byte)0x26;
	
	// No receive data available.
	public static final byte EZSP_ASH_NO_RX_DATA = (byte)0x27;
	
	// Not in Connected state.
	public static final byte EZSP_ASH_NOT_CONNECTED = (byte)0x28;
	
	// The NCP received a command before the EZSP version had been set.
	public static final byte EZSP_ERROR_VERSION_NOT_SET = (byte)0x30;
	
	// The NCP received a command containing an unsupported frame ID.
	public static final byte EZSP_ERROR_INVALID_FRAME_ID = (byte)0x31;
	
	// The direction flag in the frame control field was incorrect.
	public static final byte EZSP_ERROR_WRONG_DIRECTION = (byte)0x32;	
	
	// The truncated flag in the frame control field was set, indicating there was not enough memory available to complete the response or that the response would have exceeded the maximum EZSP frame length.
	public static final byte EZSP_ERROR_TRUNCATED = (byte)0x33;
	
	// The overflow flag in the frame control field was set, indicating one or more callbacks occurred since the previous response and there was not enough memory available to report them to the Host.
	public static final byte EZSP_ERROR_OVERFLOW = (byte)0x34;
	
	// Insufficient memory was available.
	public static final byte EZSP_ERROR_OUT_OF_MEMORY = (byte)0x35;	
	
	// The value was out of bounds.
	public static final byte EZSP_ERROR_INVALID_VALUE = (byte)0x36;
	
	// The configuration id was not recognized.
	public static final byte EZSP_ERROR_INVALID_ID = (byte)0x37;
	
	// Configuration values can no longer be modified.
	public static final byte EZSP_ERROR_INVALID_CALL = (byte)0x38;	
	
	// The NCP failed to respond to a command.
	public static final byte EZSP_ERROR_NO_RESPONSE = (byte)0x39;
	
	// The length of the command exceeded the maximum EZSP frame length.
	public static final byte EZSP_ERROR_COMMAND_TOO_LONG = (byte)0x40;
	
	// The UART receive queue was full causing a callback response to be dropped.
	public static final byte EZSP_ERROR_QUEUE_FULL = (byte)0x41;
	
	// The command has been filtered out by NCP.
	public static final byte EZSP_ERROR_COMMAND_FILTERED = (byte)0x42;
	
	// Incompatible ASH version
	public static final byte EZSP_ASH_ERROR_VERSION = (byte)0x50;
	
	// Exceeded max ACK timeouts
	public static final byte EZSP_ASH_ERROR_TIMEOUTS = (byte)0x51;	
	
	// Timed out waiting for RSTACK
	public static final byte EZSP_ASH_ERROR_RESET_FAIL = (byte)0x52;
	
	// Unexpected ncp reset
	public static final byte EZSP_ASH_ERROR_NCP_RESET = (byte)0x53;
	
	// Serial port initialization failed
	public static final byte EZSP_ASH_ERROR_SERIAL_INIT = (byte)0x54;	
	
	// Invalid ncp processor type.
	public static final byte EZSP_ASH_ERROR_NCP_TYPE = (byte)0x55;
	
	// Invalid ncp reset method
	public static final byte EZSP_ASH_ERROR_RESET_METHOD = (byte)0x56;
	
	// XON/XOFF not supported by host driver
	public static final byte EZSP_ASH_ERROR_XON_XOFF = (byte)0x57;	
	
	// ASH protocol started
	public static final byte EZSP_ASH_STARTED = (byte)0x70;
	
	// ASH protocol connected
	public static final byte EZSP_ASH_CONNECTED = (byte)0x71;
	
	// ASH protocol disconnected
	public static final byte EZSP_ASH_DISCONNECTED = (byte)0x72;
	
	// Timer expired waiting for ack
	public static final byte EZSP_ASH_ACK_TIMEOUT = (byte)0x73;
	
	// Frame in progress cancelled
	public static final byte EZSP_ASH_CANCELLED = (byte)0x74;
	
	// Received frame out of sequence
	public static final byte EZSP_ASH_OUT_OF_SEQUENCE = (byte)0x75;
	
	// Received frame with CRC error
	public static final byte EZSP_ASH_BAD_CRC = (byte)0x76;	
	
	// Received frame with comm error
	public static final byte EZSP_ASH_COMM_ERROR = (byte)0x77;
	
	// Received frame with bad ackNum
	public static final byte EZSP_ASH_BAD_ACKNUM = (byte)0x78;
	
	// Received frame shorter than minimum
	public static final byte EZSP_ASH_TOO_SHORT = (byte)0x79;	
	
	// Received frame longer than maximum
	public static final byte EZSP_ASH_TOO_LONG = (byte)0x7A;
	
	// Received frame with illegal control byte
	public static final byte EZSP_ASH_BAD_CONTROL = (byte)0x7B;
	
	// Received frame with illegal length for its type
	public static final byte EZSP_ASH_BAD_LENGTH = (byte)0x7C;	
	
	// No reset or error
	public static final byte EZSP_ASH_NO_ERROR = (byte)0xFF;
	
	
	
	
	public String printDetails(){
		switch(this.ezspStatus){
			case EZSP_SUCCESS:
				return "{ EzspStatus : EZSP_SUCCESS}";
			case EZSP_SPI_ERR_FATAL:
				return "{ EzspStatus : EZSP_SPI_ERR_FATAL}";
			case EZSP_SPI_ERR_NCP_RESET:
				return "{ EzspStatus : EZSP_SPI_ERR_NCP_RESET}";
			case EZSP_SPI_ERR_OVERSIZED_EZSP_FRAME:
				return "{ EzspStatus : EZSP_SPI_ERR_OVERSIZED_EZSP_FRAME}";
			case EZSP_SPI_ERR_ABORTED_TRANSACTION:
				return "{ EzspStatus : EZSP_SPI_ERR_ABORTED_TRANSACTION}";
			case EZSP_SPI_ERR_MISSING_FRAME_TERMINATOR:
				return "{ EzspStatus : EZSP_SPI_ERR_MISSING_FRAME_TERMINATOR}";
			case EZSP_SPI_ERR_WAIT_SECTION_TIMEOUT:
				return "{ EzspStatus : EZSP_SPI_ERR_WAIT_SECTION_TIMEOUT}";
			case EZSP_SPI_ERR_NO_FRAME_TERMINATOR:
				return "{ EzspStatus : EZSP_SPI_ERR_NO_FRAME_TERMINATOR}";
			case EZSP_SPI_ERR_EZSP_COMMAND_OVERSIZED:
				return "{ EzspStatus : EZSP_SPI_ERR_EZSP_COMMAND_OVERSIZED}";
			case EZSP_SPI_ERR_EZSP_RESPONSE_OVERSIZED:
				return "{ EzspStatus : EZSP_SPI_ERR_EZSP_RESPONSE_OVERSIZED}";
			case EZSP_SPI_WAITING_FOR_RESPONSE:
				return "{ EzspStatus : EZSP_SPI_WAITING_FOR_RESPONSE}";
			case EZSP_SPI_ERR_HANDSHAKE_TIMEOUT:
				return "{ EzspStatus : EZSP_SPI_ERR_HANDSHAKE_TIMEOUT}";
			case EZSP_SPI_ERR_STARTUP_TIMEOUT:
				return "{ EzspStatus : EZSP_SPI_ERR_STARTUP_TIMEOUT}";
			case EZSP_SPI_ERR_STARTUP_FAIL:
				return "{ EzspStatus : EZSP_SPI_ERR_STARTUP_FAIL}";
			case EZSP_SPI_ERR_UNSUPPORTED_SPI_COMMAND:
				return "{ EzspStatus : EZSP_SPI_ERR_UNSUPPORTED_SPI_COMMAND}";
			case EZSP_ASH_IN_PROGRESS:
				return "{ EzspStatus : EZSP_ASH_IN_PROGRESS}";
			case EZSP_ASH_HOST_FATAL_ERROR:
				return "{ EzspStatus : EZSP_ASH_HOST_FATAL_ERROR}";
			case EZSP_ASH_NCP_FATAL_ERROR:
				return "{ EzspStatus : EZSP_ASH_NCP_FATAL_ERROR}";
			case EZSP_ASH_DATA_FRAME_TOO_LONG:
				return "{ EzspStatus : EZSP_ASH_DATA_FRAME_TOO_LONG}";
			case EZSP_ASH_DATA_FRAME_TOO_SHORT:
				return "{ EzspStatus : EZSP_ASH_DATA_FRAME_TOO_SHORT}";
			case EZSP_ASH_NO_TX_SPACE:
				return "{ EzspStatus : EZSP_ASH_NO_TX_SPACE}";
			case EZSP_ASH_NO_RX_SPACE:
				return "{ EzspStatus : EZSP_ASH_NO_RX_SPACE}";
			case EZSP_ASH_NO_RX_DATA:
				return "{ EzspStatus : EZSP_ASH_NO_RX_DATA}";
			case EZSP_ASH_NOT_CONNECTED:
				return "{ EzspStatus : EZSP_ASH_NOT_CONNECTED}";
			case EZSP_ERROR_VERSION_NOT_SET:
				return "{ EzspStatus : EZSP_ERROR_VERSION_NOT_SET}";
			case EZSP_ERROR_INVALID_FRAME_ID:
				return "{ EzspStatus : EZSP_ERROR_INVALID_FRAME_ID}";
			case EZSP_ERROR_WRONG_DIRECTION:
				return "{ EzspStatus : EZSP_ERROR_WRONG_DIRECTION}";
			case EZSP_ERROR_TRUNCATED:
				return "{ EzspStatus : EZSP_ERROR_TRUNCATED}";
			case EZSP_ERROR_OVERFLOW:
				return "{ EzspStatus : EZSP_ERROR_OVERFLOW}";
			case EZSP_ERROR_OUT_OF_MEMORY:
				return "{ EzspStatus : EZSP_ERROR_OUT_OF_MEMORY}";
			case EZSP_ERROR_INVALID_VALUE:
				return "{ EzspStatus : EZSP_ERROR_INVALID_VALUE}";
			case EZSP_ERROR_INVALID_ID:
				return "{ EzspStatus : EZSP_ERROR_INVALID_ID}";
			case EZSP_ERROR_INVALID_CALL:
				return "{ EzspStatus : EZSP_ERROR_INVALID_CALL}";
			case EZSP_ERROR_NO_RESPONSE:
				return "{ EzspStatus : EZSP_ERROR_NO_RESPONSE}";
			case EZSP_ERROR_COMMAND_TOO_LONG:
				return "{ EzspStatus : EZSP_ERROR_COMMAND_TOO_LONG}";
			case EZSP_ERROR_QUEUE_FULL:
				return "{ EzspStatus : EZSP_ERROR_QUEUE_FULL}";
			case EZSP_ERROR_COMMAND_FILTERED:
				return "{ EzspStatus : EZSP_ERROR_COMMAND_FILTERED}";
			case EZSP_ASH_ERROR_VERSION:
				return "{ EzspStatus : EZSP_ASH_ERROR_VERSION}";
			case EZSP_ASH_ERROR_TIMEOUTS:
				return "{ EzspStatus : EZSP_ASH_ERROR_TIMEOUTS}";
			case EZSP_ASH_ERROR_RESET_FAIL:
				return "{ EzspStatus : EZSP_ASH_ERROR_RESET_FAIL}";
			case EZSP_ASH_ERROR_NCP_RESET:
				return "{ EzspStatus : EZSP_ASH_ERROR_NCP_RESET}";
			case EZSP_ASH_ERROR_SERIAL_INIT:
				return "{ EzspStatus : EZSP_ASH_ERROR_SERIAL_INIT}";
			case EZSP_ASH_ERROR_NCP_TYPE:
				return "{ EzspStatus : EZSP_ASH_ERROR_NCP_TYPE}";
			case EZSP_ASH_ERROR_RESET_METHOD:
				return "{ EzspStatus : EZSP_ASH_ERROR_RESET_METHOD}";
			case EZSP_ASH_ERROR_XON_XOFF:
				return "{ EzspStatus : EZSP_ASH_ERROR_XON_XOFF}";
			case EZSP_ASH_STARTED:
				return "{ EzspStatus : EZSP_ASH_STARTED}";
			case EZSP_ASH_CONNECTED:
				return "{ EzspStatus : EZSP_ASH_CONNECTED}";
			case EZSP_ASH_DISCONNECTED:
				return "{ EzspStatus : EZSP_ASH_DISCONNECTED}";
			case EZSP_ASH_ACK_TIMEOUT:
				return "{ EzspStatus : EZSP_ASH_ACK_TIMEOUT}";
			case EZSP_ASH_CANCELLED:
				return "{ EzspStatus : EZSP_ASH_CANCELLED}";
			case EZSP_ASH_OUT_OF_SEQUENCE:
				return "{ EzspStatus : EZSP_ASH_OUT_OF_SEQUENCE}";
			case EZSP_ASH_BAD_CRC:
				return "{ EzspStatus : EZSP_ASH_BAD_CRC}";
			case EZSP_ASH_COMM_ERROR:
				return "{ EzspStatus : EZSP_ASH_COMM_ERROR}";
			case EZSP_ASH_BAD_ACKNUM:
				return "{ EzspStatus : EZSP_ASH_BAD_ACKNUM}";
			case EZSP_ASH_TOO_SHORT:
				return "{ EzspStatus : EZSP_ASH_TOO_SHORT}";
			case EZSP_ASH_TOO_LONG:
				return "{ EzspStatus : EZSP_ASH_TOO_LONG}";
			case EZSP_ASH_BAD_CONTROL:
				return "{ EzspStatus : EZSP_ASH_BAD_CONTROL}";
			case EZSP_ASH_BAD_LENGTH:
				return "{ EzspStatus : EZSP_ASH_BAD_LENGTH}";
			case EZSP_ASH_NO_ERROR:
				return "{ EzspStatus : EZSP_ASH_NO_ERROR}";				
			default:
				logger.error("Can't handle this type of this type of EzspStatus : {}", ByteUtils.byte2Hex(this.ezspStatus));
				throw new IllegalArgumentException("Can't handle this type of EzspStatus");	
		}
	}

}
