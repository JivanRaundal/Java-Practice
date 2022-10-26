/* # final Keyword :-

Note :- Uses of final keyword -
		1) to create read only (constant) local & class variables.
		2) to stop your class from getting Inherited in another class. (To stop Inheritance of your class)
		  i.e. final classes cannot be Inherited
		3) to stop functions in our class from getting overriden in Derive class. 
		   In this case, Derive class has to use that final function from Base class without overriding it.
*/

//eg - final class

final class Base					//final class
{
	void show()
	{
		System.out.println("\nIn Base show()");
	}
}

class Derive extends Base			//ERROR, cannot Inherit final class Base
{
	
}

class Pro17_final
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		obj.show();
	
		//(new Base()).show();			//this is valid
	}
}