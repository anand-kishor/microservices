package com.anand.opps.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1001,"anand");
		Employee e2=new Employee(1003,"kishor");
		Employee e3=new Employee(1002,"saurav");
		Employee e4=new Employee(1004,"lucy");
		Employee e5=new Employee(1005,"ananya");
		Employee e6=new Employee(1006,"khanna");
		TreeSet t=new TreeSet(new MyEmployee());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		

	}

}
class Employee
{
private int id;
private String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
class MyEmployee implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		Integer i1=e1.getId();
		Integer i2=e2.getId();
		//String s1=e1.getName();
		//String s2=e2.getName();
		return i1.compareTo(i2);
	}
	
}
