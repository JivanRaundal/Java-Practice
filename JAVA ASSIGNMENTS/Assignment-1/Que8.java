// Q.8] WAP to print nth prime number.

import java.util.Scanner;

class Que8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n,i,j,count=0;
		short flag;
		
		System.out.println("\nEnter number : ");
		n = sc.nextInt();
		
		System.out.print("\n" + n + "th prime number is : ");
		for(i=2; count != n;  i++)
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
				//System.out.println(i);		//if want to print first n prime numbers
				if(count == n)
				{
					System.out.print(i);
				}
			}
		}
	}
}