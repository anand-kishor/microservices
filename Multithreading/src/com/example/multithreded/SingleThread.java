package com.example.multithreded;

public class SingleThread {
	
	int value=50;
	public void m1()
	{
		for(int i=1;i<12;i++)
		{
			System.out.println(i);
		}
		System.out.println(value);
	}

}
