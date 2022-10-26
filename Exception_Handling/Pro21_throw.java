// 'throw' Keyword :- Used to throw exceptions explicitly.

// eg :

class Pro21_throw
{
	public static void main(String args[])
	{
		int res;
		int a=10,b=5;
		
		try
		{
			if(b == 5)
			{
				throw new ArithmeticException(); 			//throwing an exceptione explicitly
			}
			res = a/b;
			System.out.println("\nres = " + res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nException caught :: " + e);
		}
		
		System.out.println("\nmain() ends");
	}
}