// Q.12] Keep Scanning a character from user until user enters '?'. Print the count of capital & small alphabets. (using for loop)

import java.util.Scanner;

class Que12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		char ch;
		int c=0,c1,c2;
		
		System.out.println("\nKeep entering characters & enter '?' to STOP : ");
		str = sc.next();
		ch = str.charAt(0);
		
		for(c=c1=c2=0; ch != '?'; c++)
		{
			if((int)ch>=65 && (int)ch<=90)
			{
				//capital alphabet
				c1++;
			}
			else if((int)ch>=97 && (int)ch<=122)
			{
				//small alphabet
				c2++;
			}
			
			//keep scanning character
			str = sc.next();
			ch = str.charAt(0);
		}
		
		System.out.println("\nTotal characters   = " + c);
		System.out.println("Capital alphabets  = " + c1);
		System.out.println("Small alphabets    = " + c2);
	}
}