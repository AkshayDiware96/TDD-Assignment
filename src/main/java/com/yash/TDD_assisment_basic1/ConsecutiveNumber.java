package com.yash.TDD_assisment_basic1;

public class ConsecutiveNumber {
	public int add(int start, int end) {

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
