// Q 20.3] WAP to check working of Inner class. Perform different trials.

import java.util.Scanner;

class Outer
{
	public class Inner
	{
		int x = 10;
		
		void show()
		{
			System.out.println("\nIn Inner show(), x = " + x);
		}
	}
	
	int y = 20;
	Inner in = new Inner();			//composition
	
	void print()
	{
		System.out.println("\nIn Outer print(), y = " + y);
	}
}

class Que20_3
{
	public static void main(String args[])
	{
		Outer out = new Outer();
		
		System.out.println("\nout.in.x = " + out.in.x + "  out.y = " + out.y);
		out.in.x = 5;
		out.y = 8;
		out.in.show();
		out.print();
		
		//creating object of Inner class in non-member function
		Outer.Inner ref;			//reference variable of Inner class
		ref = out.new Inner();
		ref.x = 44;
		ref.show();
	}
}
