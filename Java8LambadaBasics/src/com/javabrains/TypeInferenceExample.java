package com.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypeInference type=(s) ->s.length();
		System.out.println(type.lengthType("Heelo anand how are you"));
		
		TypeInference type2=new TypeInference() {
			public int lengthType(String s)
			{
				
				return s.length();
			}
		};
		System.out.println(type2.lengthType("javaspring"));
	}
	
	interface TypeInference
	{
		
	public int lengthType(String s);
	
	}

}
