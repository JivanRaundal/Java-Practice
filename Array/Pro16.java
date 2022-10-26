/* Scanning & Printinf 2-D array using for each loop :-

Note :- int num[][] = new int[3][4];
		-1) num       => It is refering to whole 2-D array
		-2) num[0]    => It is refering to 0th 1-D array of num, where num is 2-D array.
		-3) num[0][0] => It is refering to basic value of 0th row & 0th columnn.

		In general, num refer to whole 2-D array & num[i] refer to ith 1-D array of num, where num is refering to 2-D array.
*/

import java.util.Scanner;

class Pro16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[][] = new int[3][4];
		
		System.out.println("\nEnter elements of 3*4 2-D array : ");
		int i;
		for(int x[] : num)		//In every iteration x will store reference of next 1-D array in num, where num is reference to 2-D array
		{
			i=0;
			for(int y : x)
			{
				x[i] = sc.nextInt();
				i++;
			}
		}
		
		System.out.println("\nPrinting Array : ");
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
