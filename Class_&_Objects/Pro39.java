// Solve
// Q.4] complete code for given main() function.

import java.util.Scanner;

class Number
{
	int x,y;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	private static void printData(Number Temp)
	{
		System.out.println("\nx = " + Temp.x + "\ty = " + Temp.y);
	}
	
	public static void print(Number T)
	{
		printData(T);
	}
}

class Pro39
{
	public static void main(String args[])
	{
		Number T1,T2;
		T1 = new Number();
		T2 = new Number();
		
		T1.getData();
		T2.getData();
		
		Number.print(T1);
		Number.print(T2);
	}
}
