// Recursion :
// conditional recursion (Terminating condition)

class Pro3
{
	public static void main(String args[])
	{
		show(1);
		System.out.println("main ends");
	}
	
	static void show(int x)
	{
		if(x <= 2)
		{
			System.out.println("x = " + x);		//will print during recursion
			show(x+1);
			System.out.println("x = " + x);		//will print during backtracking
		}
	}
}