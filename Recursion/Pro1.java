// Recursion
// Example => StackOverflowError

class Pro1
{
	public static void main(String args[])
	{
		show(1);
		System.out.println("main ends");
	}
	
	static void show(int x)
	{
		System.out.println("x = " + x);
		show(x+1);
	}
}