/* Q.14_C] Pattern Printing (number of rows should be users choice)

23572
3572
357
23
5

*/

import java.util.Scanner;

class Que14_C
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int row;
		System.out.println("\nHow many rows? : ");
		row = sc.nextInt();
		
		int i,j=2,k,count=0;
		short flag=0;
		
		for(i=row; i>=1; i--)
		{
			count=0;
			while(count!=i)
			{
				flag=0;
				for(k=2; k<=j/2; k++)
				{
					if(j%k == 0)
					{
						flag=1;
						break;
					}
				}
				if(flag == 0)
				{
					count++;
					System.out.print(j);
					if(j==7)
					{
						j=1;
					}
				}
				j++;
			}
			System.out.println();
		}
	}
}