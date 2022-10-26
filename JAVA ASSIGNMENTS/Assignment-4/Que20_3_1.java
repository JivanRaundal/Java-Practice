// Q 20.3.1] WAP to check working of Inner class. Perform different trials.

import java.util.Scanner;

class Outer
{
	private class Inner1	//cannot access private class Inner1 outside Outer class although it's members are public but class is private
	{
		int x = 10;
		
		void show()
		{
			System.out.println("\nIn Inner1 show(), x = " + x);
		}
	}	
	
	class Inner2 extends Inner1			//Inheriting One Inner class into another Inner class
	{
		int a = 10;
		Inner1 in = new Inner1();			//composition
		
		void disp()
		{
			in.x = 22;
			System.out.println("\nIn Inner2 disp(), a = " + a + "  in.x = " + in.x);
			show();
		}
	}
	
	int y = 20;
	Inner1 obj = new Inner1();			//composition
	Inner2 var = new Inner2();
	
	void print()
	{
		System.out.println("\nIn Outer print(), y = " + y + "  Inner1 x = " + obj.x);
		obj.show();				//valid in same class only
	}
}

class Derive extends Outer			//Inheriting Outer class with the Outer class Inner class will also get Inherited
{
	void getdata()
	{
		Inner2 ref = new Inner2();
		ref.a = 55;
		ref.disp();
		
		//Inner1 I = new Inner1();	//Error, BCZ class Inner1 is private 
	}
}

class Que20_3_1 
{
	public static void main(String args[])
	{
		Outer out = new Outer();
		
		//out.obj.x = 11;	//error, cannot access members of Inner1 class bcz it is private 
		//out.obj.show();
		
		out.var.disp();
		out.print();
		
		Derive D = new Derive();
		D.getdata();
	}
}
