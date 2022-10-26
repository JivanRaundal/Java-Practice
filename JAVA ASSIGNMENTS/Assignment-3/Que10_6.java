// Q.10-6] Complete the code for given main() function.

import java.util.Scanner;

class Number
{
	public int x,y;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public void shoData()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
	
	public void add(Number N2,Number N3)
	{
		N3.x = x + N2.x;
		N3.y = y + N2.y;
	}
}

class Que10_6
{
	public static void main(String args[])
	{
		Number T1,T2,T3;
		T1 = new Number();
		T2 = new Number();
		T3 = new Number();
		
		T1.getData();
		T2.getData();
		T1.add(T2,T3);		//perform addition of T1 & T2 in T3.
		T3.shoData();
	}
}