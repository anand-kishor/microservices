package com.anand.opps.dedlock;

import java.util.LinkedList;
import java.util.Queue;

public class DeadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<Integer>();
		
       Producer producer=new Producer(queue);
       Consumer consumer=new Consumer();
       
       Thread pt=new Thread(producer);
       Thread ct=new Thread(consumer);
       pt.start();
       ct.start();
	}

}
