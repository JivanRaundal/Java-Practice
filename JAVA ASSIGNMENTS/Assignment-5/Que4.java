// Q.4] Jagged Array

import java.util.Scanner;

class Que4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int m,n,i,j;
		System.out.print("\nEnter number of rows of Jagged Array : ");
		m = sc.nextInt();
		
		int num[][] = new int[m][];			//will just create array of references
		
		//scanning number of columns for each row in jagged array
		for(i=0; i<num.length; i++)
		{
			System.out.print("Enter number of columns for " + i + "th row : ");
			n = sc.nextInt();
			num[i] = new int[n];			//will create array of integers for each reference in reference array
		}
		
		//scanning jagged array using while loop
		System.out.println("\nEnter elemenets of jagged array : ");
		i=0;
		while(i < num.length)
		{
			j=0;
			while(j < num[i].length)
			{
				System.out.print("element num["+i+"]["+j+"] : ");
				num[i][j] = sc.nextInt();
				j++;
			}
			i++;
		}
		
		//printing jagged array using for each loop.
		System.out.println("\n\nPrinting Jagged Array :\n");
		for(int arr[] : num)
		{
			for(int x : arr)
			{
				System.out.print(" " + x);
			}
			System.out.println();
		}
	}
}