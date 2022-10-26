// while loop :-

// Q. keep Scanning integers from user, utiln user enters -1. (use while loop)

import java.util.Scanner;

class Pro25
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("\nKeep entering number or -1 to STOP : ");
		
		while(true)
		{
			x = sc.nextInt();
			if(x == -1)
			{
				break;
			}
			System.out.println("x = " + x);
		}
	}
}