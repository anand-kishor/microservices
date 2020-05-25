package com.anand.opps.multithreding;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyClass t1=new MyClass();
		//MyClass t2=new MyClass();
		//t1.start();
		//t2.start();
		MyThread t3=new MyThread();
		//MyThread t4=new MyThread();
		Thread t=new Thread(t3,"T1");
		Thread t2=new Thread(t3,"T2");
		t.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t);
		t.start();
		t2.start();
		
		
		
				

	}

}
