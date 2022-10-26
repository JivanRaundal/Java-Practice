// Q. WAP to check blocked state of threads.

class Synch extends Thread
{
	public int x = 0;
	
	synchronized public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Before ++ x = " + x + " " + name);
		x++;
		System.out.println("After ++ x = " + x + " " + name);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class Pro25_Q
{
	public static void main(String args[]) 
	{
		Synch obj = new Synch();
		
		Thread t1,t2,t3;
		t1 = new Thread(obj,"one");
		t2 = new Thread(obj,"two");
		t3 = new Thread(obj,"three");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("t1 ki state = " + t1.getState());
		System.out.println("t2 ki state = " + t2.getState());
		System.out.println("t3 ki state = " + t3.getState());
	}
}