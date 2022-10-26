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

import java.io.*;

class Pro23_checked_exceptions
{
	public static void main(String args[])		//throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);
		
		String str = "";
		System.out.println("\nEnter String : ");
		
		//str = bfr.readLine();					// error: unreported exception IOException; must be caught or declared to be thrown
		
		try
		{
			str = bfr.readLine();
		}
		catch(IOException e)
		{
			System.out.println("\nException caught :: " + e);
		}
		
		System.out.println("\nString = " + str);
	}
}