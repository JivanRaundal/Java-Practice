// Q.12] 

class Que12
{
	public static void main(String args[])
	{
		int res;
		int a = 10;
		
		System.out.println("\nmain() starts");
		
		try
		{
			res = a/0;				// 'ArithmeticException'
			System.out.println("\nres = " + res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nException caught :: " + e);
			return;					//although we are returning from function, finally will be excecuted
		}
		finally
		{
			System.out.println("\nFinally resources are free");
		}
		
		System.out.println("\nmain() ends");
	}
}