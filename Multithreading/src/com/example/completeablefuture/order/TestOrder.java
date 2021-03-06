package com.example.completeablefuture.order;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(10);
		try {
		Future<Integer> future=service.submit(new Task());
		
		
			Integer results=future.get();
			System.out.println("future results: "+results);
			Future<Integer> future1=service.submit(new TaskZero());
			Integer zero=future1.get();
			System.out.println("zero results "+zero);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


static class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("main");
		return new Random().nextInt();
	}
	}
static class TaskZero implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("zero");
		return new Random().nextInt();
	}
	}
static class TaskOne implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("One");
		return new Random().nextInt();
	}
	}
static class TaskTwo implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("two");
		return new Random().nextInt();
	}
	}
static class TaskThree implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Three");
		return new Random().nextInt();
	}
	}
static class TaskFour implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("four");
		return new Random().nextInt();
	}
	}
}
