package com.anand.opps.multithreding;

 class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"\t"+"i="+i);
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
