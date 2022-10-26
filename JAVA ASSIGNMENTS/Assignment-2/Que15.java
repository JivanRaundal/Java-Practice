// Q.15] Keep Scannig a number from user until user enters 0 using recursive function.

import java.util.*;

class Que15
{
	public static void main(String args[])
	{
		System.out.println("\nKeep entering number OR enter 0 to stop : ");
		scan();
	}
	
	static void scan()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		if(n == 0)
			return;
		else
			scan();
	}
}