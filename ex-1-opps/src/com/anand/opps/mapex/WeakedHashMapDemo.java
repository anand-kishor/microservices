package com.anand.opps.mapex;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakedHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//HashMap map=new HashMap();
		WeakHashMap map=new WeakHashMap();
		Temp t=new Temp();
		map.put(t,"durga");
		System.out.println(map);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);

	}

}
class Temp
{
public String toString()
{
return "temp";	
}
public void finalize()
{
System.gc();	
}
}