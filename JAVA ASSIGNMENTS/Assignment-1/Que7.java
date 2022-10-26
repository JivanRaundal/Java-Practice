// Q.7] WAP to print 1 to N prime numbers.

import java.util.*;

class Que7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num,i,j;
		short flag;
		
		System.out.println("\nEnter number : ");
		num = sc.nextInt();
		
		System.out.println("\nPrime numbers between 1 to " + num + " are : ");
		
		for(i=2; i<=num;  i++)
		{
			flag = 0;
			for(j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println(i);
			}
		}
		
		
		/* // to print first n prime numbers
		int count=0;
		for(i=2; count != num;  i++)
		{
			flag = 0;
			for(j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				count++;
				System.out.println(i);
			}
		}
		*/
	}
}