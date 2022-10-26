// Q.4] WAP to explain static keyword.

// static datamembers, static functions & static block

class Number
{
	int x = 5;				//non-static datamember
	static int y = 10;		//static datamember
	
	static					//static block
	{
		System.out.println("\nIn static block");
		//x = 10;		//error, non-static static members are not accessible in static block
		y = 20;			//static members are accessible
	}
	
	void show()
	{
		System.out.println("\nIn non-static static show() x = " + x + "\ty = " + y);
	}
	
	static void print(Number T)		//static member function
	{
		System.out.println("\nIn static print() T.x = " + T.x + "\ty = " + y);
	}
}

class Que4
{
	public static void main(String args[])
	{
		Number obj = new Number();
		obj.show();
		Number.print(obj);
	}
}