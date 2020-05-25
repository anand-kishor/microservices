package com.anand.opps.listal;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector(10,5);
		System.out.println(v.capacity());
		for(int i=0;i<1000;i++)
		{
		v.addElement(i);
		
	
		}
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			Integer in=(Integer)itr.next();
			if(in%2==0)
			{
			
				System.out.println(in);
			}
			else 
			{
				itr.remove();
			}
		}
		v.addElement('A');
		System.out.println(v.capacity());
		System.out.println(v);
		//ArrayList al=new ArrayList();
		Enumeration e=v.elements();
		Iterator itr1=v.iterator();
		ListIterator itr2=v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr1.getClass().getName());
		System.out.println(itr2.getClass().getName());
		

	}

}
