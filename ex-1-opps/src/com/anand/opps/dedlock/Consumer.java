package com.anand.opps.dedlock;

import java.util.Queue;

public class Consumer implements Runnable {
	 private Queue<Integer> queue;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			synchronized(queue)
			{
				while(queue.isEmpty())
				{
					System.out.println("consumer is waiting for produce data by producer");
					
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				int data=queue.poll();
				System.out.println("consumer consume data : "+data);
				queue.notify();
			}
		}
		
	}

}
