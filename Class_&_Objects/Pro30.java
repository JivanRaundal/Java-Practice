/* # static member function :-

1) static member function always works for the class & not for any specific object.
2) Directly accessible concept is not available in static member function BCZ, it dosen't work for object.
3) To call static member function from non-member function, you have to use ClassName & .(dot) operator.
4) non-static members are not directly accessible from static member function. To access non-static members from static member function
   you have to use objectname & .(dot) operator.
5) You can call static member function using objectname & .(dot) operator also without change in meaning of static member function.
   In this case, object is just used to call static member function but not available inside static member function.
   
	Note :- static member functions of same class can call each other directly.
*/

class Number
{
	public int c;
	public static int y;
	
	public static void change()
	{
		System.out.println("In change()");
		//print();					//error, cannot call print() directly bcz print() is non-static member function
		show();						//can call show() directly bcz, show() is also static member function of same class
	}
	
	public void print()
	{
		System.out.print("In print()");;
	}
	
	public static void show()
	{
		System.out.println("In show()");
	}
}

class Pro30
{
	public static void main(String args[])
	{
		Number.change();			//calling static member function using ClassName & .(dot) operator
	}
}