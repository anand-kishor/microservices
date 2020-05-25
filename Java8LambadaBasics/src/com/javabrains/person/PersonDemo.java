package com.javabrains.person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonDemo {

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
		System.out.println(person);
		getAllPerson(person);
		comparePerson(person);
		
		

	}

	private static void comparePerson(List<Person> person) {
		// TODO Auto-generated method stub
		Collections.sort(person,new Comparator<Person>() {

			@Override
			public int compare(Person obj1, Person obj2) {
				// TODO Auto-generated method stub
				return obj1.getLastName().compareTo(obj2.getFirstName())  ;
			}});

		
		
	}

	private static void getAllPerson(List<Person> person) {
		// TODO Auto-generated method stub
		for(Person p:person)
		{
			if(p.getLastName().startsWith("s")) {
			
			System.out.println(p);
			}
		}
		
	}

}
