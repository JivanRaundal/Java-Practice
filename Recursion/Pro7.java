// recursion :-

// Q. print 1st n natural numbers using recursion.

import java.util.*;

class Pro7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("\nEnter value of n : ");
		n = sc.nextInt();
		
		show(n);
	}
	
	static void show(int n)
	{
		if(n >= 1)
		{
			show(n-1);
			System.out.println(n);
		}
	}
}