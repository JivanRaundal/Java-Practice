// Functions returning values :-

import java.util.Scanner;

class Pro32
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		System.out.println("\nEnter two integers : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		int greater;
		greater = myfun(x,y);
		System.out.println("Greater number = " + greater);
	}
	
	static int myfun(int a,int b)
	{
		if(a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}