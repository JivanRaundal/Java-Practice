// Q. Scan a String from user. Count number of capital alphabets in String.

import java.util.Scanner;

class Pro31_Q
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		int i,count=0;
		
		System.out.print("\nEnter String : ");
		str = sc.nextLine();
		
		for(i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				count++;
			}
		}
		System.out.println("\nTotal capital alphabets in String = " + count);
	}
} 