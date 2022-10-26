// Q.1] Keep scanning a number from user until user enters 0. Print addition of squares of even numbers only.

import java.util.Scanner;

class Que1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x,sum=0;
		System.out.println("\nKeep Entering number OR enter 0 to stop scanning : ");
		
		while(true)
		{
			x = sc.nextInt();
			if(x == 0)
			{
				break;
			}
			if(x%2 == 0)
			{
				sum = sum + (x*x);
			}
		}
		
		System.out.println("\nAddition of squares of even numbers = " + sum);
	}
}