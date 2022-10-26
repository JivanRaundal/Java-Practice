// Practice Que

import java.util.Scanner;

class Number
{
	private int x;			//x is private

	public void getx()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x : ");
		x = sc.nextInt();
	}
	
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
		
		System.out.println("\nEnter y : ");
		y = sc.nextInt();
		
		//Temp.x = sc.nextInt();		//error, x is private
		Temp.getx();					//will scan x 
	}
}

class Pro24
{
	public static void main(String args[])
	{
		Number obj = new Number();
		Digit  var = new Digit();
		
		var.getData(obj);
		obj.printData(var);
	}
}