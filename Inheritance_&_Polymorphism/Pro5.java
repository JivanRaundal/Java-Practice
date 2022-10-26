// Inheritance :-

// Note :- In case of static members, both Base & Derive classes will have single copy of static datamembers.

class Base
{
	public int x;
	public static int y;
	
	public static void show()
	{
		System.out.println("In Base static show()");
	}
}

class Derive extends Base
{
	public void print()
	{
		System.out.println("In Derive print() x = " + x + "\ty = " + y);
	}
}

class Pro5
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		obj.print();
		Derive.show();
		Derive.y = 10;
		obj.print();
		Base.y = 20;
		obj.print();
	}
}