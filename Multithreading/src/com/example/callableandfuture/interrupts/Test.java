package com.example.callableandfuture.interrupts;

import java.util.Iterator;
import java.util.concurrent.Callable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread taskThread=new Thread(new Task());
		taskThread.start();
		System.out.println("long running task");

	}
	

}
class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <100; i++) {
			System.out.println("thread is interrupted "+"thread-"+i);
			processThisNumber(10);
			if(Thread.currentThread().isInterrupted())
			{
				Thread.interrupted();
				//throw new InterruptedException();
			System.out.println("thread is interrupted "+"thread-"+i);
			}
		}
		
	}

	private void processThisNumber(int i) {
		// TODO Auto-generated method stub
		System.out.println("thread is interrupted "+i);
		
	}
	
}
class Integer implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i <50; i++) {
			if(Thread.currentThread().isInterrupted())
			{
				throw new InterruptedException();
			}
			
		}
		return null;
	}}
