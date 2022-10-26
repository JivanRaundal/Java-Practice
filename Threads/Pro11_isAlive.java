/* # isAlive() method :-  is your thread alive ??

-non-static method of class Thread.
-It will return boolean value 'true' if thread is alive, else will return 'false'.
-we will not face any checked exceptions in case of 'isAlive()' method.

# NOTE:
			THREAD STATES			isAlive() ??
		 1)  NEW					false
		 2)  RUNNABLE				true
		 3)  TIMED_WAITING			true
		 4)  WAITING				true
		 5)  TERMINATED				false
*/

//eg:

class Mythread extends Thread
{
	public void run()
	{
		while(true)
		{
			//will go in infinite loop
		}
	}
}

class Pro11_isAlive
{
	public static void main(String args[]) 
	{
		Mythread obj = new Mythread();
		
		Thread t = new Thread(obj);
		
		System.out.println("\nAfter create & Before start, is t alive?? = " + t.isAlive());			//false
		
		t.start();
				
		System.out.println("\nAfter start, is t alive?? = " + t.isAlive());							//true
	}
}