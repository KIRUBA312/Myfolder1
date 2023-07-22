package com.test.java;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * Mathod References: It's a new feature in Java 8. Method reference is used to refer methods
 * of the functional interface.
 * It is a very compact and easy form of lambda expression. Each time when you are using a
 * lambda expression to just refer a method, you can replace it with a method reference. 
 */
interface Say
{
	void say();
}



public class MethodReferencesExample {

	public static int addition(int a,int b)
	{
		return (a+b);
	}
	
	public void saySomething()
	{
		System.out.println("hello, this is a non static instance method");
	}
	
	public static void main(String[] args) {
		
		
		BiFunction<Integer, Integer, Integer> usingLambda=(a,b) -> MethodReferencesExample.addition(a, b);
		System.out.println(usingLambda.apply(10, 20));
		
		
		BiFunction<Integer, Integer, Integer> usingMethodRef=MethodReferencesExample::addition;
		System.out.println(usingMethodRef.apply(10, 20));
		
		
		MethodReferencesExample obj=new MethodReferencesExample();
		Say s=obj::saySomething;
		s.say();
		
		
		Function<Integer, Double> sqrt=Math::sqrt;
		System.out.println(sqrt.apply(16));
		
		
		String [] stringArray= {"India","USA","uK","pakistan","srilanka"};
		Arrays.sort(stringArray, String ::compareToIgnoreCase);		
		for(String st:stringArray)
		{
			System.out.println(st);
		}
		
		
		String city=null;	
		String cityValue=Optional.ofNullable(city).orElseThrow(IllegalArgumentException::new);//method reference
		System.out.println(cityValue);

	}

}
