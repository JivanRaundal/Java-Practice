/* # Checked & Unchecked Exceptions :

# Checked Exceptions :
-The exceptions which are checked by compiler. So that programmer will handle them compulsory are called checked exceptions.
-Here, compiler will check that if we are handling exception or not. If not, then compiler will generate an error and will force the programmer to handle that
 exception.
-Java provides checked exceptions just for smooth execution of program.
-eg: IOException, InterruptedException.
-When we do not handle checked exceptions, compiler generates following error
 error : Unreported exception IOException; must be caught or declared to be thrown.  (it is just an compile time error, and not exception) 
 
*/

//eg : Checked Exception

class Pro24_checked_exceptions
{
	public static void main(String args[])		//throws InterruptedException
	{
		int i;
		for(i=1; i<=10; i++)
		{
			System.out.println("i = " + i);
			
			//Thread.sleep(500);		//here, sleep() method can generate 'InterruptedException' which is checked exception. So, compiler gives error if not handled
									// or thrown explicitly using 'throws' keyword.
			//error: unreported exception InterruptedException; must be caught or declared to be thrown
			
			try
			{
				Thread.sleep(500);			//this method will make execution stop for 500 miliseconds (process will go to sleep)
			}
			catch(InterruptedException e)
			{
				System.out.println("\nException caught :: " + e);
			}
		}
	}
}