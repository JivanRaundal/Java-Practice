/* # throws Keyword :-

Note(Hindi) : -Agar aapko checked exception handle nahi karna hai, toh jo function aap ke function ko call karega usse inform kardo ki aapka function
			   function checked exception generate kar sakta hai.
			  
			  -Agar aapko kisi bhi function me checked exception handle nahi karna hai, toh aapko har calling function ko inform karna hoga ki aapka function
			   checked exception generate kar sakta hai.
			  
			  -In that case, we have to declared checked exception to be thrown using 'throws' keyword from function generating exception to the main()
			   and then from main() to JVM (if you don't want to handle exception in main() also).
*/

// eg: note the throws keyword

class Pro26_throws
{
	public static void main(String args[]) throws InterruptedException			//Now, JVM will handle this exception if generated & will terminate code
	{
		show();							//error: unreported exception InterruptedException; must be caught or declared to be thrown 
	}
	
	static void show() throws InterruptedException	//show() is informing it's calling function that handle InterruptedException
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i = " + i);
			Thread.sleep(500);			//error: unreported exception InterruptedException; must be caught or declared to be thrown Hence, throw it using throws
		}
	}
}