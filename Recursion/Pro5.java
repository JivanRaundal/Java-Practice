// recursion :-

// Q. print 1 to 10 numbers using recursion.

class Pro5
{
	public static void main(String args[])
	{
		show(1);
	}
	
	static void show(int x)
	{
		if(x <= 10)
		{
			System.out.println("x = " + x);
			show(x+1);
		}
	}
}