package com.anand.opps.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1001,"anand");
		Employee e2=new Employee(1002,"anand");
		Employee e3=new Employee(1003,"anand");
		Employee e4=new Employee(1004,"anand");
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println("Employee list"+list);
		
		PriorityQueue q=new PriorityQueue(15,new MyComparator());
		
		
		//PriorityQueue p=new PriorityQueue();
		//System.out.println(p);
		PriorityQueue p=new PriorityQueue();
		
		//System.out.println(p.peek());
		//System.out.println(p.element());

		for(int i=0;i<=10;i++)
		{
			System.out.println(p.offer(i));
		}
	
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		
	}
	

}
class Employee
{
private int age;
private String name;
public Employee(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [age=" + age + ", name=" + name + "]";
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
}
