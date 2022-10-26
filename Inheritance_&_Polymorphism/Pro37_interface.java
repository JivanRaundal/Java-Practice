/* # interfaces :-

1) We can define non-static member functions inside the interfaces using 'default' keyword .
   eg:-  default void print()		//access-specifier is public by default
		 {
			 //body
		 }
2) 'default' is keyword here, which is informing Java Compiler that the method is not abstract method & it is non-static method.
3) If you don't use 'default' keyword then method becomes abstract by default.
4) access-specifier of default method is also public by default.
5) We can define private methods also inside the interfaces. In this case, no need to mention 'default' keyword. BCZ, compiler knows that 
   abstract + private is invalid combination hence, it does not treat private methods as a abstract.
   eg:-  private void show()
		 {
			 //body
		 }
6) protected modifier is not allowed in interfaces. Means, we can't define protected method in interfaces
7) We can define static member functions inside the interfaces. But static member function of interface never get inherited in Derived class.
   You have to call them using interface_name & .(dot) operator in Derived class. In this case, no need to mention 'default' keyword. 
   BCZ, compiler knows that abstract + static is invalid combination hence, it does not treat static methods as a abstract.
   eg:-  static void disp()			//static function of interface never get inherited
		 {
			 //body
		 }
*/

// eg :- Rule-5

interface Intr
{	
	int x = 10;
	
	void show();		//public * abstract by default
	
	default void disp()		//default method
	{
		System.out.println("\nIn Intr disp() x = " + x);
		print();			//calling one function from another, print() will work for calling object of disp()
	}
	
	private void print()		//private member function of interface
	{
		System.out.println("\nIn Intr print() x = " + x);
	}
	
	/*protected default void myfun()			//ERROR, protected modifier is not allowed in interfaces
	{
		System.out.println("\nIn Intr myfun() x = x");
	} */
}

class Myclass implements Intr 
{
	public void show()			//overriding abstract method show()
	{
		System.out.println("\nIn Myclass show() x = " + x);
		//print();				//error, print() is private in Intr 
	}
}

class Pro37_interface
{
	public static void main(String args[])
	{
		Myclass obj = new Myclass();
		//obj.print();			//error, print is private
		obj.show();
		obj.disp();
	}
}