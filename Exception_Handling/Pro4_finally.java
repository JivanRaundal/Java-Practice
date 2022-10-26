/* # finally keyword :

-We usually write finally block after all the catch blocks.
-finally always gets executed after try-catch block, No matter if there is exception or if there is no any exception.
-In finally block we write the code used to free the resources occupied in try block. (same as destructor)
*/

class Pro4_finally
{
	public static void main(String args[])
	{
		System.out.println("\nmain() starts");
		int res;
		int a=10;
		
		try
		{
			//suspected code here
			res = a/0;				// created object of 'ArithmeticException' class and thrown automatically
			System.out.println("res = " + res);
		}
		catch(ArithmeticException e)					//if no any exception is generated in try block, catch block will be skipped
		{
			//exception handling code here
			System.out.println("\nCan not divide by zero :: " + e);	//when we print an object of exception class, overloaded 'toString()' gets called
			e.printStackTrace();			//this method will print stackTrace
		}
		finally
		{
			//code to free resources of try block
			System.out.println("\nfinally resources are free now");
		}
			
		System.out.println("\nmain() ends");
	}
}