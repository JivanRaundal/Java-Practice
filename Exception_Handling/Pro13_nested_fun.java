// Exceptions in Nested try-catch functions :-

class Pro13_nested_fun
{
	public static void main(String args[])
	{
		System.out.println("\nmain() starts");
		
		try
		{
			myfun();
			System.out.println("\nIn try block");
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
		catch(ArrayIndexOutOfBoundsException e)				//no matching catch for 'ArithmeticException'
		{
			System.out.println("\nException caught in myfun() catch :: " + e);
		}
		
		System.out.println("\nmyfun() ends");
	}
}