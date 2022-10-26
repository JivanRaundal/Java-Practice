// Q.8] Scan a range from user, print only even numbers in the range recursively in ascending order.

import java.util.*;

class Que8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("\nEnter range : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("\nPrinting even numbers in the range : ");
		
		if(a < b)
			print(a,b);
		else
			print(b,a);
	}
	
	static void print(int x,int y)
	{
		if(x == y+1)		//OR if(x > y)
		{
			return;
		}
		else
		{
			if(x%2 == 0)
			{
				System.out.println(x);
			}
			print(x+1,y);
		}
	}
}
