// Exceptions in Nested try-catch functions :-

class Pro12_nested_fun
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
		res = 10/0;
		System.out.println("\nres = " + res);
	}
}