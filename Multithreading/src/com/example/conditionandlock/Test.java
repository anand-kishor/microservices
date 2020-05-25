package com.example.conditionandlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test extends Thread {
	private Lock lock=new ReentrantLock();
	private Condition conditionLock=lock.newCondition();
	public void method1() throws InterruptedException 
	{
		lock.lock();
		try {
			conditionLock.await();
			System.out.println("await method");
		} finally {
			lock.unlock();
		}
	    
	}
	public void method2()
	{
		lock.lock();
		try {
		conditionLock.signal();
		System.out.println("signal method");
	}
	finally {
		lock.unlock();
	}
	}


}
