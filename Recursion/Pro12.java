// Q. Print addition of 1st n natural numbers recursively.

import java.util.Scanner;

class Pro12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n,ans;
		System.out.println("\nEnter number : ");
		n = sc.nextInt();
		
		ans = add(n);
		System.out.println("Addition of 1st " + n + " natural numbers = " + ans);
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