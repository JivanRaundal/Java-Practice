/* # default handler JVM :
 -If generated exception type does not match with the exception mentioned in catch block then, generated exception will go to 
  JVM : the default exception handler. In that case, JVM handles the exception and terminates the code.
*/

class Pro6_default_handler
{
	public static void main(String args[])
	{
		System.out.println("\nmain() starts");
		int res;
		int a=10;
		
		try
		{
			//suspected code here
			res = a/0;				// created object of 'ArithmeticException' class and thrown automatically but no matching catch
			System.out.println("res = " + res);
		}
		catch(NullPointerException e)					
		{
			//exception handling code here
			System.out.println("Exception Caught :: " + e);	
		}
		finally 	//Note :- although code gets terminated, finally will execute
		{
			//code to free resources of try block
			System.out.println("\nfinally resources are free now");
		}
			
		System.out.println("\nmain() ends");			//this will not execute due to return statement in catch block
	}
}