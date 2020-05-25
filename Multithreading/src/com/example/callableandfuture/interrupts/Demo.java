package com.example.callableandfuture.interrupts;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new TaskDemo());
		t1.start();

	}

}
class TaskDemo implements Runnable{
private Object obj=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <50; i++) {
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}