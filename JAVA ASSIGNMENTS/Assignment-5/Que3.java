// Q.3] 

import java.util.Scanner;

class Que3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[][];
		num = new int[3][4];
		
		System.out.println("\nEnter elements of 3*4 2-D array : ");
		int i,j;
		for(i=0; i<num.length; i++)
		{
			for(j=0; j<num[i].length; j++)
			{
				num[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n\nPrinting 2-D array (3*4) : ");
		for(int arr[] : num)				//for each loop
		{
			for(int x : arr)
			{
				System.out.print("  " + x);
			}
			System.out.println();
		}
	}
}