package com.example.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int coreCount=Runtime.getRuntime().availableProcessors();
		//ExecutorService service=Executors.newFixedThreadPool(coreCount);
		//ExecutorService service=Executors.newFixedThreadPool(10);
		ExecutorService service=Executors.newFixedThreadPool(100);
		for(int i=1;i<100;i++)
		{
		//Thread thread=new Thread(new Task());
			
		service.execute(new Task());
		//thread.start();
		service.isShutdown();
		}
				System.out.println("thread name :"+Thread.currentThread().getName());

	}
static class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("THread name :"+Thread.currentThread().getName());
	}
	
}
}
