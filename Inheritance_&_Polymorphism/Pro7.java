/* # Ambuiguity Problem in Inheritance :

Note :- In following situation, Priority is given to Immediate / Nearest Parent class's function.
        i.e. In following example, When you call show() using object of Derive class, then priority is given to Nearest parent class. i.e Base class
		show() will be called.

Note :- In C++, we are getting Ambuiguity Error with same problem.
*/

class Grand
{
	void show()
	{
		System.out.println("\nIn Grand show()");
	}
}

class Base extends Grand
{
	void show()
	{
		System.out.println("\nIn Base show()");
	} 
}

class Derive extends Base
{
	//here, Derive class will have 2 show(), One from Base class & Other from Grand class, but priority is given to Nearest class show()
	//i.e. Base show() 
}

class Pro7
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		obj.show();			//Base show() will be called BCZ, it is nearest class of Derive class
	}
}