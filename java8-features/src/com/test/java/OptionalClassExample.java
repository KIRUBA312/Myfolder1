package com.test.java;

import java.util.Optional;

//Added in Java 8 to deal with NullPointer Exception
//Advantages
/*
 * a)Null checks are not required
 * b)No more null pointer exception at runtime
 * c)We can develop neat and clean apis.
 * d)No more boilerplate code.
 */
public class OptionalClassExample {

	public static void main(String[] args) {
	
		//of method
		String s="Hello World";
		Optional<String> optional=Optional.of(s);
		Optional<String> optional1=Optional.empty();
		
		
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		
		
		System.out.println(optional1.isEmpty());
		System.out.println(optional1.isPresent());
		
		
		String st="Java", st1=null;
		
		
		System.out.println(Optional.ofNullable(st));
		System.out.println(Optional.ofNullable(st1));
		
		
		System.out.println(Optional.ofNullable(st).get());
		//System.out.println(Optional.ofNullable(st1).get());
		System.out.println(optional.get());
		
		
		if(optional1.isPresent())
		{
			System.out.println(optional.get());
		}
		else
		{
			System.out.println("Value not present");
		}
		
	   //orElse() : Returns the value if present otherwise another value.
		
		String name=null;
		
		String value=Optional.ofNullable(name).orElse("name not specified");
		
		System.out.println(value);
		
		//orElseGet() :Returns the value if present, otherwise invoke other and return the result of invocation 
		
		
		String city=null;
		String cityValue=Optional.ofNullable(city).orElseGet(() -> "Chennai");
		System.out.println(cityValue);
		
		//orEleseThrow(): Returns the contained value if present, otherwise throws an exception.   
		//city=null;
		//cityValue=Optional.ofNullable(city).orElseThrow();
		//System.out.println(cityValue);
		
		
		
		city=null;
		cityValue=Optional.ofNullable(city).orElseThrow(IllegalArgumentException::new);//method reference
		System.out.println(cityValue);
		
		
	}

}
