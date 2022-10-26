// Q.8] Create a Jagged array. Print all elements in a Jagged array using for each loop.

import java.util.Scanner;

class Que8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[][] = new int[4][];
		
		num[0] = new int[3];
		num[1] = new int[4];
		num[2] = new int[2];
		num[3] = new int[5];
		
		System.out.println("\nEnter elements of Jagged array");
		for(int i=0; i<num.length; i++)			//num stores reference of whole 2-D array
		{
			for(int j=0; j<num[i].length; j++)		//num[i] stores reference of ith 1-D array of num, where num is 2-D array
			{
				System.out.print("num[" + i + "][" + j + "] : ");
				num[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nPrinting Jagged array : ");
		for(int[] x : num)
		{
			for(int y : x)
			{
				System.out.print(" " + y);
			}
			System.out.println();
		}
	}
}