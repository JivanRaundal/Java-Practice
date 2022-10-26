/* # interfaces :-

1) We can define non-static member functions inside the interfaces using 'default' keyword .
   eg:-  public default void print()
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
6) We can define static member functions inside the interfaces. But static member function of interface never get inherited in Derived class.
   You have to call them using interface_name & .(dot) operator in Derived class.
   eg:-  static void disp()			//static function of interface never get inherited
		 {
			 //body
		 }
*/

interface Intr 
{
	int x = 10;				//static final by default
	
	void show();			//public & abstract by default
	
	default void print()		//default method can be define inside the interfaces 	(Note :- 'default' is just keyword here) public by default
	{
		System.out.println("\nIn Intr print() x = " + x);
	}
}

class Myclass implements Intr 
{
	public void show()
	{
		System.out.println("\nIn Myclass show() x = " + x);
	}
}

class Pro32_interface
{
	public static void main(String args[])
	{
		Myclass obj = new Myclass();
		obj.show();
		obj.print();				//calling default method 
	}
}