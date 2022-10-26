// Q.6] Scan an array of n integers. Scan a number from user. Search this number in array and remove it from array. Make your code modular.
// Note :- this code will delete only one occurence of number.

import java.util.Scanner;

class Que6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[]  = createArray();
		printArray(num);
		
		int x;
		System.out.print("\nEnter element you want to delete : ");
		x = sc.nextInt();
		
		int i = search(num,x);			//search() will return index at which element is found
		if(i == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
			deleteElement(num,i);	//will delete element at ith index
		}
		
		printArray(num);
		
	}
	
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("\nHow many integers ? ");
		n = sc.nextInt();
		
		int []arr = new int[n];
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<n; i++)
		{
			System.out.print("element " + i + " : ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int arr[])
	{
		System.out.println("\nPrinting Array : ");
		for(int x : arr)
		{
			System.out.print(" " + x);
		}
	}
	
	public static int search(int arr[],int x)
	{
		int i;
		for(i=0; i<arr.length; i++)
		{
			if(arr[i] == x)
			{
				return i;	//return index if found
			}
		}
		return -1;			//if not found
	}
	
	public static void deleteElement(int arr[],int k)
	{
		int i;
		for(i=k; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[i] = 0;
	}
}