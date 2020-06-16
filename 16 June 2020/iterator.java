package one;

//Java code to illustrate the use of ListIterator 

import java.io.*; 
import java.util.*; 

class iterator { 
	public static void main(String[] args) 
	{ 
		ArrayList<String> list = new ArrayList<String>(); 

		list.add("H"); 
		list.add("A"); 
		list.add("H"); 
		list.add("A"); 
		list.add("H"); 

		// ListIterator to traverse the list 
		ListIterator iterator = list.listIterator(); 

		// Traversing the list in forward direction 
		System.out.println("Displaying list elements in forward direction : "); 

		while (iterator.hasNext()) 
			System.out.print(iterator.next() + " "); 

		System.out.println(); 

		// Traversing the list in backward direction 
		System.out.println("Displaying list elements in backward direction : "); 

		while (iterator.hasPrevious()) 
			System.out.print(iterator.previous() + " "); 

		System.out.println(); 
	} 
} 
