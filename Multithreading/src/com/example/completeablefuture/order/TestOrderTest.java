package com.example.completeablefuture.order;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(10);
		Future<Order> f1=service.submit(new TestTaskOrder());
		try {
			Order order=f1.get();
			System.out.println("order test class "+order);
			Future<Order> f2=service.submit(new TestTaskOrder());
			 order=f2.get();
			 System.out.println("test order 2"+order);
			 Future<Order> f3=service.submit(new TestTaskThree());
			 order=f3.get();
			 System.out.println("test order three "+order);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static class TestTaskOrder implements Callable<Order>
	{

		@Override
		public Order call() throws Exception {
			// TODO Auto-generated method stub
			return new Order();
		}
		
	}
	static class TestTaskOrderOne implements Callable<Order>
	{

		@Override
		public Order call() throws Exception {
			// TODO Auto-generated method stub
			return new Order();
		}
		
	}
	static class TestTaskThree implements Callable<Order>
	{

		@Override
		public Order call() throws Exception {
			// TODO Auto-generated method stub
			return new Order();
		}
		
	}
	
	static class Order
	{
		public void m1()
		{
			System.out.println("order method");
		}
	}

}
