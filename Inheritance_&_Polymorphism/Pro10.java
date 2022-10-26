/* # Constructors in Inheritance :

Note :- Constructor's will get executed in the sequence of Inheritance. (From 1st Base class to Last Derive class)
*/

class Grand
{
	public Grand()						// 1
	{
		System.out.println("\nIn Grand default");
	}
}

class Base extends Grand
{
	public Base()						// 2
	{
		System.out.println("In Base default");
	}
}

class Derive extends Base
{
	public Derive()						// 3
	{
		System.out.println("In Derive default");
	}
}

class Pro10
{
	public static void main(String args[])
	{
		Derive obj = new Derive();		
	}
}