package com.anand.opps.synnc;

 class MyThread implements Runnable {
	private int count;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=2000;i++)
		{
			/*
			 * synchronized(this) { count++; }
			 */
			increment();
		}
	}
	private synchronized void increment() {
		// TODO Auto-generated method stub
		count++;
		
	}
	public int getCount()
	{
		return count;
	}

}
