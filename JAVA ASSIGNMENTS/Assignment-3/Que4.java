// Q.4] WAP to print addition of first n natural numbers recursively.

import java.util.Scanner;

class Que4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("\nEnter number : ");
		n = sc.nextInt();
		
		int ans;
		ans = add(n);
		System.out.println("\nAddition of 1st " + n + " natural numbers = " + ans);
	}
	
	static int add(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else
		{
			return n + add(n-1);
		}
	}
}