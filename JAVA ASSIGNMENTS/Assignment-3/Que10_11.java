// Q.10-11] complete the code for given main() function.

import java.util.Scanner;

class Number
{
	public int x;
	
	public void getData(Digit Temp)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter valus of x : ");
		x = sc.nextInt();
		System.out.println("\nEnter value of y : ");
		Temp.y = sc.nextInt();
	}
}

class Digit
{
	public int y;
		
	public void printData(Number Temp)
	{
		System.out.println("\nx = " + Temp.x + "\ty = " + y);
	}
}

class Que10_11
{
	public static void main(String args[])
	{
		Number N = new Number();
		Digit  D = new Digit();
		
		N.getData(D);
		D.printData(N);
	}
}