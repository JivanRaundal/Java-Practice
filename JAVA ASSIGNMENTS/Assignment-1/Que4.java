// Q.4] Scan a number from user. Find addition of it's digits. (while)

import java.util.*;

class Que4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum = 0;
		
		System.out.println("\nEnter number : ");
		num = sc.nextInt();
		
		while(num != 0)		//or while(num > 0)
		{
			sum = sum + (num%10);
			num = num/10;
		}
		
		System.out.println("\nAddition of all digit's of number = " + sum);
	}
}