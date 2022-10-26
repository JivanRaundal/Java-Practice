// Q.2]

// Note :- Use of final keyword
//        1) To create read only local & class variables.
//        2) To stop your class from getting inhrtited in another class. (final class cannot be inhrtited)
//        3) To stop function in our class from getting overriden in derived class. Derive class has to use that final function from base class. 

class Base
{
	int x,y;
	
	void getData()
	{
		x = 10;
		y = 20;
	}
	
	final void show()			//final method cannot be overriden
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class  Derive extends Base
{
	void setData()
	{
		x = 11;
		y = 22;
	}
	
	/*void show()			//error: show() in Derive cannot override show() in Base
	{
		
	}*/
}

class Que2
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		obj.getData();
		obj.show();
		obj.setData();
		obj.show();
	}
}