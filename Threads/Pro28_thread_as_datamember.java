/* # Creating thread as a datamember of class :-

NOTE:- Never start thread in constructor. We can say that object is in valid state only when it's constructor executes completely.
       If a thread is set on some object, then before starting that thread, that object must be in a valid state.
NOTE:- Don't use 'stop()' method to stop execution of thread, use some other logic like boolean value to stop execution of thread
       because, 'stop()' method is depricated (banned) as it is not thread safe.
*/

//eg:- creating thread as a datamember of class

class MyThread extends Thread
{
	Thread t;				//composotion (creating thread as a datamember)
	volatile boolean value = true;
	
	public MyThread()
	{
		t = new Thread(this);		//this reference stores reference of calling object
		//t.start();					//Don't start thread in constructor (BCZ object is not in valid state)
	}
	
	public void run()
	{
		long i=0;
		while(value)
		{
			i++;
		}
		System.out.println("i = " + i);
	}
	
	void startThread()
	{
		value = true;
		t.start();
	}
	
	void stopThread()
	{
		value = false;
	}
	
}

class Pro28_thread_as_datamember
{
	public static void main(String args[]) throws InterruptedException
	{
		MyThread obj = new MyThread();
		obj.startThread();
		Thread.sleep(5000);
		obj.stopThread();
		
		/* //creating and starting thread in main()
		obj.t = new Thread(obj);
		obj.t.start*();
		*/
		
		System.out.println("Restarting thread");
		obj = new MyThread(); 			//OR obj.t = new Thread(obj);
		obj.startThread();
		Thread.sleep(5000);
		obj.stopThread();
	}
}