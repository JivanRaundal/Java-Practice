// Q.5] Find n factorial using recursive function.

import java.util.Scanner;

class Que5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("\nEnter number : ");
		n = sc.nextInt();
		
		int ans;
		ans = factorial(n);
		System.out.println("\n" + n + "! = " + ans);
	}
	
	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}
}