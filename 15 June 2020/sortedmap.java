package one;

//Java code to demonstrate SortedMap 

import java.util.Iterator; 
import java.util.Map; 
import java.util.Set; 
import java.util.SortedMap; 
import java.util.TreeMap; 

public class sortedmap 
{ 
	public static void main(String[] args) 
	{ 
		SortedMap<Integer, String> sm = 
					new TreeMap<Integer, String>(); 
		sm.put(new Integer(2), "Code"); 
		sm.put(new Integer(3), "Goes"); 
		sm.put(new Integer(5), "GitHub"); 
		sm.put(new Integer(4), "into"); 
		sm.put(new Integer(1), "This"); 
		Set s = sm.entrySet(); 

		// Using iterator in SortedMap 
		Iterator i = s.iterator(); 

		// Traversing map. Note that the traversal 
		// produced sorted (by keys) output . 
		while (i.hasNext()) 
		{ 
			Map.Entry m = (Map.Entry)i.next(); 

			int key = (Integer)m.getKey(); 
			String value = (String)m.getValue(); 

			System.out.println("Key : " + key + 
							" value : " + value); 
		} 
	} 
} 
