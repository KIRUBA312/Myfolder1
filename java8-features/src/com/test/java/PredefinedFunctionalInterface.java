package com.test.java;

import java.util.function.Predicate;

//Predicate : A predicate is one such function accepting a single argument to evaluate a boolean result
class Person
{
	String name;
	int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}



public class PredefinedFunctionalInterface {

	public static void main(String[] args) {
	
		Person person1=new Person("Aman", 29);
		Person person2=new Person("Kumar", 20);
		
		Predicate<Person> predicate=(x) -> x.getAge()>20;
		System.out.println(predicate.test(person1));

	}

}
