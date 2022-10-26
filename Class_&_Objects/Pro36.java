// Solve
// Q.1] complete code for given main() function.

import java.util.Scanner;

class Number
{
	public int x,y;
	
	public static Number getObject()
	{
		Number Temp = new Number();
		return Temp;				//OR    return new Number();  
	}
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public void print()
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Pro36
{
	public static void main(String args[])
	{
		Number T1,T2;
		T1 = Number.getObject();
		T2 = Number.getObject();
		
		T1.getData();
		T2.getData();
		
		T1.print();
		T2.print();
	}
}

