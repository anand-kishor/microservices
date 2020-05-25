package com.anand.opps.deadlocksituation;

public class AnnonymousThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread("T1")
				{
			   public void run() {
				   for(int i=0;i<=5;i++)
				   {
					   System.out.println(Thread.currentThread().getName()+" ,i="+i);
				   }
				
			};
				};
				Thread t2=new Thread("T2")
				{
			   public void run() {
				   for(int i=0;i<=5;i++)
				   {
					   System.out.println(Thread.currentThread().getName()+",i="+i);
				   }
				
			};
				};
				//t1.setDaemon(true);
				t1.start();
				t2.start();
				
				
				Runnable r=new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i=0;i<=5;i++)
						   {
							   System.out.println(Thread.currentThread().getName()+",i="+i);
						   }
						
					}};
					Thread t3=new Thread(r,"T3");
					Thread t4=new Thread(r,"T4");
					Thread t5=new Thread(r,"T5");
					t3.start();
					t4.start();
					t5.start();
					
					Thread t6=new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							for(int i=0;i<=5;i++)
							   {
								   System.out.println(Thread.currentThread().getName()+",i="+i);
							   }
							
						}});
					t6.start();
		

					Thread t7=new Thread(()->{
							for(int i=0;i<=5;i++)
							   {
								   System.out.println(Thread.currentThread().getName()+",i="+i);
							   }
					}
						);
					t7.start();
		

	}

}
