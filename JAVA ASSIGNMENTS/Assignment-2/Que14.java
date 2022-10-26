// Q.14] Scan a number from user. Print addition of digits recursively.

import java.util.Scanner;

class Que14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("\nEnter number : ");
		num = sc.nextInt();
		
		int sum = add(num);
		System.out.println("\nAddition of all digits in number = " + sum);
	}
	
	static int add(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		else
		{
			return (num%10) + add(num/10);
		}
	}
}