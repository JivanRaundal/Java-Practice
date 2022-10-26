/*
 # RULE :- (Hindi) jo object member function ko call karega, member function ussi object keliye kaam karega. Matlab calling object
			ke members, called member function me directly accessible honge. (directly means without using object & .(dot) operator.
			
Note :- 1) In below eg, in statement 1, obj called show(), hence show() is working for obj. It means members of obj are directly 
		   accessible from show(). Hence, statement 3 accesses x & y of obj.
		2) Similarly, in statement 2, var calls show(), hence show() now works for var. So, in statement 3 x & y are of var.
*/

class Number
{
	public int x;
	public int y;
	
	public void show()
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Pro5
{
	public static void main(String args[])
	{
		Number obj = new Number();
		Number var = new Number();
		
		System.out.println("\nobj.x = " + obj.x + "\tobj.y = " + obj.y);
		System.out.println("var.x = " + var.x + "\tvar.y = " + var.y);
		
		obj.x = 10;
		obj.y = 20;
		
		var.x = 100;
		var.y = 200;
		
		System.out.println("\nobj called show()");
		obj.show();
		
		System.out.println("\nvar called show()");
		var.show();
	}
}