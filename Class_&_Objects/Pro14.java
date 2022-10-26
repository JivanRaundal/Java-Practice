// Calling one member function from another member function :-

// Note :- In below eg, obj called set() & set() called print(), Hence print() is working for obj.
//		   It means, calling object for print() is same as calling object of set();

class Number
{
	int x;
	int y;
	
	public void set()
	{
		x = 10;
		y = 20;
		print();		//calling one member function from another :- print() will work for calling object of set()
	}
	public void print()
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Pro14
{
	public static void main(String args[])
	{
		Number obj;
		obj = new Number();
		
		obj.set();
	}
}