package com.test.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

/*Collectors class: It is a final class that extends Object class.
 * It provides reduction operations, such as accumulating elements into collections,
 * summarizing elements according to various criteria etc.
 * 
 *  toList(), toSet(), sum(), avg(), counting(), 
 *  
*/

class Product
{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}


public class CollectorsClassExample {

	public static void main(String[] args) {
		
		Product product1=new Product(1, "HP Laptop", 25000f);
		Product product2=new Product(2, "Dell Laptop", 30000f);
		Product product3=new Product(3, "Lenovo Laptop", 29000f);
		Product product4=new Product(4, "Sony Laptop", 28000f);
		Product product5=new Product(5, "Apple Laptop", 90000f);
		Product product6=new Product(6, "Acer Laptop", 23000f);
		
		ArrayList<Product> products=new ArrayList<>(Arrays.asList(product1,product2,product3,product4,product5,product6));
		
		ArrayList<Float>  productPriceList=(ArrayList<Float>) products.stream()
												.map(p -> p.price)
												.collect(Collectors.toList());
		
		System.out.println(products);
		System.out.println(productPriceList);
		
		
		Double totalPrice=products.stream()				
				.collect(Collectors.summingDouble(p -> p.price));
		
		System.out.println(totalPrice);
		
		Integer totalofId=products.stream()				
				.collect(Collectors.summingInt(p -> p.id));
		System.out.println(totalofId);
		
		
		Double avgPrice=products.stream()				
				.collect(Collectors.averagingDouble(p -> p.price));
		System.out.println(avgPrice);
		
		
		Long noOfProducts=products.stream()				
				.collect(Collectors.counting());
		System.out.println(noOfProducts);
	}

}
