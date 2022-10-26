/* Q.13_7] pattern printing

543212345
5432_2345
543___345
54_____45
5_______5

*/

class Que13_7
{
	public static void main(String args[])
	{
		int i,j,s,k,p;
		
		for(i=1; i<=5; i++)
		{
			for(s=5; s>=i; s--)
			{
				System.out.print(s);
			}
			
			for(k=1; k<=(i-1); k++)
			{
				System.out.print("_");
			}
			
			for(p=i; p>=3; p--)
			{
				System.out.print("_");
			}
			
			for(j=((i==1)?(i+1):i); j<=5; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}