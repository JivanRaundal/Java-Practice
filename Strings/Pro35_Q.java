// Q. Scan a String from user. Convert it into lowercase without using toLowerCase() and charAt() function.

import java.util.Scanner;

class Pro35_Q
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("\nEnter String : ");
		str = sc.nextLine();
		
		char arr[] = str.toCharArray();			//converting string into character array
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >= 'A' && arr[i] <= 'Z')
			{
				arr[i] = (char)(arr[i]+32);
			}
		}
		
		String res = new String(arr);			//char array to string
		
		System.out.println("\nres = " + res);
		System.out.println("str = " + str);
	}
} 