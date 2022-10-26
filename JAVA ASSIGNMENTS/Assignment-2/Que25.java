// Q.25] Scan 2-D array of 4*5 from user. print it's column-wise & row-wise addition.

import java.util.Scanner;

class Que25
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int [][]num = new int[4][5];
		
		int i,j;
		System.out.println("\nEnter elements of (4*5) 2-D array : ");
		for(i=0; i<num.length; i++)
		{
			for(j=0; j<num[i].length; j++)
			{
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
		
		//row-wise addition
		int addrow = 0;
		for(i=0; i<num.length; i++)				//row
		{
			for(j=0; j<num[i].length; j++)		//column
			{
				addrow = addrow + num[i][j];
			}
		}
		System.out.println("\nrow-wise addition of elements in array = " + addrow);
		
		//column-wise addition
		int addcol = 0;
		for(j=0; j<num[0].length; j++)			//column [as here, no. of elements in each row are same hence num[0].length]
		{
			for(i=0; i<num.length; i++)			//row
			{
				addcol = addcol + num[i][j];
			}
		}
		System.out.println("\ncolumn-wise addition of elements in array = " + addcol);
	}
}