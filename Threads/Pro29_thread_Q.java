// Q. Create a child thread having name "chintu". Print 1 to 10 using chintu with 500 miliseconds gap.

class Mythread extends Thread 		//implments Runnable
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		int i;
		for(i=1; i<=10; i++)
		{
			System.out.println(name + " i = " + i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

class Pro29_thread_Q
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("main starts");
		
		Mythread obj = new Mythread();
		
		Thread t = new Thread(obj,"chintu");
		t.start();
		t.join();
		
		System.out.println("main ends");
	}
}