package com.zigbee.util.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.zigbee.util.ByteUtils;

public class ByteUtilsTest {

	
	@Test
	public void testByteToHex(){
		assertEquals("0x00", ByteUtils.byteToHex((byte) 0x00));
		assertEquals("0x01", ByteUtils.byteToHex((byte) 0x01));
		assertEquals("0x0A", ByteUtils.byteToHex((byte) 0x0A));
		assertEquals("0xB1", ByteUtils.byteToHex((byte) 0xB1));
		assertEquals("0xDE", ByteUtils.byteToHex((byte) 0xDE));
		assertEquals("0xFF", ByteUtils.byteToHex((byte) 0xFF));
	}
	
	@Test
	public void testGetBit(){
		assertEquals(0,ByteUtils.getBit((byte) 0x00, 1));
		assertEquals(0,ByteUtils.getBit((byte) 0x02, 0));
		assertEquals(1,ByteUtils.getBit((byte) 0x0A, 3));
		assertEquals(1,ByteUtils.getBit((byte) 0x0F, 2));
		assertEquals(1,ByteUtils.getBit((byte) 0x0A, 1));
		assertEquals(1,ByteUtils.getBit((byte) 0x12, 4));
		assertEquals(1,ByteUtils.getBit((byte) 0x1A, 3));
		assertEquals(0,ByteUtils.getBit((byte) 0x1F, 7));
		assertEquals(1,ByteUtils.getBit((byte) 0xFF, 4));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetBitException(){
		assertEquals(1,ByteUtils.getBit((byte) 0xFF, -1));
		assertEquals(1,ByteUtils.getBit((byte) 0xFF, 8));
		assertEquals("",ByteUtils.byteArrayToHex(new byte[]{}));
		assertEquals((byte)0x00, ByteUtils.setBit((byte)0xFF, 0, false));
	}
	
	@Test
	public void testByteArrayToHex(){
		assertEquals("0x00,0x01,0x22,0xAF",ByteUtils.byteArrayToHex(new byte[]{(byte) 0x00, (byte)0x01, (byte)0x22, (byte)0xAF}));
		assertEquals("0xFF",ByteUtils.byteArrayToHex(new byte[]{(byte) 0xFF}));
	}
	
	@Test
	public void testSetBit(){
		assertEquals((byte)0x00, ByteUtils.setBit((byte) 0x01, 0, false));
		assertEquals((byte)0x01, ByteUtils.setBit((byte) 0x00, 0, true));
		assertEquals((byte)0x5D, ByteUtils.setBit((byte) 0x55, 3, true));
		assertEquals((byte)0x5D, ByteUtils.setBit((byte) 0x5D, 3, true));
		assertEquals((byte)0xFF, ByteUtils.setBit((byte) 0x7F, 7, true));
		assertEquals((byte)0x7F, ByteUtils.setBit((byte) 0xFF, 7, false));
		assertEquals((byte)0xFB, ByteUtils.setBit((byte) 0xFF, 2, false));
	}
	
}
