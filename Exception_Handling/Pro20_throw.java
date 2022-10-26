// 'throw' Keyword :- Used to throw exceptions explicitly.

// eg :

class Pro20_throw
{
	public static void main(String args[])
	{
		try
		{
			ArithmeticException ae = new ArithmeticException();
			throw ae;					//throwing an exceptione explicitly
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nException caught :: " + e);
		}
		
		System.out.println("\nmain() ends");
	}
}