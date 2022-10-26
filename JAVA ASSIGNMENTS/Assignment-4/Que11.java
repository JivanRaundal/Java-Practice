// Q.11] Complete the following code.

import java.util.Scanner;

class Number
{
	int x;
	int y;
}

class Digit
{
	Number ref;				
	
	void getData()				//scans details of object referenced by ref.
	{
		Scanner sc = new Scanner(System.in);
		
		ref = new Number();				//composition
		System.out.println("\nEnter x & y : ");
		ref.x = sc.nextInt();
		ref.y = sc.nextInt();
	}
	
	void showData()				//prints details of object referenced by ref.
	{
		System.out.println("\nx = " + ref.x + "\ty = " + ref.y);
	}
	
}

class Que11
{
	public static void main(String args[])
	{
		Digit dig = new Digit();
		dig.getData();
		dig.showData();
	}
}