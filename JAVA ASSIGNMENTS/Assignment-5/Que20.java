// Q.20] WAP to explain working of throws keyword

import java.io.*;

class Que20
{
	public static void main(String args[]) throws InterruptedException
	{
		try
		{
			show();
		}
		catch(IOException e)				//handling IOException here
		{
			System.out.println("\nException :: " + e);
		}
	}
	
	static void show() throws InterruptedException , IOException
	{
		myfun();
	}
	
	static void myfun() throws InterruptedException , IOException
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i = " + i);
			Thread.sleep(500);						//can generate 'InterruptedException'
		}
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);
		String str;
		System.out.print("\nEnter String : ");
		str = bfr.readLine();						//can generate IOException
		System.out.println("String = " + str);
	}
}