/* Q.13_1] pattern printing

1
12
123
1234
12345

*/

class Que13_1
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
