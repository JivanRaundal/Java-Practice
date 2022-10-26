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
	public int x;				//non-static datamember
	public static int y;		//static datamember
	
	public static void change(Number Temp)			//static member function
	{
		//x++;				//error, non-static members are not accessible directly as no any calling object available
		Temp.x++;
		y++;				//valid, bcz y is static datamember
	}
	
	public void print()		//non-static member function
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Pro27
{
	public static void main(String args[])
	{
		Number T1,T2,T3;
		T1 = new Number();
		T2 = new Number();
		T3 = new Number();
		
		//to call static member function from non-member function, we use ClassName & .(dot) operator
		Number.change(T1);			//calling static member function using ClassName & .(dot) operator
		
		T1.print();
		
		//you can also call static member function using objectname & .(dot) operator without change in meaning of static member function
		T2.change(T2);
		T2.print();
		
		Number.change(T3);
		T3.print();
	}
}