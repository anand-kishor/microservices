package com.javabrains.person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PersonLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> person=Arrays.asList(
				new Person("anand","kishor",20),
				new Person("saurav","anand",20),
				new Person("kishan","sadav",20),
				new Person("monika","sanger",20),
				new Person("lucy","surbhi",20),
				new Person("sonu","zerman",20)
				
				);

    Collections.sort(person,(p1,p2) ->p1.getLastName().compareTo(p2.getLastName()));
		
    System.out.println("print all person "+person);
    System.out.println("condition apply.....");
    printCondisnally(person,p ->p.getLastName().startsWith("s"));
    System.out.println("start with s");
    System.out.println(person);
    printCondisnally(person,p ->true);
    System.out.println("start with a");
    printCondisnally(person,p ->p.getFirstName().startsWith("a"));
    System.out.println(person);
		
	}

	private static void printCondisnally(List<Person> person,Predicate<Person> predicate) {
		// TODO Auto-generated method stub
		for(Person p:person)
		{
			if(predicate.test(p))
			{
				System.out.println(p);
			}
		}
	}

}
