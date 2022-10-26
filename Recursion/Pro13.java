
// Q. Scan a range from user, print only even numbers in the range using recursion.

import java.util.Scanner;

class Pro13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		System.out.println("\nEnter range : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println();
		
		if(x < y)
		{
			print(x,y);
		}
		else
		{
			print(y,x);
		}
	}
	
	static void print(int a,int b)
	{
		if(a > b)			//or if(a == b+1)
		{
			return;
		}
		else
		{
			if(a%2 == 0)
			{
				System.out.println(a);
			}
			print(a+1,b);
		}
	}
}