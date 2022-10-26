// Q.7] Scan an array of n integers using recursive scan() function.

import java.util.Scanner;

class Que7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("\nHow many integers ? ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("\nEnter array elements : ");
		scanArray(arr,0);		//will recursively scan array
		
		System.out.println("\nPrinting array elements : ");
		printArray(arr,0);		//will recursively prin array
	}
	
	public static void scanArray(int num[],int i)
	{
		Scanner sc = new Scanner(System.in);
		
		if(i == num.length)
		{
			return;
		}
		else
		{
			System.out.print("element " + i + " : ");
			num[i] = sc.nextInt();
			scanArray(num,i+1);
		}
	}
	
	public static void printArray(int num[],int i)
	{
		if(i == num.length)
		{
			return;
		}
		else
		{
			System.out.print(" " + num[i]);
			printArray(num,i+1);
		}
	}
}