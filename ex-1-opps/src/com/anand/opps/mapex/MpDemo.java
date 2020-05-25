package com.anand.opps.mapex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MpDemo {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put("anand", "1001");
		map.put("kishor", "1002");
		map.put("saurav", "1003");
		map.put("rinku", "1004");
		map.put("manisha", "1005");
		System.out.println("map value "+map);
		Set s=map.entrySet();
		System.out.println("enty set is"+s);
		Set o=map.keySet();
		System.out.println("key set is "+o);
		Collection c=map.values();
		System.out.println("collection of object is "+c);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println("map value of map demo"+entry.getKey()+" "+entry.getValue());
			if(entry.getKey().equals("saurav"))
			{
				System.out.println("entry set value "+entry.getValue());
				System.out.println("entry set value "+entry.setValue(10000));
			}
		}
		HashMap hash=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		hash.put(i1, 1001);
		hash.put(i2, 1002);
		System.out.println(hash);
		System.out.println("............");
		
	}

}
