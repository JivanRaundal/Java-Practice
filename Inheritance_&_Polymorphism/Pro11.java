/* # Constructors in Inheritance :

Note :- Constructor's will get executed in the sequence of Inheritance. (From 1st Base class to Last Derive class)
*/

class Grand
{
	public Grand()						// 1
	{
		System.out.println("\nIn Grand default");
	}
	
	public Grand(int a)
	{
		System.out.println("In Grand para");
	}
}

class Base extends Grand
{
	public Base()						// 2
	{
		System.out.println("In Base default");
	}
	
	public Base(int a)
	{
		System.out.println("In Base para");
	}
}

class Derive extends Base
{
	public Derive()						
	{
		System.out.println("In Derive default");
	}
	
	public Derive(int a)				// 3
	{
		System.out.println("In Derive para");
	}
}

class Pro11
{
	public static void main(String args[])
	{
		Derive obj = new Derive(10);		
	}
}