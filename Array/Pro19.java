// Functions returning 2-D array :-

// return type of function should be int[][], if function is returning reference of 2-D array

import java.util.Scanner;

class Pro19
{
	public static void main(String args[])
	{
		int num[][];
		num = createArray();
		
		System.out.println("\nPrinting array : ");
		for(int x[] : num)
		{
			for(int y : x)
			{
				System.out.print("\t" + y);
			}
			System.out.println();
		}
	}
	
	static int[][] createArray()					//returntype is int[][]
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][4];
		
		System.out.println("\nEnter elements of 3*4 2-D array: ");
		int i;
		for(int x[] : arr)			//scanning using for each loop, you can use for loop also
		{
			i=0;
			for(int y : x)
			{
				x[i] = sc.nextInt();
				i++;
			}
		}
		
		return arr;			//returning reference of 2-D array
	}
}