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
   You have to call them using interface_name & .(dot) operator in Derived class. In this case, no need to mention 'default' keyword. 
   BCZ, compiler knows that abstract + static is invalid combination hence, it does not treat static methods as a abstract.
   eg:-  static void disp()			//static function of interface never get inherited
		 {
			 //body
		 }
*/

// eg :- Rule-6

interface Intr
{
	static void print()			//public by default, No need to mention 'default' keyword here, BCZ compiler knows static+abstract is invalid
	{
		System.out.println("\nIn Intr static print()");
		disp();					//calling one static function from another
	}
	
	private static void disp()		
	{
		System.out.println("\nIn Intr static disp()");
	}
}

class Myclass implements Intr 
{
	public static void show()
	{
		System.out.println("\nIn Myclass static show()");
		//print();					//error, print() of Intr is not inherited in Myclass BCZ it is static function of interface
		Intr.print();				//We have to use interface_name & .(dot) operator to call static function print() of interface
		//Intr.disp();				//error. disp() is private in Intr 
	}
}

class Pro36_interface
{
	public static void main(String args[])
	{
		//Myclass.print();				//error, print() is not inherited in Myclass
		Myclass.show();
	}
}