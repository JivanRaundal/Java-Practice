// Passing parameters to member functions :-

import java.util.Scanner;

class Demo
{
	public int x;	//public
	int y;			//default
	
	public void set(int a,int b)			//formal parameters
	{
		//Note :- x and y are of calling objects & a and b are local var of set()
		x = a;
		y = b;
	}
	public void show()
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Pro7
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		Demo var = new Demo();
		
		System.out.println("\nBefore");
		obj.show();
		var.show();
		
		obj.set(10,5);			//actual parameters
		var.set(9,27);			//actual parameters
		
		System.out.println("\nAfter");
		obj.show();
		var.show();
	}
}