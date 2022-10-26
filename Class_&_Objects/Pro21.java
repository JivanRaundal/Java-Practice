// Q. WAP for given main() function.

import java.util.Scanner;

class Number
{
	public int x;
	public int y;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		print();		//calling one member function from another
	}
	
	private void print()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Pro21
{
	public static void main(String args[])
	{
		Number obj,var;
		obj = new Number();
		var = new Number();
		
		obj.getData();
		var.getData();
		//obj.print();			//error, bcz print() is private
	}
}

