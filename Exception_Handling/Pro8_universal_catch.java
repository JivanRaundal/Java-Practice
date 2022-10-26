/* # Universal Catch block :

Note :- 'Throwable' class is the Base class of all the exception classes.
        If we have reference variable of 'Throwable' class, we can catch any type of exception class object in it.
		
SYNTAX Universal catch :   catch(Throwable e)			//OR catch(Exception e)
						   {
							  //code here
						   }

Note :- Always mention Universal catch block at the end of all catch blocks. else, javac will give error - 'Unreachable code'
*/

class Pro8_universal_catch
{
	public static void main(String args[])
	{
		System.out.println("\nmain() starts");
		int res;
		int a = 10;
		int num[] = new int[5];
		
		try
		{
			res = a/2;
			System.out.println("\nres = " + res);
			num[8] = 90;
		}
		
		catch(ArithmeticException ref)
		{
			System.out.println("\ncan not divide by zero :: " + ref);
		}
		
		catch(Throwable e)					//OR catch(Exception e)   Universal catch block. can catch all types of exception, must be last catch
		{
			System.out.println("\nException Caught :: " + e);
		}
		
		System.out.println("\nmain() ends");
	}
}