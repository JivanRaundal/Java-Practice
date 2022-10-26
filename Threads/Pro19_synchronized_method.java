/* # synchronized method :-   'synchronized' keyword.

-synchronization is simply a lock applied on method.
-synchronization is applicable only when multiple threads are executing same method for same object.
-If multiple methods are executing same method for different objects then applying synchronization is useless.
-When method becomes synchronized, only one thread can take control of this method and all remaining threads will keep waiting until the thread 
 in control finishes it's execution. 
-simply, thread entering the synchronized method applies lock on this method so that no other thread can enter in this method.

NOTE: If thread is waiting to take control of synchronized method, then it's state is BLOCKED.
*/

//eg: synchronized method

class Synch implements Runnable
{
	int x = 1;
	
	synchronized public void run()				//synchronized method
	{
		/*try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}*/
		String name = Thread.currentThread().getName();
		System.out.println("x = " + x + " name = " + name);
		x++;
		System.out.println("x = " + x + " name = " + name);
	}
}

class Pro19_synchronized_method
{
	public static void main(String args[]) throws InterruptedException
	{
		Synch obj = new Synch();
		
		Thread t1,t2,t3;
		t1 = new Thread(obj,"first");		//working for obj
		t2 = new Thread(obj,"second");		//working for obj
		t3 = new Thread(obj,"third");		//working for obj
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(15);
		System.out.println("\nt3 ki state = " + t3.getState() + ", is t3 alive?? " + t3.isAlive() + "\n");		// BLOCKED  true
		
	}
}