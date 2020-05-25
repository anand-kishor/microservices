package com.anand.opps.deadlocksituation;

public class MyThread1 implements Runnable {
	private Object lock1;
	private Object lock2;
	

	public MyThread1(Object lock1, Object lock2) {
		
		this.lock1 = lock1;
		this.lock2 = lock2;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(lock2)
		{
			System.out.println(Thread.currentThread().getName()+" "+"synchronised lock2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(lock1)
			{
				System.out.println(Thread.currentThread().getName()+" "+"synchronised lock1");
			}
		}
		
	}


}