/* # Synchronized block / Synchronized object :-

NOTE: In following eg, all 3 threads are set for 3 different objects, but from that objects run() methods (i.e. from 3 different run() methods)
      change() method will get called for the same object of class ThirdParty (i.e. for ref). which will give Unpredictable output. Hence make
	  change() method synchronized or make object ref synchronized using synchronized block.
	  
Q.Why synchronized block ?? 
-Suppose, class ThirdParty is defined by mr.Somebody & he doesn't make change() method synchronized, then output will be Unpredictable. 
 to avoid this, we have to use synchronized block to apply synchronization on object.

NOTE: In following code, making run() method synchronized is useless BCZ, run() method is executing for different objects. You have to make change()
      method synchronized.
	  
-refer notebook notes for digram.
*/

class ThirdParty
{
	int x = 1;
	
	void change()						// not mentioning synchronized keyword here, instead calling this method from synchronized block				
	{
		String name = Thread.currentThread().getName();
		int i;
		for(i=1; i<=5; i++)
		{
			x++;
			System.out.println(name + " x = " + x);
		}
	}
}

class Synch implements Runnable
{
	ThirdParty ref;					
	
	public Synch(ThirdParty temp)		
	{
		ref = temp;
	}
	
	public void run()
	{
		synchronized(ref)		//synchronized block (making object synchronized)
		{
			ref.change();		//calling change() method from synchronized block using synchronized object ref
		}
		
		//ref.change();			//without synchronization
	}
}

class Pro22_synchronized_block_for_object
{
	public static void main(String args[]) 
	{
		ThirdParty tp = new ThirdParty();
		
		Synch obj1 = new Synch(tp);
		Synch obj2 = new Synch(tp);
		Synch obj3 = new Synch(tp);
		
		Thread t1 = new Thread(obj1,"first");
		Thread t2 = new Thread(obj2,"second");
		Thread t3 = new Thread(obj3,"third");
		
		t1.start();
		t2.start();
		t3.start();
	}
}