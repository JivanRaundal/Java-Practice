
// Q. How to scan StringBuffer from user ?
// Solution=> Create normal string object & scan it from user & pass string object as a parameter to StringBuffer constructor.

import java.io.*;
import java.util.*;

class Pro42_StringBuffer
{
	public static void main(String args[]) throws IOException
	{		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);

		Scanner sc = new Scanner(System.in);
		
		String str;
		System.out.println("\nEnter String : ");
		str = sc.nextLine();							//scan normal string object
		StringBuffer sb = new StringBuffer(str);		//create StringBuffer from normal string object
		
		System.out.println("\nString = " + str);
		
		System.out.println("\nEnter String : ");
		str = bfr.readLine();
		StringBuffer strbuf = new StringBuffer(str);
		
		System.out.println("\nString = " + strbuf);
	}
}