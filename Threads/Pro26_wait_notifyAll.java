/* # wait() & notifyAll() methods :-

NOTE:
-To call wait() from your method, your method must be synchronized.
-Q. WHY wait() method?
-1) To avoid polling (process of checking again & again) (Logical rule)
-2) Techniqually, wait() method releases the lock applied on synchronized method, so that other thread can enter the method.
    Hence to remove lock, wait() method must be called inside the synchronized method or block.	
	
NOTE: (hindi)
notifyAll() call karte hi un sabhi threads ko notify wala message jayega jo threads same object keliye WAITING state me gaye hai. 
So that woh apna execution resume kar sake.

CONCLUSION :- Inter-Thread Communication is possible between those threads which are in wait state and working(executing) for same object.
*/

// eg:

class MyThread implements Runnable
{
	synchronized public void run()
	{
		String name = Thread.currentThread().getName();
		
		if(name.equals("even"))
		{
			System.out.println(name + " is going to wait");
			try
			{
				wait();				//wait() method releases lock on method, so that some other thread will enter the method. 
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name + " is resumed");
		}
		else
		{
			System.out.println(name + " is in else part and notifying other threads");
			
			notifyAll();			//this method will notify all threads which are in WAITING state to resume their execution
			
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Pro26_wait_notifyAll
{
	public static void main(String args[]) throws InterruptedException
	{
		MyThread ref = new MyThread();
		
		Thread even,odd;
		even = new Thread(ref,"even");
		odd  = new Thread(ref,"odd");
		
		even.start();
		Thread.sleep(5000);
		odd.start();
	}
}