// Exceptions in Nested try-catch functions :-

class Pro14_nested_fun
{
	public static void main(String args[])
	{
		System.out.println("\nmain() starts");
		
		try
		{
			myfun();
			System.out.println("\nIn main() try block");
		}
		catch(Exception e)
		{
			System.out.println("\nException caught in main() catch :: " + e);
		}
		
		System.out.println("\nmain() ends");
	}
	
	static void myfun()
	{
		int res;
		
		try
		{
			res = 10/0;										// 'ArithmeticException'
			System.out.println("\nres = " + res);	
		}
		catch(ArithmeticException e)				//matching catch found
		{
			System.out.println("\nException caught in myfun() catch :: " + e);
		}
		
		System.out.println("\nmyfun() ends");
	}
}