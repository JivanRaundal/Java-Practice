// Q.5] Complete the following code for given main() function.

import java.util.Scanner;

class Number
{
	public int x;
	
	public void scan(Digit temp)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		temp.y = sc.nextInt();
	}
}

class Digit
{
	public int y;
	
	public static void print(Number N,Digit D)
	{
		System.out.println("\nx = " + N.x + "\ty = " + D.y);
	}
}

class Que5
{
	public static void main(String args[])
	{
		Number obj = new Number();
		Digit var  = new Digit();
		obj.scan(var);
		Digit.print(obj,var);
	}
}