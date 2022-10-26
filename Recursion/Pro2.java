// Recursion :
// conditional recursion (Terminating condition)

class Pro2
{
	public static void main(String args[])
	{
		show(1);
		System.out.println("main ends");
	}
	
	static void show(int x)
	{
		System.out.println("x = " + x);
		if(x <= 2)
		{
			show(x+1);
		}
	}
}