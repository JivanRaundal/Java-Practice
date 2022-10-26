// Recursion :
// conditional recursion (Terminating condition)

class Pro4
{
	public static void main(String args[])
	{
		show(5);
		System.out.println("main ends");
	}
	
	static void show(int x)
	{
		System.out.println("x = " + x);		
		if(x >= 2)
		{
			x--;
			show(x-1);
		}
		System.out.println("x = " + x);		
	}
}