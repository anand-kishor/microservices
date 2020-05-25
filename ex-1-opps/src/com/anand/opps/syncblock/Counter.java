package com.anand.opps.syncblock;

 class Counter implements Runnable {
	 private static int count;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=2000;i++)
		{
			increments();
		}
		
	}

	private static synchronized void increments() {
		// TODO Auto-generated method stub
		String tname=Thread.currentThread().getName();
		System.out.println(tname);
		count++;
		
	}
	public static int getCount()
	{
		return count;
	}

}
