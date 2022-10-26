// Q.10-2] Complete the code for given main() function.

import java.util.Scanner;

class Number
{
	int x,y;		//default access-specifier
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	void putData()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Que10_2
{
	public static void main(String args[])
	{
		Number var = new Number();
		var.getData();
		var.putData();
		
	}
}