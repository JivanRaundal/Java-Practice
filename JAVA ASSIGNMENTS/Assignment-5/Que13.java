// Q.13] Array of strings

import java.io.*;

class Que13
{
	public static void main(String args[])			//throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);
		
		String arr[] = new String[6];
		
		System.out.println("\nEnter 6 city names : ");
		int i;
		try
		{
			for(i=0; i<arr.length; i++)
			{
				arr[i] = bfr.readLine();				//can generate IOException
				arr[i] = arr[i].toUpperCase();			//converting string into uppercase
			}
		}
		catch(IOException e)
		{
			System.out.println("\nExceptioncaught :: " + e);
		}
		
		System.out.println("\nPrinting city names : ");
		for(String city : arr)
		{
			System.out.println(city);
		}
		
		System.out.println("\nPrinting cities whose name starts with 'S' : ");
		for(i=0; i<arr.length; i++)
		{
			if(arr[i].charAt(0) == 'S')
			{
				System.out.println(arr[i]);
			}
		}
	}
}