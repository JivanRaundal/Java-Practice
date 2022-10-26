// Q. Scan a String from user. Count number of capital alphabets in String. You cannot use length() function of String.

import java.util.Scanner;

class Pro32_Q
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		int i,count=0;
		
		System.out.print("\nEnter String : ");
		str = sc.nextLine();
		
		char arr[];
		arr = str.toCharArray();				//converting string into character array
		
		for(char ch : arr)		//for each loop
		{
			if(ch>='A' && ch<='Z')
			{
				count++;
			}
		}
		
		System.out.println("\nTotal capital alphabets in String = " + count);
	}
} 