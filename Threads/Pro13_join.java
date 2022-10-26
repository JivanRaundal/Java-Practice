/* # join() method :-

-non-static method of class Thread.
-The thread executing "t.join();" statement will wait for thread 't' to complete it's execution.
-join() method throws InterruptedException. 
*/

// eg: NOTE: In below code to see difference comment t.join(); statement & check difference.

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
		System.out.println("\nchild thread is exiting");
	}
}

class Pro13_join
{
	public static void main(String args[]) 
	{
		Mythread obj = new Mythread();
		
		Thread t = new Thread(obj);
		
		t.start();
		
		try
		{
			t.join();		// "main thread" will wait till thread 't' completes it's execution.
			//NOTE: The thread executing 't.join()' statement will wait for 't' thread to complete it's execution.		
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("\nmain() ends");
	}
}