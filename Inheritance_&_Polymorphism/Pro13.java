/* # Sequence of execution of static block, anonymous block & Constructor in case of Inheritance :-
	
	1) Base class static block 
	2) Derive class static block
	
	3) Base class anonymous block
	4) Base class default const
	
	5) Derive class anonymous block
	6) Derive class default const
*/ 

class Grand
{
	static
	{
		System.out.println("\nIn Grand static block");
	}
	{
		System.out.println("\nIn Grand anonymous block");
	}
	Grand()
	{
		System.out.println("\nIn Grand default const");
	}
}

class Base extends Grand
{
	static
	{
		System.out.println("\nIn Base static block");
	}
	{
		System.out.println("\nIn Base anonymous block");
	}
	Base()
	{
		System.out.println("\nIn Base default const");
	}
}

class Derive extends Base
{
	static
	{
		System.out.println("\nIn Derive static block");
	}
	{
		System.out.println("\nIn Derive anonymous block");
	}
	Derive()
	{
		System.out.println("\nIn Derive default const");
	}
}

class Pro13
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
	}
}