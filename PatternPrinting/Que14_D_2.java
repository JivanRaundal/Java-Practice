/* Q.14_D_2] pattern printing

     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6

*/

import java.util.Scanner;

class Que14_D_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int row;
		System.out.println("\nHow many rows? ");
		row = sc.nextInt();
		
		int i,j,s,k,x=0;
		for(i=1; i<=row; i++)
		{
			//digits should be between 1 to 9
			if(i<=9)
			{
				x = i;
			}
			else
			{
				x++;
				if(x==10)
					x = 1;
			}
			
			for(s=i; s<=row-1; s++)
			{
				System.out.print("  ");
			}
			for(j=1; j<=i; j++)
			{
				if(j%2 == 0)
					System.out.print("  ");
				else
					System.out.print(" " + x);
			}
			for(k=(i-1); k>=1; k--)
			{
				if(k%2 == 0)
					System.out.print("  ");
				else
					System.out.print(" " +x);
			}
			System.out.println();
		}
	}
}