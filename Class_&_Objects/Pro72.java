// Q.3]

import java.util.*;

class Outer			//Outer class
{
	class Inner		//Nested class Inner
	{
		private int x;
		
		public void show()
		{
			System.out.println("\nIn Inner show(), x = " + x);
		}
	}
	
	public int y;
	Inner in = new Inner();			//Composition
		
	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter x & y : ");
		in.x = sc.nextInt();
		y = sc.nextInt();
	}
		
	public void print()
	{
		System.out.println("\nx = " + in.x + "\ty = " + y);
	}
}

class Pro72
{
	public static void main(String args[])
	{
		Outer out = new Outer();
		out.y = 10;
		//out.in.x = 20;					//error, x of Inner is private
		out.print();
		
		out.scan();
		out.print();
		
		//creating object of Inner in main() using object of Outer
		Outer.Inner var;
		var = out.new Inner();
		//var.x = 100;				//error, x is private
		var.show();
	}
}

