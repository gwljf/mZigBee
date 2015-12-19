package com.ezsp.structure.test;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.ezsp.structure.EmberApsFrame;
import com.ezsp.structure.EmberApsOption;
import com.ezsp.value.details.ApplicationProfileId;
import com.ezsp.value.details.ClusterId;
import com.ezsp.value.details.EndPointId;
import com.ezsp.value.details.GroupId;
import com.ezsp.value.details.SequenceNumber;

public class EmberApsFrameTest {

	private static Logger logger = LogManager.getLogger(EmberApsFrameTest.class.getName());
	
	@Test
	public void testEmberApsFrame(){
		
		String emberApsFrameStr = "\n{ EmberApsFrame:\n" +
                "\t{ ApplicationProfileId : 0x02,0xFF},\n" +
                "\t{ ClusterId : 0xFA,0x0B},\n" +
                "\tsrcEndpoint: ({ EndPointId : 0x17}),\n" +
                "\tdstEndpoint: ({ EndPointId : 0x28}),\n" +
                "\t{ GroupId : 0x11,0x12},\n" +
                "\t{ EmberApsOption : EMBER_APS_OPTION_ENABLE_ADDRESS_DISCOVERY},\n" +
                "\t{ SequenceNumber : 0xAA}\n" +
                "}";
		
		ApplicationProfileId appProfileId = new ApplicationProfileId(new byte[]{(byte)0x02, (byte)0xFF});
		ClusterId clusterId = new ClusterId(new byte[]{(byte)0xFA, (byte)0x0B});
		EndPointId sourceEndpoint = new EndPointId((byte)0x17);
		EndPointId destinationpoint = new EndPointId((byte)0x28);
		EmberApsOption options = new EmberApsOption(EmberApsOption.EMBER_APS_OPTION_ENABLE_ADDRESS_DISCOVERY);
		GroupId groupId = new GroupId(new byte[]{(byte)0x11, (byte)0x12});
		SequenceNumber sequenceNumber = new SequenceNumber((byte)0xAA);
		EmberApsFrame emberApsFrame = new EmberApsFrame(appProfileId,clusterId,sourceEndpoint,destinationpoint,options,groupId,sequenceNumber);
		logger.debug(emberApsFrame.printDetails());
		assertEquals(emberApsFrameStr, emberApsFrame.printDetails());
	}
}
