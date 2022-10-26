// Q.9]

import java.io.*;

class Que9
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);
		
		String S1,S2,S3;
		
		System.out.print("\nEnter String 1 : ");
		S1 = bfr.readLine();
		System.out.print("Enter String 2 : ");
		S2 = bfr.readLine();
		System.out.print("Enter String 3 : ");
		S3 = bfr.readLine();
		
		//check which string will first go in library
		if(S1.compareTo(S2) < 0 && S1.compareTo(S3) < 0)
		{
			System.out.println("\nString 1 will go first in dictionary");
		}
		else if(S2.compareTo(S1) < 0 && S2.compareTo(S3) < 0)
		{
			System.out.println("\nString 2 will go first in dictionary");
		}
		else if(S3.compareTo(S1) < 0 && S3.compareTo(S2) < 0)
		{
			System.out.println("\nString 3 will go first in dictionary");
		}
		else
		{
			System.out.println("\nAll 3 strings are same, any one can go first in dictionary");
		}
	}
}