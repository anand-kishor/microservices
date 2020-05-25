package com.anand.opps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("hello");
		l.add("anand");
		l.add("kishor");
		l.add("saurav");
		l.add("anamika");
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String str=(String)ltr.next();
			System.out.println(str);
			if(str.equals("hello"))
			{
				ltr.remove();
			}
			else if(str.equals("anand"))
			{
				ltr.add("vashnavi");
			}
			else if(str.equals("saurav"))
			{
				ltr.set("kkk");
			}
			else if(str.equals("anamika"))
			{
				ltr.previousIndex();
				
			}
		}
		System.out.println(l.indexOf("kkk"));
		System.out.println(l);

	}

}
