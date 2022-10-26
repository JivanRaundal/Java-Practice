/* Q.13_4] pattern printing

_____1
____12
___123
__1234
_12345
123456

*/

class Que13_4
{
	public static void main(String args[])
	{
		int i,j,s;
		for(i=1; i<=6; i++)
		{
			for(s=i; s<=5; s++)
			{
				System.out.print("_");
			}
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}