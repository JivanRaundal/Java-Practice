/* # Synchronization :-

NOTE: In following code each thread is working for different object so no need of synchronization here.
*/

class Synch implements Runnable
{
	public void run()
	{
		int i;
		for(i=1; i<=5; i++)
		{
			System.out.println("i = " + i + " " + Thread.currentThread().getName());
		}
	}
}

class Pro17_synchronization
{
	public static void main(String args[])
	{
		Synch obj1 = new Synch();
		Synch obj2 = new Synch();
		Synch obj3 = new Synch();
		
		Thread t1,t2,t3;
		t1 = new Thread(obj1,"first");
		t2 = new Thread(obj2,"second");
		t3 = new Thread(obj3,"third");
		
		t1.start();
		t2.start();
		t3.start();
	}
}