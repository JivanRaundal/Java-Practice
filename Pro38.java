// Q. Scan a number from user, print addition of digits in that number non-recursively.

import java.util.Scanner;

class Pro38
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter number : ");
		n = sc.nextInt();
		
		int sum = 0;
		while(n > 0)
		{
			sum = sum + (n%10);
			n = n/10;
		}
		
		System.out.println("\nAddition of all digits in number = " + sum);
	}
}