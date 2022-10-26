// calling one member function from another :-

class Number
{
	public int x;
	public int y;
	
	public void set(Number T)
	{
		x = 10;
		y = 20;
		T.x = 5;
		T.y = 6;
		
		print();		//will work for calling object of set()
		T.print();		//will work for T 
	}
	
	public void print()
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Pro15
{
	public static void main(String args[])
	{
		Number obj,var;
		obj = new Number();
		var = new Number();
		
		obj.set(var);
	}
}