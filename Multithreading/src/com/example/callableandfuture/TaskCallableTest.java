package com.example.callableandfuture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TaskCallableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(10);
		List<Future> futureList=new ArrayList<Future>();
		for (int i = 0; i < 100; i++) {
		
		Future<Integer> future=service.submit(new Task());
		futureList.add(future);
		}
		for (int i = 0; i <100; i++) {
			
		Future<Integer> future=futureList.get(i);
		
		try {
			//Integer results=future.get();
			Integer results;
			try {
				results = future.get(1,TimeUnit.SECONDS);
			
			System.out.println("add future results:"+" "+i+"="+results);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread name :"+Thread.currentThread().getName());
		}

	}
	
	static class Task implements Callable<Integer>
	{

		@Override
		public Integer call() throws Exception {
			// TODO Auto-generated method stub
			return new Random().nextInt();
		}
		
	}

}
