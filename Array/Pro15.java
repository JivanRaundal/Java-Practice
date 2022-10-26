// Scanning & Printing 2-D array using for loop.

import java.util.Scanner;

class Pro15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int [][]num;
		num = new int[3][4];
		
		int i,j;
		System.out.println("\nEnter array elements : ");
		for(i=0; i<3; i++)
		{
			for(j=0; j<4; j++)
			{
				System.out.print("num[" + i + "][" + j + "] : ");
				num[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n\nPrinting array : ");
		for(i=0; i<num.length; i++)
		{
			for(j=0; j<num[i].length; j++)
			{
				System.out.print("\t" + num[i][j]);
			}
			System.out.println();
		}
	}
}