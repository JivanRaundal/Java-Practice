// Logic building :-

// Q. Scan number from user, print addition of all digits in number.

import java.util.Scanner;

class Pro26
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num,sum=0;
		System.out.println("\nEnter number : ");
		num = sc.nextInt();
		
		while(num != 0)			//OR while(num > 0)
		{
			sum = sum + (num%10);
			num = num/10;
		}
		
		System.out.println("\nAddition of all digits in number = " + sum);
	}
}