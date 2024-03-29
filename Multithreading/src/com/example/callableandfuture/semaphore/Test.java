package com.example.callableandfuture.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Semaphore semaphore=new Semaphore(3);
		ExecutorService service=Executors.newFixedThreadPool(50);
		IntStream.of(1000).forEach(i->service.execute(new Task(semaphore)));
		service.shutdown();
		service.awaitTermination(1, TimeUnit.SECONDS);

	}

}
class Task implements Runnable{

	private Semaphore semaphore;

	

	public Task(Semaphore semaphore2) {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() {
		//Object semaphore;
		// TODO Auto-generated method stub
		semaphore.acquireUninterruptibly(2);
		semaphore.release(2);
		
	}
	
}
