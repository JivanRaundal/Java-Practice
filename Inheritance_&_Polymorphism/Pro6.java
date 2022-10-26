/* # Ambuiguity Problem in Inheritance :

1) When Base class & Derive class both contain functions with sama name and we are calling that function using object of Derived class, then 
   function from Derive class will be called. Means, priority is given to it's own function.
2) In below eg, Derive class will have 2 show() functions, it's own show() & Base class show(). So, here priority is given to Derive class show(),
   when called  with Derive class object.
*/

class Base
{
	void show()
	{
		System.out.println("\nIn Base show()");
	}
}

class Derive extends Base
{
	void show()
	{
		System.out.println("\nIn Derive show()");
	}
}

class Pro6
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		obj.show();
	}
}