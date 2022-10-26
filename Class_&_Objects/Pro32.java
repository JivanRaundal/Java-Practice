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
	public int x;
	public static int y;
	
	static
	{
		System.out.println("\nIn Number static block");
		//x = 10;					//error, x is non-static
		Number T = new Number();
		T.x = 10;
		y = 20;						//valid, y is static
		System.out.println("x = " + T.x + "\ty = " + y);
		show();				//calling show() directly bcz it is static
		System.out.println();
	}
	
	public static void show()
	{
		System.out.println("In show()");
	}
}

class Pro32
{
	static					//static block executes even before main()
	{
		System.out.println("\nIn pro32 static block");
	}
	
	public static void main(String args[])
	{
		System.out.println("main() starts");
		
		Number.show();
			
		System.out.println("\nmain() ends");
	}
}