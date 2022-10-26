// Relational / Comparison Operators :-  ( <, <=, >, >=, !=, ==)

// Note => comparison operators always gives you boolean value (true/false) as result
// Note => boolean values are not compatible with any other datatype, using typecasting also not possible.


import java.util.Scanner;

class Pro11
{
	public static  void main(String args[])
	{
		boolean res;
		int a,b;
		
		System.out.println(2 < 3);
		
		res = 2 > 5;
		System.out.println("res of (2>3) = " + res);
		
		a=5; b=4;
		res = a==b;
		System.out.println("res of (a==b) = " + res);
		
		res = !false;
		System.out.println("res of (!false) = " + res);
		
		// Note => boolean values are not compatible with any other type.
		/*
		int x;
		//x = 12 > 5;		//error
		x = (int)12 > 5;	//error: incompatible types: boolean cannot be converted to int
		System.out.println("x = " + x); 
		*/
	}	 
}