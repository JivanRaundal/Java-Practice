// Q.1] Create an array of n integers in main() function. Sort it in descending order using insertion sort().

import java.util.Scanner;

class Que1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("\nHow many integers ? ");
		n = sc.nextInt();
		
		int num[] = new int[n];
		
		System.out.println("Enter array elements :");
		for(int i=0; i<n; i++)
		{
			System.out.print("element " + i + " : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\n\nArray before sorting :");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
		
		sort(num);
		
		System.out.println("\n\nArray after sorting :");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
	}
	
	public static void sort(int arr[])
	{
		//Insertion sort  : no swapping only shifting
		int i,j,temp;
		
		for(i=1; i<arr.length; i++)
		{
			temp = arr[i];
			for(j=i-1; j>-1; j--)
			{
				if(arr[j] < temp)			//descending order
				{
					arr[j+1] = arr[j];
				}
				else
				{
					break;
				}
			}
			arr[j+1] = temp;
		}
	}
}