// Q.21] Create a 2-D array of 5*4. Initialize it at the time of declaration. Scan a number from user. Count how many times that number
// 		 is present in the array. use for each loop.

// Note => int num[][]; here, num is refernce to array of refernces

import java.util.Scanner;

class Que21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[][] = {{1,2,3,4},{10,21,5,6},{44,10,67,3},{76,34,10,6},{8,3,7,10}};		//2-D array of size 5*4
		
		System.out.println("\nPrinting array : ");
		for(int x[] : num)
		{
			for(int y : x)
			{
				System.out.print("\t" + y);
			}
			System.out.println();
		}
		
		int n,count=0;
		System.out.println("\nEnter number : ");
		n = sc.nextInt();
		
		for(int[] y : num)
		{
			for(int x : y)
			{
				if(x == n)
					count++;
			}
		}
		
		System.out.println(n + " occurs " + count + " times in array");
	}
}