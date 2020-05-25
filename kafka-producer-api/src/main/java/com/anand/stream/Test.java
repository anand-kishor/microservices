package com.anand.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= Arrays.asList("anand","anamika","anshul","khanna","kishan");
		Stream<String> stream=list.stream();
		stream=stream.filter(name->name.startsWith("a"));
		List<String> findList=stream.collect(Collectors.toList());
		findList.forEach(System.out::println);

	}

}
