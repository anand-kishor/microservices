package com.anand.opps.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet s=new HashSet();
		LinkedHashSet s=new LinkedHashSet();
		s.add("k");
		s.add("m");
		s.add(null);
		s.add("k");
		s.add(10);
		s.add(11.4);
		s.add("12.5f");
		System.out.println("hash set result "+s);

	}

}
