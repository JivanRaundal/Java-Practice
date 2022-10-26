
// example :

class Number
{
	public int x = 10;
	public int y = 20;
	
	public void set()
	{
		System.out.println("\nIn set()");
		x = 15;
		y = 25;
	}
	
	public void show()
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Pro6
{
	public static void main(String args[])
	{
		Number obj;
		obj = new Number();
		
		System.out.println("\nDefault values of x & y");
		obj.show();
		
		obj.set();
		
		System.out.println("\nAfter changing x & y in set()");
		obj.show();
	}
}