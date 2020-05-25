package com.anand.opps.synnc;

public class SyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread r=new MyThread();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		
		t1.start();
		t2.start();
		
		try {
			t1.join(2000);
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("get count number "+r.getCount());

	}

}
