package com.anand.opps;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent p=new Parent();
		//p.m1();
		
		Child c=new Child();
		c.m2();
		c.m1();
		
		
	

	}

}
class Parent {
	public void m1()
	{
		System.out.println("parent");
	}

}
class Child extends Parent
{
public void m2()
{
System.out.println("child");	
}
}
