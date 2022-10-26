// recursion :-

// Q. print 1 to 10 numbers using recursion.

class Pro6
{
	public static void main(String args[])
	{
		show(10);
	}
	
	static void show(int x)
	{
		if(x > 0)
		{
			show(x-1);
			System.out.println("x = " + x);
		}
	}
}