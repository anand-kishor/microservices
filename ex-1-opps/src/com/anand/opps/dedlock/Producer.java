package com.anand.opps.dedlock;

import java.util.Queue;
import java.util.Random;

class Producer implements Runnable {
	 private Queue<Integer> queue;
	 private final int MAX_SIZE=5;
	 
	 public Producer(Queue<Integer> queue) {
		// TODO Auto-generated constructor stub
		 this.queue=queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
		synchronized(queue) {
	
			while(queue.size()==5)
			{
				try {
					System.out.println("produer is waiting for object for consumer can consume");
					queue.wait();
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		Random random=new Random();
		int data=random.nextInt();
		queue.add(data);
		System.out.println("produced data !");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		queue.notify();
		}
		
	}

}
