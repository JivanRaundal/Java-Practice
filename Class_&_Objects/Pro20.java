// Q. WAP for given main() function.

import java.util.Scanner;

class Number
{
	public int x;
	public int y;
	
	public Number getData()
	{
		Scanner sc = new Scanner(System.in);
		
		Number T;
		T = new Number();
		System.out.println("\nEnter x & y : ");
		T.x = sc.nextInt();
		T.y = sc.nextInt();
		return T;
	}
	
	public void print()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Pro20
{
	public static void main(String args[])
	{
		Number N = new Number();
		Number obj,var;
		
		obj = N.getData();
		var = N.getData();
		
		obj.print();
		var.print();
	}
}

