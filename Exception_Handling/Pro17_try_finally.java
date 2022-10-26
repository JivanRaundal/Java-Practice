/* # try with finally & without catch is allowed. 

Note: try with finally & without catch is allowed. In this case it will not catch the exception but will execute, even if code is terminated due to 
      no matching catch. 
*/

// eg :

class Pro17_try_finally
{
	public static void main(String args[])
	{
		int res;
		
		try
		{
			res   = 10/0;
		}
		finally
		{
			System.out.println("\nIn finally");
		}
		
		System.out.println("\nmain() ends");
	}
}