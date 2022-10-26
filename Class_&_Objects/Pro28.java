/* # static member function :-

1) static member function always works for the class & not for any specific object.
2) Directly accessible concept is not available in static member function BCZ, it dosen't work for object.
3) To call static member function from non-member function, you have to use ClassName & .(dot) operator.
4) non-static members are not directly accessible from static member function. To access non-static members from static member function
   you have to use objectname & .(dot) operator.
5) You can call static member function using objectname & .(dot) operator also without change in meaning of static member function.
   In this case, object is just used to call static member function but not available inside static member function.
*/

class Number
{
	public int x;								//non-static datamember
	public static int y;						//static datamember
	
	public static void change()					//static member function
	{
		//System.out.println("x = " + x);			//error, non-static members are not accessible directly as no any calling object available
		System.out.println("y = " + y);			//valid, bcz y is static datamember
	}
	
	public void print()							//non-static member function
	{
		change();								//calling static member function from non-static member function OR Number.change();
		/*Note : here, T1 called print() & print() called change() But change() will not work for T1. BCZ, change() is static member
		         function & static member function works for class. */
	}
}

class Pro28
{
	public static void main(String args[])
	{
		Number T1,T2;
		T1 = new Number();
		T2 = new Number();
			
		T1.x = 10;
		Number.y = 20;
		T1.print();
		
		T2.x = 100;
		T2.y = 200;
		T2.print();
	}
}