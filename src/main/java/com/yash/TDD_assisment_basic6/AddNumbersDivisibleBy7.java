package com.yash.TDD_assisment_basic6;

public class AddNumbersDivisibleBy7 {
	
	public long add()
	{
		int sum=0;
		for(int i=100;i<=200;i++)
		{
			if(i%7==0)
			sum=sum+i;
		}
		return sum;
	}

}
