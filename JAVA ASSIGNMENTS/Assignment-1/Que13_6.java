/* Q.13_6] pattern printing

2
23
235
2357
23572
235723

*/

class Que13_6
{
	public static void main(String args[])
	{
		int i,j,k,count;
		short flag=0;
		
		for(i=1; i<=6; i++)
		{
			count=0;
			for(j=2; count!=i; j++)
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
			}
			System.out.println();
		}
	}
}