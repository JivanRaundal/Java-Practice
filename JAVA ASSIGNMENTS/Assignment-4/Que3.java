// Q.3] WAP to check the sequence of execution of anonymous block, static block & consturctor.

// Sequence => 1) static block 2) anonymous block 3) consturctor

class Number
{
	public int x = 10;
	public static int y = 20;
	
	static
	{
		System.out.println("\nIn static block, y = " + y);		//non-static members are not accessible
	}
	
	{
		System.out.println("\nIn anonymous block, x = " + x + "\ty = " + y);
	}
	
	public Number()
	{
		System.out.println("In default consturctor, x = " + x + "\ty = " + y);
	}
}

class Que3
{
	public static void main(String args[])
	{
		Number T1,T2;
		T1 = new Number();
		T2 = new Number();
	}
}