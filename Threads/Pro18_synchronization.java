/* # Why Synchronization ??

Note: -Output of the following code is Unpredictable.
      -Bcz, all threads are executing run() method for the same object, which gives unpredictable output BCZ, same datamember x is access by all
	   threads.
	  -To get the desired output, the method which is executed by multiple threads should be made synchronized.
	  
NOTE: In following code, all threads are executing run() method for same object.
*/

// eg- unpredictable output

class Synch implements Runnable
{
	int x = 1;
	
	public void run()				//non-synchronized
	{
		String name = Thread.currentThread().getName();
		System.out.println("x = " + x + " name = " + name);
		x++;
		System.out.println("x = " + x + " name = " + name);
	}
}

class Pro18_synchronization
{
	public static void main(String args[]) 
	{
		Synch obj = new Synch();
		
		Thread t1,t2,t3;
		t1 = new Thread(obj,"first");		//working for obj
		t2 = new Thread(obj,"second");		//working for obj
		t3 = new Thread(obj,"third");		//working for obj
		
		t1.start();
		t2.start();
		t3.start();	
	}
}