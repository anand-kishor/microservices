package com.anand.opps.string;

public class StringDemo {
	public static void main(String[] args) {
		String s="Anand";
		s.concat("kishor");
		System.out.println(s);
		StringBuffer sb=new StringBuffer("anand");
		sb.append("kishor");
		System.out.println(sb);
		//System.out.println(s1);
		//System.out.println(sb2);
		String s4=new String("durga");
		s4.concat("sofware");
		String s5=s4.concat("solutions");
		System.out.println(s5);
		String s6="durga";
		System.out.println(s6.length());
}
}
