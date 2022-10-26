/* Q.13_5] pattern printing

    1
   121
  12321
 1234321
123454321

*/

class Que13_5
{
	public static void main(String args[])
	{
		int i,j,s,k;
		for(i=1; i<=5; i++)
		{
			for(s=i; s<=4; s++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(k=(i-1); k>=1; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}