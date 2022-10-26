// Q.6] Scan a number from user, check if it is prime or not.

import java.util.Scanner;

class Que6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("\nEnter number : ");
		num = sc.nextInt();
		
		short flag = 0;
		for(int i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
		{
			System.out.println("\n" + num + " is a Prime number");
		}
		else
		{
			System.out.println("\n" + num + " is not a Prime number");
		}
	}
}