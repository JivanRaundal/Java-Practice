/* # try-catch blocks :-

-All the exceptions in java are inbuilt classes.
-When we say that exception is generated means an object of one of the exception classes has been created and thrown also. (Actually reference of
 that exception object gets thrown)
-Now, it's your duty to catch that object in catch block.

# try-catch blocks :-
1) try block : statements which you think may generate an exception and all those statements depending on that exception prone statements are 
               placed in try block.

2) catch block : Exception handling code is written inside the catch block.

Note :- If we do not handle exceptions explicitly using try-catch then in this case exception is handled by JVM : the default exception handler.
        In this case JVM handles the exception & terminates the execution of program.	   
*/

// eg:

class Pro2_try_catch
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
			System.out.println("\nException Caught : can not divide by zero.");
		}
		
		System.out.println("\nmain() ends");
	}
}

