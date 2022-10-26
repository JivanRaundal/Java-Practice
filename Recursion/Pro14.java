// Q. WAP to find n! using recursion.

import java.util.Scanner;

class Pro14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n,ans;
		System.out.println("\nEnter number : ");
		n = sc.nextInt();
		
		ans = fact(n);
		System.out.println(n + "! = " + ans);
	}
	
	static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
}