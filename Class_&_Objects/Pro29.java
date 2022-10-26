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
	
	public static void change(Number Temp)		//static member function
	{
		//print();						//error, non-static member cannot be accessed directly in static mem-fun needs object to access it
		Temp.print();					//Temp is calling print() 
	}
	
	public void print()
	{
		System.out.println("In print()");
	}
	
	public void show()
	{
		print();						//non-static member function can be called directly from another non-static member function
										//bcz, calling object is available
	}
}

class Pro29
{
	public static void main(String args[])
	{
		Number T1;
		T1 = new Number();
		
		T1.show();
		
		Number.change(T1);
	}
}