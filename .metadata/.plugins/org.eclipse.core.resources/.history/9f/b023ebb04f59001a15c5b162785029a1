package com.example.callableandfuture;

import java.util.concurrent.locks.ReentrantLock;

public class ExampleReentrantLock {
	private static ReentrantLock lock=new ReentrantLock();
	public static void accessResource()
	{
		lock.lock();
		System.out.println("system is locked");
		lock.unlock();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(()->accessResource());t1.start();
		Thread t2=new Thread(()->accessResource());t2.start();
		Thread t3=new Thread(()->accessResource());t3.start();
		Thread t4=new Thread(()->accessResource());t4.start();
		Thread t5=new Thread(()->accessResource());t5.start();
		

	}

}
