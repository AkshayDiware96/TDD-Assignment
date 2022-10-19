package com.yash.TDD_assisment_basic5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testsum {

	SumOfExpression s = new SumOfExpression();

	@Test
	public void test_sumOf_Expression1() {
		assertEquals(s.calculateSum(2, 3, 4, 5), -5);
	}

	@Test
	public void test_sumOf_Expression2() {
		assertEquals(s.calculateSum(2, 3, 4, 5), 5);
	}
}
