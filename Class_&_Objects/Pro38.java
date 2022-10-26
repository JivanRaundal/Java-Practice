// Solve
// Q.3] complete code for given main() function.

import java.util.Scanner;

class Number
{
	int x;
	int y;
}

class Digit
{
	public static Number getObject()
	{
		Scanner sc = new Scanner(System.in);
		Number T = new Number();
		System.out.println("\nEnter x & y : ");
		T.x = sc.nextInt();
		T.y = sc.nextInt();
		return T;
	}
}

class Pro38
{
	public static void main(String args[])
	{
		Number T1,T2;
		T1 = Digit.getObject();
		T2 = Digit.getObject();
		
		printObject(T1);
		printObject(T2);
	}
	
	public static void printObject(Number T)
	{
		System.out.println("\nx = " + T.x + "\ty = " + T.y);
	}
}
