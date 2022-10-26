/* Q.14_A] Pattern Printing (number of rows should be users choice)

1
123
1234
12345

here you can use only 1 to 9 digits.
*/

import java.util.Scanner;

class Que14_A
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int row,i,j,k;
		System.out.println("\nHow many rows? ");
		row = sc.nextInt();
		
		for(i=1; i<=row; i++)
		{
			k=1;
			for(j=1; j<=i; j++)
			{
				if(k==10)
				{
					k=1;
				}
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}
