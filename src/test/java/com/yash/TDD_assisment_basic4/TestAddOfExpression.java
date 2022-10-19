package com.yash.TDD_assisment_basic4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestAddOfExpression
{
	Add a=new Add();
	
	@Test
	public void add1()
	{
		
		assertEquals(a.add(2,3,6), 11);
	}
	@Test 
	public void add2() {
		assertEquals(a.add(10, 10, 10), 40);
	}
	
}
	

	
	
