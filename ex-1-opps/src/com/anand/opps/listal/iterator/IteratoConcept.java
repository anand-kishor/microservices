package com.anand.opps.listal.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratoConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add("hello");
		l.add("anand");
		l.add("kishor");
		l.add("saurav");
		l.add("anamika");
		System.out.println("array list object "+l.toString());
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			String str=(String)itr.next();
			System.out.println(str);
		}

	}

}
