// if-else
	
// Q. Scan a character from user check if it is small, capital alphabet or some
//	  other alphabet.

import java.util.Scanner;

class Pro21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		char ch;
		
		System.out.println("Enter character : ");
		str = sc.next();
		ch = str.charAt(0);
		
		
		if((int)ch >= 97 && (int)ch <= 122)
		{
			System.out.println("Small alphabet");
		}
		else if((int)ch >= 65 && (int)ch <= 90)
		{
			System.out.println("Capital alphabet");
		}
		else
		{
			System.out.println("Some other alphabet");
		}
	}
}