package com.anand.opps.deadlocksituation.mainmethod;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread currentThread=Thread.currentThread();
		System.out.println(currentThread.getName()+" "+"start thread");
		
		
		  try 
		  { 
			  //currentThread.join();
			  currentThread.join(10000);
		  } 
		  catch (InterruptedException e)
		  {
		   e.printStackTrace();
		  }
		 
		
		System.out.println(currentThread.getName()+" "+"end thread");

	}

}
