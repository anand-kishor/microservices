package com.anand.opps.syncblock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter count=new Counter();
		Counter count1=new Counter();
		Thread t1=new Thread(count);
		Thread t2=new Thread(count1);
				
				t1.start();
		t2.start();
		try {
			t1.join(5000);
	
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("counter final value :"+Counter.getCount());
	}

}
