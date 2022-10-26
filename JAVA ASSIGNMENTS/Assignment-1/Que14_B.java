/* Q.14_B] Pattern Printing (number of rows should be users choice)

A
AB
ABC
ABCD
ABCDE

here you can use only capital alphabets. (ASCII value of A-Z = 65 to 90)
*/

import java.util.Scanner;

class Que14_B		
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int row,i,j;
		int k;
		
		System.out.println("\nHow many rows? ");
		row = sc.nextInt();
		
		for(i=1; i<=row; i++)
		{
			k=65;
			for(j=1; j<=i; j++)
			{
				if(k>90)
				{
					k=65;
				}
				System.out.print((char)k);
				k++;
			}
			System.out.println();
		}
	}
}
