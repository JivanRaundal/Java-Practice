// Q.18] WAP to generate given exceptions

import java.util.*;

class Que18
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//1]
		int num[] = null;
		try
		{
			num[2] = 10;					// 'NullPointerException' 
		}
		catch(NullPointerException e)
		{
			System.out.println("\nException :: " + e);
		}
		
		//2]
		String str = "HELLO";
		try
		{
			System.out.println(str.charAt(20));		// 'StringIndexOutOfBoundsException'
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("\nException :: " + e);
		}
		
		//3]
		int x;
		System.out.print("\nEnter value of x : ");
		try
		{
			x = sc.nextInt();						//can generate 'InputMismatchException'
		}
		catch(InputMismatchException e)
		{
			System.out.println("\nException :: " + e);
		}
		
		//4]
		int res;
		try
		{
			res = 10/0;				// 'ArithmeticException'
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nException :: " + e);
		}
	}
}