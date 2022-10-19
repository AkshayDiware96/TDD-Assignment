package com.yash.TDD_assisment_basic7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDD_assisment_basic7.FindBinaryEquivalent;

public class TestBinaryEquivalent {
	
	FindBinaryEquivalent binary = new FindBinaryEquivalent();
	@Test
	public void testBianryEquivalentfor3()
	{
		assertEquals(binary.findBinaryEquivalent(3), "0011");
	}

	@Test
	public void testBianryEquivalentfor8()
	{
		assertEquals(binary.findBinaryEquivalent(8), "1000");
	}
}
