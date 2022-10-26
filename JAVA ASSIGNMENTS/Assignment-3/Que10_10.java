// Q.10-10] Complete the code for given main() function.

import java.util.Scanner;

class Number
{
	public int x,y;
}

class Digit
{
	public Number getNumber()
	{
		Scanner sc = new Scanner(System.in);
		
		Number Temp = new Number();
		System.out.println("\nEnter x & y : ");
		Temp.x = sc.nextInt();
		Temp.y = sc.nextInt();
		return Temp;
	}
	
	public void putNumber(Number Temp)
	{
		System.out.println("\nx = " + Temp.x + "\ty = " + Temp.y);
	}
}

class Que10_10
{
	public static void main(String args[])
	{
		Number obj = new Number();
		Digit  var = new Digit();
		
		obj = var.getNumber();
		var.putNumber(obj);
	}
}