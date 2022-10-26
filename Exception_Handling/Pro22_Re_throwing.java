// Re-throwing an exception :

class Pro22_Re_throwing
{
	public static void main(String args[])
	{
		int res;
		int a=10, b=5;
		
		try
		{
			try
			{
				if(b==5)
				{
					throw new ArithmeticException();				//throwing an exception
				}
				res = a/b;
				System.out.println("\nres = " + res);
			}
			catch(ArithmeticException e)
			{
				System.out.println("\nException caught in Inner catch 1 :: " + e);
				throw e;								// Re-throwing an exception
			}
			catch(Exception e)					//will not caught in catch of same try, it will try to find matching catch in Outer try-catch
			{
				System.out.println("\nException caught in Inner catch 2 :: " + e);
			}
		}
		catch(Exception e)
		{
			System.out.println("\nException caught in Outer catch :: " + e);
		}
		
		System.out.println("\nmain() ends");
	}
}