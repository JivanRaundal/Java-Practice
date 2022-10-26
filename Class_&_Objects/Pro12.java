// Passing object as a parameter to member function :-

// Note :- In below eg, we are passing an object to print() function as a parameter. Hence, there are total two objects available in
//         print() function. But, only calling objects members are directly accessible from print() function. For rest of the objects,
//		   you have to use object & .(dot) operator to access their members.

class Number
{
	public int x;
	public int y;
	
	public void print(Number T)
	{
		System.out.println("x = " + x + "\ty = " + y);			//members of calling object are directly accessible here.
		System.out.println("T.x = " + T.x + "\tT.y = " + T.y);	//members of object which is passed as a parameter are accessed using
																//object & .(dot) operator		
	}
}

class Pro12
{
	public static void main(String args[])
	{
		Number obj,var;
		obj = new Number();
		var = new Number();
		
		obj.x = 10;
		obj.y = 20;
		var.x = 5;
		var.y = 6;
		
		obj.print(var);			//obj called print() & var is passed as a parameter
	}
}