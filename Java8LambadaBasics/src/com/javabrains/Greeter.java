package com.javabrains;

public class Greeter {
	 public void greet(Greeting greeting) {
		 //greeting.perform();
		greeting.perform();
		 
	 }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter=new Greeter();
		
		GreetingImpl impl=new GreetingImpl();
		greeter.greet(impl);
		impl.perform();
		Greeting greetinga=() ->System.out.println("Helll anand");
		greetinga.perform();
		Greeting innerClassImpl=new Greeting()
				{
			public void perform()
			{
				System.out.println("Hello active");
			}
				}
			;
				
          innerClassImpl.perform();
	}

	 }
