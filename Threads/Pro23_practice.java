// Practice code :-

import java.util.Scanner;

class MyThread extends Thread 	// OR implements Runnable
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
				e.printStackTrace();
			}
		}
	}
}

class Pro23_practice
{
	public static void main(String args[]) throws InterruptedException
	{
		MyThread obj = new MyThread();

		Thread t;
		t = new Thread(obj);
		System.out.println(t);
		System.out.println("\nChild thread name = " + t.getName() + "    priority = " + t.getPriority());
		System.out.println("After creating t ki state = " + t.getState() + ", Is thread alive? = " + t.isAlive());
		
		t.setName("mythread");
		t.setPriority(9);
		
		System.out.println("Child thread name = " + t.getName() + "    priority = " + t.getPriority());
		
		t.start();
		//Thread.sleep(500);
		System.out.println("\nAfter starting t ki state = " + t.getState() + ", Is thread alive? = " + t.isAlive());
		
		t.join();				
		System.out.println("main ends");
		System.out.println("t ki state = " + t.getState() + ", Is thread alive? = " + t.isAlive());
	}
}