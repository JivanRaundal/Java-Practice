// for loop :-

// Q. Scan a range from user, print all the integers in given range in ascending order.

import java.util.*;

class Pro23
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b,min,max,i;
		
		System.out.println("\nEnter range : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//find min & max of two numbers
		min = a < b ? a : b;
		max = a > b ? a : b;
		
		System.out.println("\nIntegers in the range " + min + " to " + max + " are :");
		
		for(i=min; i<=max; i++)
		{
			System.out.println(i);
		}
	}
}