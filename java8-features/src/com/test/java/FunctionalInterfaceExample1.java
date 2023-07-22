package com.test.java;

@FunctionalInterface
interface Addition
{	
	int add(int a,int b);//abstract method
	static void testStatic()
	{
		System.out.println("This is a static method");
	}
	
	default void demoDefault()
	{
		System.out.println("This is a default method");
	}
	
}


public class FunctionalInterfaceExample1 {
	
	public static  void main(String args[])
	{
		Addition addition=(int x, int y) -> (x+y);
		int output=addition.add(120, 90);
		System.out.println(output);
		
		addition.demoDefault();
		Addition.testStatic();
	}

}
