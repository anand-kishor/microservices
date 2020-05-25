package com.anand.opps.mapex;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map=new LinkedHashMap();
		map.put("anand", "1001");
		map.put("kishor", "1002");
		map.put("saurav", "1003");
		map.put("rinku", "1004");
		map.put("manisha", "1005");
		System.out.println("map value "+map);
		
		System.out.println("....Hash map.......");
		HashMap hash=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		hash.put(i1, 1001);
		hash.put(i2, 1002);
		System.out.println(hash);
		System.out.println("......identity hash map......");
		IdentityHashMap linkedhash=new IdentityHashMap();
		
		Integer i3=new Integer(10);
		Integer i4=new Integer(10);
		linkedhash.put(i3, "saurav");
		linkedhash.put(i4, "anand");
		System.out.println(linkedhash);
		System.out.println("............");

	}
	

}
