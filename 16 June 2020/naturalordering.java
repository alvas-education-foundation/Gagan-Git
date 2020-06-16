package one;

//Java program to demonstrate 
//Comparator.naturalOrder() method 

import java.util.Arrays; 
import java.util.Comparator; 
import java.util.List; 

public class naturalordering { 
	public static void main(String... args) 
	{ 

		List<String> stringList 
			= Arrays.asList("Bheem", "Raju", 
							"Jaggu", "Chutki"); 

		System.out.println("Before sorting:"); 
		stringList.forEach(System.out::println); 

		stringList.sort(Comparator.naturalOrder()); 
		System.out.println("\nAfter sorting:"); 
		stringList.forEach(System.out::println); 
	} 
} 
