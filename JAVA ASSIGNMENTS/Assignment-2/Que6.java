// Q.6] WAP to print first n natural numbers recursively.

import java.util.Scanner;

class Que6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("\nEnter number : ");
		n = sc.nextInt();
		
		System.out.println("First " + n + " natural numbers are : ");
		print(n);
	}
	
	static void print(int x)
	{
		if(x == 0)
		{
			return;
		}
		
		print(x-1);
		System.out.println(x);
	}
}