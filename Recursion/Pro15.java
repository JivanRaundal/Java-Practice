// Q. Scan a number from user. Print addition of digits in than number recursively.

import java.util.*;

class Pro15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n,sum = 0;
		System.out.println("Enter number : ");
		n = sc.nextInt();
		
		sum = addDigits(n);
		System.out.println("\nAddition of all digits in number = " + sum);
	}
	
	static int addDigits(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else
		{
		
			int x;
			x = addDigits(n/10);
			return (n%10) + x;
		}
	}
}