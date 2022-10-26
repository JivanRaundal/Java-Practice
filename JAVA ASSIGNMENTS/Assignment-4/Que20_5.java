// Q 20.5] Using InputStreamReader and BufferedReader, scan 3 double values from user. Find the largest of them without using if else.

import java.io.*;

class Que20_5
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);
		
		String S1,S2,S3;
		
		System.out.println("\nEnter 3 double values : ");
		S1 = bfr.readLine();
		S2 = bfr.readLine();
		S3 = bfr.readLine();
		
		//converting strings into double format
		double x,y,z;
		x = Double.parseDouble(S1);
		y = Double.parseDouble(S2);
		z = Double.parseDouble(S3);
		
		double max;
		max = x > y ? x : y;
		max = max > z ? max : z;
		
		System.out.println("\nLargest among " + x + "," + y + " & " + z + " is = " + max);
	}
} 