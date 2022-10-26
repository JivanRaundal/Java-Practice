// Q.5] Abstract class

abstract class Base
{
	int x = 10;
	
	abstract void show();			//abstract method, does not have body
	
	void print()
	{
		System.out.println("\nIn Base print() x = " + x);
	}
}

class Derive1 extends Base
{
	int y = 20;
	
	public void show()			//overriding abstract method of Base class in Derive class
	{
		System.out.println("\nIn Derive show() x = " + x + " y = " + y);
	}
}

abstract class Derive2 extends Base		//if we don't override abstract method of then we have to declare Derive class as abstract
{
	
} 

class Que5
{
	public static void main(String args[])
	{
		//Base bobj = new Base();				//cannot create object of abstract class
		//Derive2 dobj = new Derive2();			//cannot create object
		
		Derive1 var = new Derive1();
		var.show();
	}
}


