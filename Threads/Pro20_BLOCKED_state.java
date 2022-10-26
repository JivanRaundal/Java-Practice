/* # BLOCKED state :-

-If thread is waiting to take control of synchronized method then it's state is BLOCKED. 
-At a time only one thread can take control of synchronized method & remaining threads are in BLOCKED state.
*/

//eg:

class Synch implements Runnable
{
	int x = 1;
	
	synchronized public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("before ++, x = " + x + " " + name);
		x++;
		System.out.println("after  ++, x = " + x + " " + name);
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class Pro20_BLOCKED_state
{
	public static void main(String args[]) throws InterruptedException
	{
		Synch obj = new Synch();
		
		Thread t1 = new Thread(obj,"first");
		Thread t2 = new Thread(obj,"second");
		Thread t3 = new Thread(obj,"third");
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(2000);
		
		System.out.println("t1 ki state = " + t1.getState());			// TIMED_WAITING
		System.out.println("t2 ki state = " + t2.getState());			// BLOCKED
		System.out.println("t3 ki state = " + t3.getState());			// BLOCKED
	}
}