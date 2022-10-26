// Solve
// Q.2] complete code for given main() function.

import java.util.Scanner;

class Number
{
	public static void show()
	{
		System.out.println("\nIn Number show()");
		int i;
		for(i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
}

class Pro37
{
	public static void main(String args[])
	{
		Number.show();		//this show() will print 1 to 10 using loop
		show();				//this show will print 20 to 50 using loop
	}
	
	public static void show()
	{
		System.out.println("\nIn Pro37 show()");
		int i=20;
		while(i<=50)
		{
			System.out.println(i);
			i++;
		}
	}
}
