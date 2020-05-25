package com.example.callableandfuture;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndWriteLock {
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	private ReentrantReadWriteLock.ReadLock readLock=lock.readLock();
	private ReentrantReadWriteLock.WriteLock writeLock=lock.writeLock();
	private void readSource()
	{
		readLock.lock();
		System.out.println("read lock");
		readLock.unlock();
	}
	private void writeResource()
	{
		readLock.lock();
		System.out.println("read lock");
		readLock.unlock();
	}

	public static void main(String[] args) {
		ReentrantReadWriteLock obj = null;
		// TODO Auto-generated method stub
		//Thread t1=new Thread(()-> obj.readResource());t1.start();
		//Thread t2=new Thread(()->obj.readResource());t2.start();
		//Thread t3=new Thread(()->obj.writeResouce());t3.start();
		//Thread t4=new Thread(()->obj.writeResouce());t4.start();

	}

}
