// Jagged Array :-

// Q. Create & print Jagged Array usig for each loop

import java.util.Scanner;

class Pro23
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
		
		System.out.println("\nEnter Jagged array elements : ");
		int i=0,j;
		for(int x[] : num)
		{
			j=0; 
			for(int y : x)
			{
				System.out.print("num[" + i + "][" + j + "] : ");
				x[j] = sc.nextInt();
				j++;
			}
			i++;
		}
		
		System.out.println("\nPrinting Jagged Array elements : ");
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