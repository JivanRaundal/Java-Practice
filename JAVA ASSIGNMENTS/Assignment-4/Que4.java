// Q.4] WAP to create 2 objects of class Number{int x,y} which need defult constructor. But defult constructor in class Number is private.
//      scan details of this 2 objects and print them. You cannot define any other constructor in class.

import java.util.Scanner;

class Number
{
	public int x,y;
	
	private Number()				//private constructor
	{
		System.out.println("\nIn private defult constructor");
	}
	
	public static Number getObject()		//static member function
	{
		return new Number();				//defult constructor will be called in static member function
	}
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Que4
{
	public static void main(String args[])
	{
		Number T1,T2;
		T1 = Number.getObject();
		T2 = Number.getObject();
		T1.scanData();
		T2.scanData();
		T1.printData();
		T2.printData();
	}
}