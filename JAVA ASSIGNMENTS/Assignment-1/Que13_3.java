/* Q.13_3] pattern printing

11111
2222
333
44
5

*/

class Que13_3
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=i; j<=5; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}