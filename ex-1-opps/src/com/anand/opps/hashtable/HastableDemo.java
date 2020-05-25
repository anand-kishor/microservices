package com.anand.opps.hashtable;

import java.util.Hashtable;

public class HastableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hash=new Hashtable();
		hash.put(new Temp(5), "A");
		hash.put(new Temp(2), "B");
		hash.put(new Temp(11), "C");
		hash.put(new Temp(6), "D");
		hash.put(new Temp(25), "F");
		hash.put(new Temp(30), "H");
		hash.put(new Temp(20), "I");
		hash.put(new Temp(36), "J");
		System.out.println(hash);

	}

}
class Temp{
	
	int i;
	public Temp() {
		// TODO Auto-generated constructor stub
	}
	Temp(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
}
