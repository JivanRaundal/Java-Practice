/* # Polymorphism :-

# FUNCTION OVER-RIDING :- 
1) Inheritance is must for overriding. We cannot implement overriding in same class. Overriden functions must be in different classes.
2) Header of functions to be overriden must be same (including returntype) in Derive & Base class.
3) Access-specifier of overriden functions in Derive class must be same or having stronger privileges.
   private => default => protected => public     (Base <= Derive)

# RUNTIME POLYMORPHISM :-
1]Note :- for runtime polymorphism we need
		1) Overriden function
		2) reference variable of Base class.
2] Reference variable of Base class can store reference of object of it's own class & it can also store reference of objects of it's Derive classes.
   (only one at a time)
3] If there is runtime polymorphism, then correct function call decision will be made at runtime depending upon content of reference variable.
4] If there is no runtime polymorphism, then correct function call decision will be made at compile time depending upon datatype of reference variable 
*/

// eg-runtime polymorphism

class Base
{
	protected void show()
	{
		System.out.println("\nIn Base show()");
	}
}

class Derive extends Base
{
	public void show()		//show() of Base class is Overriden here
	{
		System.out.println("\nIn Derive show()");
	}
}

class Pro14_poly
{
	public static void main(String args[])
	{
		Base ref;				//reference variable of Base class
		
		ref = new Base();		//ref stores reference of object of Base class
		ref.show();				//Base class show() will call
		
		ref = new Derive();		//ref stores reference of object of Derive class
		ref.show();				//Derive class show() will call
	}
}