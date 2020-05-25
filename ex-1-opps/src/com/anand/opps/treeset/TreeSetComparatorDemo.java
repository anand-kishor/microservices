package com.anand.opps.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(20);
		t.add(0);
		t.add(5);
		t.add(50);
		System.out.println(t);
		

	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1>i2)
			return -1;
		else if(i1<i2)
			return +1;
		else
			
		return 0;
	}
	
}
