// Q.10-3] Complete the code for given main() function.

import java.util.Scanner;

class Number
{
	int x,y;		//default access-specifier
	
	void getData(Number T)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter x & y of calling object : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("\nEnter x & y of object passed as a parameter : ");
		T.x = sc.nextInt();
		T.y = sc.nextInt();
	}
	
	void printData()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Que10_3
{
	public static void main(String args[])
	{
		Number var = new Number();
		Number obj = new Number();
		
		var.getData(obj);
		var.printData();
		obj.printData();
	}
}