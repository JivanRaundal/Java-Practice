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

//eg:

class Number
{
	synchronized public void show()
	{
		String name = Thread.currentThread().getName();
		if(name.equals("one"))
		{
			System.out.println(name + " is going in wait state");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name + " resumed it's execution");
		}
		else
		{
			System.out.println(name + " is giving notification");
			
			notifyAll();			//will notify all threads which are in wait state for same object
			
			System.out.println(name + " is executing for 10 seconds");
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name + " ends here");
		}
	}
}

class MyThread implements Runnable
{	
	Number num;			//composition
			
	public MyThread(Number ref)
	{
		num = ref;
	}
	
	public void run()
	{
		/*synchronized(num)		//synchronized block (needed if show() method is not synchronized)
		{
			num.show();
		} 
		*/
		num.show();
	}
}

class Pro27_wait_notifyAll
{
	public static void main(String args[]) throws InterruptedException
	{
		Number num = new Number();
		MyThread ref1 = new MyThread(num);
		MyThread ref2 = new MyThread(num);
		
		Thread t1,t2;
		t1 = new Thread(ref1,"one");
		t2 = new Thread(ref2,"two");
		t1.start();
		Thread.sleep(5000);
		t2.start();
	}
}