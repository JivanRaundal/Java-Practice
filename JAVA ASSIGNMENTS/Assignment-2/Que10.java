// Q.10] Scan a number from user. Print addition of all digits in the number using while loop.

import java.util.*;

class Que10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num,sum=0;
		System.out.println("\nEnter number : ");
		num = sc.nextInt();
		
		while(num > 0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		
		System.out.println("Addition of all digits in the number = " + sum);
	}
}