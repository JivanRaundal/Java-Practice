// Logic building :-

// Q. Scan two numbers from user, print LCM. (Least Common Multiple)

// Note : 1) LCM of 2 numbers is completely divisible by both numbers.
//		  2) Minimum LCM = MAX of num1 & num2
//		  3) Maximum LCM = num1 * num2

import java.util.Scanner;

class Pro27
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b,max,i;
		
		System.out.println("\nEnter two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		max = a > b ? a : b;
		
		for(i = max; i <= a*b; i++)
		{
			if(i%a == 0 && i%b == 0)
			{
				System.out.println("\nLCM of " + a + " & " + b + " = " + i);
				break;
			}
		}
	}
}	