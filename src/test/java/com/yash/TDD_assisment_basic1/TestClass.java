package com.yash.TDD_assisment_basic1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDD_assisment_basic1.ConsecutiveNumber;

public class TestClass {
	ConsecutiveNumber cn = new ConsecutiveNumber();

	@Test
	public void test_consecutive_number() {

		assertEquals(cn.add(1, 10), 55);
	}

	@Test
	public void test_consecutive_number2() {

		assertEquals(cn.add(11, 20), 55);
	}
}
