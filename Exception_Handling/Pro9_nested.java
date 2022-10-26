/* # Nested try-catch blocks :-

-If an exception is generated in any try block then,
1) It will check in it's own catch blocks.
2) will check in catch blocks of outer try-catch (which incudes exception generating try block)

Note: After exception generation, the first requirement of control is to get matching catch.
      -First it tries to find matching catch in it's own catch blocks.
	  -If not found, then tries to find matching catch in it's outer try-catch blocks.
	  -If nowhere found, then JVM handles the exception & terminates the code.
*/

// eg :-

class Pro9_nested
{
	public static void main(String args[])
	{
		int res;
		int a = 10;
		
		try				//Outer try-catch
		{
			try			//Inner try-catch
			{
				res = a/0;					// 'ArithmeticException'
				System.out.println("\nres = " + res);
			}
			catch(ArithmeticException e)
			{
				System.out.println("\nException caught in inner catch block :: " + e);
			}
			
			System.out.println("\nInner try-catch ends");
		}
		catch(Exception e)
		{
			System.out.println("\nException caught in outer try-catch block :: " + e);
		}
		
		System.out.println("\nOuter try-catch ends");
	}
}