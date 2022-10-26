// Q. WAP to forcefully stop execution of thread.

import java.util.*;

class MyThread implements Runnable
{
	volatile public boolean val = true;
	
	public void run()
	{
		int i=0;
		String name = Thread.currentThread().getName();
		while(val)
		{
			i++;
			System.out.println(name + " i = " + i);
		}
	}
}

class Pro24_Q
{
	public static void main(String args[]) throws InterruptedException
	{
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
		
		Thread.sleep(5000);
		obj.val = false;
		
		System.out.println("\nmain ends");
	}
}