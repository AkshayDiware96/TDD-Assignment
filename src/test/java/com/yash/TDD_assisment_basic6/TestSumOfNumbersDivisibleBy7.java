package com.yash.TDD_assisment_basic6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDD_assisment_basic6.AddNumbersDivisibleBy7;

public class TestSumOfNumbersDivisibleBy7 {

	AddNumbersDivisibleBy7 t = new AddNumbersDivisibleBy7();

	@Test
	public void test_TestSumOfNumbers1() {
		assertEquals(t.add(), 2107);
	}

	@Test
	public void test_TestSumOfNumbers2() {
		assertEquals(t.add(), 2107);
	}

}
