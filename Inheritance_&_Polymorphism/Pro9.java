/* # super keyword  :- It referes to members of Base class.

1) We use 'super' keyword in Derived class member functions to refer members of their Base class.
2) We mostly use it when Base class and Derived class have members with same name. (not syntactical rule)
3) 'super' keyword is not accessible in static member functions. It is used only in non-static member function of Derived class.
   But it can call static members of Base class from non-static member function of Derived class.
4) Note : When we use 'super' keyword to call Base class function from Derived class function, we can write that statement in Derive class function
          at any position, at the beginning, in the middle or at the end, as per requirements. (This is not the case with Constructor's (will see))
*/

// Multilevel Inheritance

class Grand
{
	int x = 5;
	void show()
	{
		System.out.println("\nIn Grand show() Grand-x = " + x);
	}
}

class Base extends Grand
{
	int x = 10;
	void show()
	{
		System.out.println("\nIn Base show() Base-x = " + x + "\tGrand-x = " + super.x);
		super.show();					//Grand show() will call
	}
}

class Derive extends Base
{
	int x = 20;
	void show()
	{
		System.out.println("\nIn Derive show() Derive-x = " + x + "\tBase-x = " + super.x);
		//show();					//this will recursively call Derive show()
		
		//to call Base show() from Derive show(), we have to use 'super' keyword
		super.show();				//Base show() will be call
	}
	
	static void print()
	{
		System.out.println("\nIn Derive static print()");
		//super.show();				//error, super keyword cannot be used in static member function
	}
}

class Pro9
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		obj.show();					//Derive show() will call

	}
}