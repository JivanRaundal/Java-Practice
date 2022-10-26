// # interface (trial & errors) :-

interface Intr
{
	//default int y = 5;			//error, datamembers cannot be default in interface
	//private int z = 4;			//error, datamembers cannot be private in interface
	int x = 10;						//valid, they are satic final by default
	
	default void show()
	{
		System.out.println("In Inter show() x = " + x);
	}
}

class Myclass implements Intr
{
	public Myclass()
	{
		System.out.println("In Myclass default constructor");
		Intr.super.show();
	}
}

class Pro38_interface
{
	public static void main(String args[])
	{
		//Myclass obj = new Myclass();		//valid
		Intr var = new Myclass();			//Note :- we an create reference var of Interface but not an object & reference var of Interface 
											//        can store objects of it's Derive classes.
	}
}