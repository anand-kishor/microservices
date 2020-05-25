package com.anand.opps.listal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		ArrayList l=new ArrayList();
		l.add('A');
		l.add(10);
		l.add("ANAND");
		l.add(10.5);
		l.add(1234);
		l.add(2,"Man");
		l.add(null);
		l.add("N");
		System.out.println(l.toString());
		System.out.println("serializable.......cloneable......random access");
		LinkedList l2=new LinkedList();
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l2 instanceof RandomAccess);
		
		

	}

}
