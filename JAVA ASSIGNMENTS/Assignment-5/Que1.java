// Q.1] 

import java.util.Scanner;

class Number
{
	final static int y = 20;		//final static variable can be initialized at time of declaration or in static block only
	final static int z;
	final int x = 10;			//non-static final variable can be initialized at time of declaration, in any constructor, or in anonymous
	final int a;
	final int b;
	
	static
	{
		z = 22;			//final static class variable can be initialized in static block
		//a = 11;		//non-static final class variable cannot be initialized in static block
	}
	
	{
		a = 11;				//non-static final  datamember can be initialized in anonymous block
	}
	
	Number()
	{
		b = 33;				//non-static final class variable can be initialized in constructor bcz, it get's memory on per object basis
		//z = 22;			//cannot initialize static final class variable in constructor
	}
	
	void show()
	{
		//a = 44;			//error
		System.out.println("\nnon-static final : x = " + x + " a = " + a + " b = " + b);
		System.out.println("\nstatic    final : y = " + y + " z = " + z);
	}
}

class Que1
{
	public static void main(String args[])
	{
		final int x = 10;			//final local variable, can be initialized at declaration or after declaration but before it's first use.
		final int y;
		y = 20;
		System.out.println("\nx = " + x + " y = " + y);
		
		//x = 11;				//re-initialization is not allowed
		
		Number obj = new Number();
		obj.show();
	}
}