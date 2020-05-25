package com.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("runnable interface ");
				
			}});
		thread.run();
		Thread t1=new Thread(() ->System.out.println("inside run method"));
		t1.run();
		
		Thread t2=new Thread(()->System.out.println("Hello run implemented method"));
		t2.run();
	

	}

}
