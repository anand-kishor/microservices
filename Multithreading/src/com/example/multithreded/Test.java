package com.example.multithreded;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Hello multithreding"); SingleThread t1=new
		 * SingleThread(); t1.m1();
		 */
		RunableThread thread=new RunableThread();
		//Thread t2=new Thread(thread);
		Thread t1=new Thread(thread);
		t1.start();
		
	}

}
