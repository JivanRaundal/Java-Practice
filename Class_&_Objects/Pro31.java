/* # static block :-

1) static block of any class get's executed just before you perform first activity related to that class.
2) More acurate => static block of any class get's executed just before executor enters in that class for the first time.
3) static block executes even before main() function, if it belongs to the class containing main() function.
4) non-static members are not accessible from static block directly, can use objectname & .(dot) operator
5) static members are accessible from static block.
6) There can be more than one static block for same class.

Note :-> static block get's executed only during first activity related to class. After that it will not get executed for any activity.
*/

class Number
{
	public int x;						//non-static
	public static int y;				//static
	
	static									//static block
	{
		System.out.println("\nIn Number static block");
		
		y = 20;						//valid, bcz, y is static
		//x = 10;					//error, x is non-static
		Number T = new Number();				//for this static block
		T.x = 10;
		System.out.println("x = " + T.x + "\ty = " + y);			//10 20
		T.print();
		change();					//can be accessed directly bcz, show() is static member functions
	}
	
	public static void change()
	{
		System.out.println("In change()");
	}
	
	public void print()
	{
		System.out.println("In print()");
	}
}

class Pro31
{
	public static void main(String args[])
	{
		Number obj;				//this will not execute static block bcz, executor will not go in class for this statement.
		
		obj = new Number();		//for this statement to create object, executor goes in class for default constructor & hence static
								//block get's executed
		
		Number var = new Number();	
	}
}