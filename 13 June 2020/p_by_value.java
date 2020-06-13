package one;

//A Java program to show that we can change members using using 
//reference if we do not change the reference itself. 

class Test 
{ 
	int x; 
	Test(int i) { x = i; } 
	Test()	 { x = 0; } 
} 

class p_by_value 
{ 
	public static void main(String[] args) 
	{ 
		// t is a reference 
		Test t = new Test(5); 

		// Reference is passed and a copy of reference 
		// is created in change() 
		change(t); 

		// New value of x is printed 
		System.out.println(t.x); 
	} 

	// This change() doesn't change the reference, it only 
	// changes member of object referred by reference 
	public static void change(Test t) 
	{ 
		t.x = 2020; 
	} 
} 
