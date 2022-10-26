/* # throws Keyword :-

Note(Hindi) : -Agar aapko checked exception handle nahi karna hai, toh jo function aap ke function ko call karega usse inform kardo ki aapka function
			   function checked exception generate kar sakta hai.
			  
			  -Agar aapko kisi bhi function me checked exception handle nahi karna hai, toh aapko har calling function ko inform karna hoga ki aapka function
			   checked exception generate kar sakta hai.
			  
			  -In that case, we have to declared checked exception to be thrown using 'throws' keyword from function generating exception to the main()
			   and then from main() to JVM (if you don't want to handle exception in main() also).
*/

// Note: you can throw multiple checked exceptions using 'throws' keyword. But will actually throws one exception at a time.

import java.io.*;

class Pro28_throws
{
	public static void main(String args[]) throws InterruptedException			//Now, JVM will handle this exception if generated & will terminate code
	{
		myfun();							
	}
	
	static void myfun() throws InterruptedException
	{
		try
		{
			yourfun();
		}
		catch(IOException e)			//Handling IOException here, no need to throw further
		{
			System.out.println("\nException caught :: " + e);
		}
	}
	
	static void yourfun() throws InterruptedException , IOException
	{
		show();
	}
	
	static void show() throws InterruptedException , IOException
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i = " + i);
			Thread.sleep(500);			//error: unreported exception InterruptedException; must be caught or declared to be thrown Hence, throw it using throws
		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);
		String str;
		System.out.print("\nEnter String : ");
		str = bfr.readLine();		//error: unreported exception IOException; must be caught or declared to be thrown Hence, throw it using throws
		System.out.println("Str = " + str);
	}
}