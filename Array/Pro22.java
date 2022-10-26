// Jagged Array :-

// Q. Create & print Jagged Array usig for loop

import java.util.Scanner;

class Pro22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[][] = new int[3][];		//will just create reference array on heap & default value of references will be null
		
		//creating jagged array
		num[0] = new int[2];
		num[1] = new int[4];
		num[2] = new int[3];
		
		System.out.println("num.length = " + num.length);
		System.out.println("num[0].length = " + num[0].length);
		System.out.println("num[1].length = " + num[1].length);
		System.out.println("num[2].length = " + num[2].length);
		
		System.out.println("\nEnter array elements : ");
		int i,j;
		for(i=0; i<num.length; i++)
		{
			for(j=0; j<num[i].length; j++)
			{
				System.out.print("num[" + i + "][" + j + "] : ");
				num[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nPrinting Jagged Array elements : ");
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