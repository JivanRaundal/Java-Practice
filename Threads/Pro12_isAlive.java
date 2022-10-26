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
		try
		{
			Thread.sleep(3000);		//for 3 seconds
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class Pro12_isAlive
{
	public static void main(String args[]) throws InterruptedException
	{
		Mythread obj = new Mythread();
		
		Thread t = new Thread(obj);
		
		System.out.println("\nafter create & before start, is t alive?? = " + t.isAlive() + " state = " + t.getState());	 //false  NEW 
		 
		t.start();
				
		Thread.sleep(100);
				
		System.out.println("\nafter start & in TIMED_WAITING, is t alive?? = " + t.isAlive() + " state = " + t.getState());	 //true TIMED_WAITING
		
		Thread.sleep(5000);			//for 5 seconds
		
		System.out.println("\nafter termination, is t alive?? = " + t.isAlive() + " state = " + t.getState());			//false  TERMINATED
	}
}