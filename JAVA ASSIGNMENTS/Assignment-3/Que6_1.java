// Q.6] Scan an array of n integers. Scan a number from user. Search this number in array and remove it from array. Make your code modular.
// Note :- this code will delete all occurences of number in array.

import java.util.Scanner;

class Que6_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[]  = createArray();
		printArray(num);
		
		int x;
		System.out.print("\nEnter element you want to delete : ");
		x = sc.nextInt();
		
		deleteElement(num,x);			
		
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
	
	public static void deleteElement(int arr[],int x)
	{
		int i,j,flag=0;
		for(i=0; i<arr.length; i++)
		{
			if(arr[i] == x)
			{
				flag=1;
				for(j=i; j<arr.length-1; j++)
				{
					arr[j] = arr[j+1];
				}
				arr[j] = 0;
				i--;				//if x is continuous in array eg-{3,3} then due to shifting, 2nd x may miss to compare. hence i--;
									//due to this we are doing 1 comparison extra in each interation of outer for loop
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found in array");
		}
	}
}