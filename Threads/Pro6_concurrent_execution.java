/* # Concurrent Execution of Threads :-

Note: -In following examples, execution of both threads i.e. "main thread" & "t thread" (child thread) is simultaneous / concurrent.
      -Don't think about their output printing sequence on console, bcz, it changes everytime.
	  -Only keep remember that execution of both threads is simultaneous/concurrent.
*/

//eg:

class Mythread extends Thread
{
	public void run()
	{
		int i;
		for(i=1; i<=10; i++)
		{
			System.out.println(Thread.currentThread().getName() + " i = " + i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Pro6_concurrent_execution
{
	public static void main(String args[])		//throws InterruptedException 	//valid for the Thread.sleep() statement inside main
	{
		Mythread obj = new Mythread();
		Thread t;
		t = new Thread(obj);
		t.start();
		
		int i;
		for(i=41; i<=50; i++)
		{
			System.out.println(Thread.currentThread().getName() + " i = " + i);
			try
			{
				Thread.sleep(800);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}