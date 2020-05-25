package com.anand.opps.group;

public class GroupDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyThread r=new MyThread();
		ThreadGroup a=new ThreadGroup("groupA");
		ThreadGroup b=new ThreadGroup("groupB");
		
		Thread t1=new Thread(a,r,"T1");
		Thread t2=new Thread(a,r,"T2");
		Thread t3=new Thread(a,r,"T3");
		Thread t4=new Thread(a,r,"T4");
		
		Thread t5=new Thread(b,r,"T5");
		Thread t6=new Thread(b,r,"T6");
		Thread t7=new Thread(b,r,"T7");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		
		a.setMaxPriority(Thread.MAX_PRIORITY);
		int count=a.activeCount();
		System.out.println("active thread group a "+" "+count);
		b.list();
		
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				// TODO Auto-generated method stub
				System.out.println(t.getName()+"thread end with following exception ");
				System.out.println(e.getMessage());
				
			}
		});
		throw new Exception("exception thrown somewere in program");

	}

}
