package com.zigbee.util.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.zigbee.util.ByteUtils;

public class ByteUtilsTest {

	
	@Test
	public void testByteToHex(){
		assertEquals("0x00", ByteUtils.byte2Hex((byte) 0x00));
		assertEquals("0x01", ByteUtils.byte2Hex((byte) 0x01));
		assertEquals("0x0A", ByteUtils.byte2Hex((byte) 0x0A));
		assertEquals("0xB1", ByteUtils.byte2Hex((byte) 0xB1));
		assertEquals("0xDE", ByteUtils.byte2Hex((byte) 0xDE));
		assertEquals("0xFF", ByteUtils.byte2Hex((byte) 0xFF));
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
		assertEquals("",ByteUtils.byteArray2Hex(new byte[]{}));
		assertEquals((byte)0x00, ByteUtils.setBit((byte)0xFF, 0, false));
	}
	
	@Test
	public void testByteArrayToHex(){
		assertEquals("0x00,0x01,0x22,0xAF",ByteUtils.byteArray2Hex(new byte[]{(byte) 0x00, (byte)0x01, (byte)0x22, (byte)0xAF}));
		assertEquals("0xFF",ByteUtils.byteArray2Hex(new byte[]{(byte) 0xFF}));
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
	
	@Test
	public void testBoolToByte(){
		assertEquals((byte)0x00, ByteUtils.bool2Byte(false));
		assertEquals((byte)0x01, ByteUtils.bool2Byte(true));
	}
	
	@Test
	public void testByteToBool(){
		assertFalse(ByteUtils.byte2Bool((byte) 0x00));
		assertTrue(ByteUtils.byte2Bool((byte) 0x01));
		assertFalse(ByteUtils.byte2Bool((byte) 0xAA));
		assertTrue(ByteUtils.byte2Bool((byte) 0xFF));
	}
	
	@Test
	public void testInt2ByteArray(){
		assertArrayEquals(new byte[]{(byte)0x00, (byte)0x0A}, ByteUtils.int2ByteArray(10, 2));
		assertArrayEquals(new byte[]{(byte)0xFF, (byte)0x9C}, ByteUtils.int2ByteArray(-100, 2));
		assertArrayEquals(new byte[]{(byte)0x00, (byte)0x00}, ByteUtils.int2ByteArray(0, 2));
		assertArrayEquals(new byte[]{(byte)0x00, (byte)0x64, (byte)0x00, (byte)0x4E}, ByteUtils.int2ByteArray(6553678, 4));
		assertArrayEquals(new byte[]{(byte)0xFE, (byte)0x9A, (byte)0x20, (byte)0x12}, ByteUtils.int2ByteArray(-23453678, 4));
	}
	
	@Test
	public void testByteArray2Int(){
		System.out.println(ByteUtils.byteArray2Hex(ByteUtils.int2ByteArray(-100, 4)));
		assertEquals(10, ByteUtils.byteArray2Int(new byte[]{(byte)0x00, (byte)0x0A}));
		assertEquals(-100, ByteUtils.byteArray2Int(new byte[]{(byte)0xFF, (byte)0x9C}));
		assertEquals(0, ByteUtils.byteArray2Int(new byte[]{(byte)0x00, (byte)0x00}));
		assertEquals(6553678, ByteUtils.byteArray2Int(new byte[]{(byte)0x00, (byte)0x64, (byte)0x00, (byte)0x4E}));
		assertEquals(-23453678, ByteUtils.byteArray2Int(new byte[]{(byte)0xFE, (byte)0x9A, (byte)0x20, (byte)0x12}));
	}
	
	
}
