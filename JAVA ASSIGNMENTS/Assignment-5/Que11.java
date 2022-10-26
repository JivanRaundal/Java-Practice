// Q.11] 
// Note: In interfaces, there will be no any ambuiguity with functions, ambuiguity can be generated for datamembers only.

interface Intr1
{
	int x = 10;			//static & final by default
	
	void print();		//public & abstract by default
	
	void show();
}

interface Intr2
{
	int x = 20;
	
	void disp();
	
	void show();
}

class Myclass implements Intr1 , Intr2
{
	public void print()
	{
		System.out.println("\nIn Myclass print()");
	}
	
	public void disp()
	{
		System.out.println("\nIn Myclass disp()");
	}
	
	public void show()							//only 1 overriden method show() can satisfy show() of both interfaces
	{
		System.out.println("\nIn Myclass show()");
		//System.out.println("x = " + x);			//ambuiguity => error: reference to x is ambiguous
		System.out.println("Intr1.x = " + Intr1.x);
		System.out.println("Intr2.x = " + Intr2.x);
	}
}

class Que11
{
	public static void main(String args[])
	{
		Myclass obj = new Myclass();
		obj.print();
		obj.disp();
		obj.show();
	}
}