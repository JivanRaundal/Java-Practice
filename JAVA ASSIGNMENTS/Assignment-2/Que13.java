// Q.13] Scan an array of 8 characters from user. count only capital alphabets in array.

import java.util.Scanner;

class Que13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		char arr[] = new char[8];
		int count = 0;
		
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<8; i++)
		{
			System.out.print("\narr[" + i + "] : ");
			str = sc.next();
			arr[i] = str.charAt(0);			//Or direclty arr[i] = sc.next().charAt(0);
		}
		
		//counting capital aplphabets in array
		for(char ch : arr)
		{
			if(ch >= 'A' && ch <= 'Z')
				count++;
		}
		
		System.out.println("\nTotal capital alphabets in array = " + count);
	}
}
