// Practice Que

import java.util.Scanner;

class Number
{
	public int x;
	
	public void printData(Digit Temp)
	{
		System.out.println("\nx = " + x + "\ty = " + Temp.y);
	}
}

class Digit
{
	public int y;
	
	public void getData(Number Temp)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter x : ");
		Temp.x = sc.nextInt();
		System.out.println("Enter y : ");
		y = sc.nextInt();
	}
}

class Pro23
{
	public static void main(String args[])
	{
		Number obj = new Number();
		Digit  var = new Digit();
		
		var.getData(obj);
		obj.printData(var);
	}
}