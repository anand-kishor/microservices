package com.example.conditionandlock;

public class TestConditionAndLock {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test test=new Test();
		Test test1=new Test();
				//TestConditionAndLock test2=new TestConditionAndLock();
				test1.method2();
				test.method2();
				//test2.method2();
		//Thread t1=new Thread(test);
		//Thread t2=new Thread(test);
		//t1.start();
		//t2.start();

	}

}
