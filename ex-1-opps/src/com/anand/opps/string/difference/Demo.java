package com.anand.opps.string.difference;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/ 
		System.out.println("string difference is content compression not reference comprison ");
		System.out.println("equals method is overriden of Object class not reference and address ");
		String s1=new String("durga");
		String s2=new String("durga");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("string buffer class");
		StringBuffer sb1=new StringBuffer("kishor");
		StringBuffer sb2=new StringBuffer("kishor");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		StringBuffer s3=new StringBuffer();
		StringBuffer s4=new StringBuffer();
		System.out.println(s3.equals(s4));
		

	}

}
