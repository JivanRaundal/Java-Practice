/* Q.14_D_3] pattern printing

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/


import java.util.Scanner;

class Que14_D_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int row;
		System.out.println("\nHow many rows? ");
		row = sc.nextInt();
		
		int i,j,s,k;
		for(i=1; i<=row; i++)
		{
			for(s=i; s<=row-1; s++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(k=(i-1); k>=1; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=row-1; i>=1; i--)
		{
			for(s=row-1; s>=i; s--)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i; j++)
			{
					System.out.print("*");
			}
			for(k=(i-1); k>=1; k--)
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}
}