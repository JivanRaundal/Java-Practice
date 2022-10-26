// Q. WAP for given main() function.

import java.util.Scanner;

class Number
{
	public int x;
	public int y;
}

class Pro19
{
	public static void main(String args[])
	{
		Number obj = new Number();		//Note : no need to create object here, bcz of memory leak
		Number var = new Number();
		
		obj = getData();		//getData() is static mem-function of class Pro19
		var = getData();
		
		print(obj);				//print() is static mem-function of class Pro19
		print(var);
	}
	
	public static Number getData()
	{
		Scanner sc = new Scanner(System.in);
		
		Number Temp = new Number();
		System.out.println("\nEnter x & y : ");
		Temp.x = sc.nextInt();
		Temp.y = sc.nextInt();
		return Temp;
	}
	
	public static void print(Number Temp)
	{
		System.out.println("\nx = " + Temp.x + "\ty = " + Temp.y);
	}
}