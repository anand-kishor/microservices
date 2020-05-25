package com.example.multithreded;

public class RunableThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<20;i++)
		{
			//System.out.println(Thread.currentThread().getName());
			//System.out.println("Hello");
			System.out.println(i);
		
		}
		for(int i=0;i<20;i++)
		{
			//System.out.println(Thread.currentThread().getName());
			//System.out.println("Hello");
			System.out.println(i++);
		
		}
	}
		
	
	
	}


