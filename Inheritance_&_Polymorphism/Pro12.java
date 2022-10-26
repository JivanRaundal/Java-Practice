/* Q. How to call Parameterized constructors of Base class from Derived class constructors  ? => Using 'super' keywoard.

Rules to use 'super' keywoard :-

1) To pass parameters to Base class constructors, we have to use 'super' keywoard.
2) The super keywoard when used to pass parameters to Base class constructor must be written inside the Derived class constructor only.
   you cannot write super statement for parameter passing to Base constructor in any normal member function of Derived class.
3) The super statement when used to pass parameters to constructor, must be the first statement in Derived class constructor. Else, you will get error
   (Note : Rule 3 is applicable for passing parameter to constructors only, & not for normal member functions)
4) We cannot pass non-static datamembers of Derived class as a parameters to Base class constructor using 'super' keywoard.
   We can pass variables from Derived constructor parameter list as parameter in 'super' statement OR a static datamember of Derived class is also
   allowed.
*/

// calling parameterized constructor of Base class using super keywoard

class Grand
{
	Grand()
	{
		System.out.println("\nIn Grand default");
	}
	Grand(int a)
	{
		System.out.println("\nIn Grand para");
	}
}

class Base extends Grand
{
	int x = 10;
	static int y = 20;
	
	Base()
	{
		System.out.println("In Base default");
	}
	Base(int a,int b)
	{
		//super(x);				//error, cannot pass non-static datamember as a parameter to super
		super(y);				//valid, static datamembers are allowed
		System.out.println("In Base para");
		//super(10);			//error: call to super must be first statement in constructor
	}
}

class Derive extends Base
{
	Derive()
	{
		System.out.println("In Derive default");
	}
	Derive(int a,int b)
	{
		super(a,b);				//can pass variables from parameter list of Derived constructor as a parameter to super 
		System.out.println("In Derive para");
	}
}

class Pro12
{
	public static void main(String args[])
	{
		Derive obj = new Derive(5,6);
	}
}