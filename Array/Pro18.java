/* Passing 2-D array to function :-

Note :- When we pass array to function, we actually pass reference of that array. Hence changes made in array from called function,
		becomes visible in calling function  also.
*/

import java.util.Scanner;

class Pro18
{
	public static void main(String args[])
	{
		int [][]num;
		num = new int[3][4];
		
		scanArray(num);
		printArray(num);
	}
	
	public static void scanArray(int arr[][])
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("\nEnter array elements : ");
		for(i=0; i<arr.length; i++)
		{
			for(j=0; j<arr[i].length; j++)
			{
				System.out.print("arr[" + i + "][" + j + "] : ");
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	static void printArray(int arr[][])
	{
		System.out.println("\nPrinting array : ");
		for(int []x : arr)
		{
			for(int y : x)
			{
				System.out.print("\t" + y);
			}
			System.out.println();
		}
	}
}