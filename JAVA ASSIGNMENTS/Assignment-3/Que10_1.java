// Q.10-1] Complete the code for given main() function.

import java.util.Scanner;

class Que10_1
{
	public static void main(String args[])
	{
		int arr[];
		arr = getArray(5);
		deleteElement(arr,10);	//10 is the element to be deleted
		printArray(arr);
	}
	
	public static int[] getArray(int n)
	{
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[n];
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<n; i++)
		{
			System.out.print("element " + i + " : ");
			num[i] = sc.nextInt();
		}
		return num;
	}
	
	public static void printArray(int num[])
	{
		System.out.println("\nPrinting Array : ");
		for(int x :  num)
		{
			System.out.print(" " + x);
		}
	}
	
	public static void deleteElement(int num[],int x)
	{
		int i,j;
		for(i=0; i<num.length; i++)
		{
			if(num[i] == x)
			{
				for(j=i; j<num.length-1; j++)
				{
					num[j] = num[j+1];
				}
				num[j] = 0;
				i--;			//if same element is present continuous i.e {1,2,10,10,5}
			}
		}
	}
}