// Q.19] Nested try-catch block & throw keyword

class Que19
{
	public static void main(String args[])
	{
		int res;
		int a=10,b=5;
		
		try
		{
			try
			{
				if(b==5)
				{
					throw new ArithmeticException();
				}
				res = a/b;
				System.out.println("\nres = " + res);
			}
			catch(ArithmeticException e)
			{
				System.out.println("\nException caught in Inner catch 1 :: " + e);
				throw e;					//rethrowing an exception
			}
			catch(Exception e)
			{
				System.out.println("\nException caught in Inner catch 2 :: " + e);
			}
		}
		catch(Exception e)
		{
			System.out.println("\nException caught in Outer catch   :: " + e);
		}
		System.out.println("\nmain() ends");
	}
}

