// Q. WAP for given main() function.

import java.util.Scanner;

class Number
{
	int x;
	int y;
	
	public void getData(Number T)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x & y of calling object : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Enter x & y of object passed as a parameter : ");
		T.x = sc.nextInt();
		T.y = sc.nextInt();
	}
	
	public void putData(Number T)
	{
		System.out.println("\nx = " + x + "\ty = " + y);			//printing members of calling object
		System.out.println("T.x = " + T.x + "\tT.y = " + T.y);		//printing members of object passed as a parameter
	}
}

class Pro18
{
	public static void main(String args[])
	{
		Number obj = new Number();
		Number var = new Number();
		
		obj.getData(var);
		obj.putData(var);
	}
}