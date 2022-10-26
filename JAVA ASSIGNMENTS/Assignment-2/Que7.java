// Q.7] Scan a range from user, print all the integers in the range in ascending order recursively.

import java.util.Scanner;

class Que7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("\nEnter range : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Printing integers in the range : ");
		
		if(a < b)
			print(a,b);
		else
			print(b,a);
	}
	
	public static void print(int x,int y)
	{
		if(x > y)		//OR if(x == y+1)
		{
			return;
		}
		else
		{
			System.out.println(x);
			print(x+1,y);
		}
	}
}