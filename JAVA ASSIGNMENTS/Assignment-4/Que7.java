// Q.7] Complete the code for given main() function.

import java.util.Scanner;

class Number
{
	private int x,y;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}

	public void print()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
	
	private Number add(Number temp)			//private, Inaccessible in non-member function
	{
		Number T = new Number();
		T.x = x + temp.x;
		T.y = y + temp.y;
		return T;
	}
	
	public Number help_add(Number temp)		//to call private add()
	{
		return this.add(temp);			//Note = calling object of add() is calling object of help_add() 
	}
}

class Que7
{
	public static void main(String args[])
	{
		//create 3 objects of Number. Perform addition of 2 objects in third one using add function.
		Number T1,T2,T3;
		T1 = new Number();
		T2 = new Number();
		
		T1.scanData();
		T2.scanData();
		
		T3 = T1.help_add(T2);
		T3.print();
	}
}