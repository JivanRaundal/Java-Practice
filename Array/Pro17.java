// Q. Create 2-D array of size m*n, where m & n are given by user, Scan it using for loop & print using for each loop.

import java.util.*;

class Pro17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int m,n;
		System.out.println("\nEnter number of rows    : ");
		m = sc.nextInt();
		System.out.println("Enter number of columns : ");
		n = sc.nextInt();
		
		int num[][] = new int[m][n];
		
		System.out.println("\nEnter array elemnts : ");
		int i,j;
		for(i=0; i<num.length; i++)
		{
			for(j=0; j<num[i].length; j++)
			{
				System.out.print("element num[" + i + "][" + j + "] : ");
				num[i][j] = sc.nextInt();
			}
		}
		
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
} 