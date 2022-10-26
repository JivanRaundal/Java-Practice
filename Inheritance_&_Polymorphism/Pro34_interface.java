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

interface Intr1
{
	public default void print()
	{
		System.out.println("\nIn Intr1 print()");
	}
}

interface Intr2
{
	default void print()			//default method is public by default (no need to mention public explicitly)
	{
		System.out.println("\nIn Intr2 print()");
	}
}

class Myclass implements Intr1 , Intr2
{
	//Myclass has 2 print() functions here, 1 from Intr1 & another from Intr2
	//Overriding print() here
	public void print()
	{
		System.out.println("\nIn Myclass print()");
		//super.print();				//error
		
		Intr1.super.print();			//Intr1 print() gets called					
		Intr2.super.print();			//Intr2 print() gets called
	}
}

class Pro34_interface
{
	public static void main(String args[])
	{
		Myclass obj = new Myclass();
		obj.print();				//Myclass print() will get Called
	}
}