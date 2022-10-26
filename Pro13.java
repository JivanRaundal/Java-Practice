// Conditional operator :- '?:'

// Note => Syntax of conditional operator
//         answer = boolean_expn ? expn2 : expn3 ;

// Q. Scan 3 integers from user & find largest value without using if-else

import java.util.Scanner;

class Pro13
{
	public static void main(String args[])
	{
		/*
		int x;
		x = 12>5 ? 1+1 : 2+2; 	//if true x = 1+1 else if false x = 2+2
		System.out.println("x = " + x);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		int max;
		
		System.out.println("Enter 3 integers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("Three numbers are = " + a + "," + b + "," + c);
		
		//max = a>b && a>c ? a : (b>a && b>c ? b : c);		//Nested conditions
		
		//OR use '?:' 2 times
		max = a > b ? a : b;
		max = max > c ? max : c;
		
		System.out.println("Maximum/Largest number is = " + max);
	}
}
