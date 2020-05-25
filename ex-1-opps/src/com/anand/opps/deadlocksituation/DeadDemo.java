package com.anand.opps.deadlocksituation;

public class DeadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object lock1=new Object();
		Object lock2=new Object();
		MyThread1 r1=new MyThread1(lock1,lock2);
		MyThread2 r2=new MyThread2(lock1,lock2);
		
		Thread t1=new Thread(r1,"T1");
		Thread t2=new Thread(r2,"T2");
		t1.start();
		t2.start();
	}

}
