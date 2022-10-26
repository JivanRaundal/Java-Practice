/* # super keyword  :- It referes to members of Base class.

1) We use 'super' keyword in Derived class member functions to refer members of their Base class.
2) We mostly use it when Base class and Derived class have members with same name. (not syntactical rule)
3) 'super' keyword is not accessible in static member functions. It is used only in non-static member function of Derived class.
   But it can call static members of Base class from non-static member function of Derived class.
4) Note : When we use 'super' keyword to call Base class function from Derived class function, we can write that statement in Derive class function
          at any position, at the beginning, in the middle or at the end, as per requirements. (This is not the case with Constructor's (will see))
*/

class Base
{
	int x = 10;
	void show()
	{
		System.out.println("\nIn Base show()");
	}
	
	static void disp()
	{
		System.out.println("\nIn Base static disp()");
	}
}

class Derive extends Base
{
	int x = 20;
	void show()
	{
		System.out.println("\nIn Derive show() Derive-x = " + x + "\tBase-x = " + super.x);
		//Base.show();				//error, cannot call Base show() like this
		//show();					//this will recursively call Derive show()
		
		//to call Base show() from Derive show(), we have to use 'super' keyword
		super.show();				//Base show() will be call
		
		super.disp();				//can call static member function of Base class using 'super'
		//Base.disp();              //this is also valid to call static function of Base class
	}
	
	static void print()
	{
		System.out.println("\nIn Derive static print()");
		//super.disp();				//error, super keyword cannot be used in static member function
	}
}

class Pro8
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		obj.show();					//Derive show() will call
		
		//obj.Base.show();			//cannot call Base show() using object of Derive in non-member function
		
		Derive.print();
	}
}