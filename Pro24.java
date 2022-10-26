// while loop :-

// Q. Scan 10 integers from user, print addition of only even integers.

import java.util.Scanner;

class Pro24
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x,i;
		int sum = 0;
		
		System.out.println("\nEnter 10 integers : ");
		i = 1;
		while(i <= 10)
		{
			x = sc.nextInt();
			if(x%2 == 0)
			{
				sum = sum + x;
			}
			i++;
		}
		
		System.out.println("\nAddition of even integers = " + sum);
	}
}