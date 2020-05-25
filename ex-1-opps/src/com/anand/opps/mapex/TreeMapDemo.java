package com.anand.opps.mapex;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap map=new TreeMap(new MyComparator());
		map.put("XYZ", 1001);
		map.put("XAZ", 1001);
		map.put("BYZ", 1001);
		map.put("ZYZ", 1001);
		map.put("XYZ", "ANAND");
		System.out.println(map);
		map.put("XYZ", "saurav");
		System.out.println(map);
		
		
		
	}
	
	

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
	
}
