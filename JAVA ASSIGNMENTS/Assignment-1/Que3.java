// Q.3] Scan 2 numbers from user. Find their LCM(least common multiple) & GCD(greatest common divisor).

import java.util.Scanner;

class Que3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b,min,max,i;
		
		System.out.println("\nEnter 2 numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//find LCM
		max = a > b ? a : b;
		for(i = max; i <= a*b; i++)
		{
			if(i%a == 0 && i%b == 0)
			{
				System.out.println("\nLCM of (" + a + "," + b + ") = " + i);
				break;
			}
		}
		
		//find GCD
		max = a > b ? a : b;
		min = a < b ? a : b;
		i = min;
		while(max%min != 0)
		{
			i = max % min;
			max = min;
			min = i;
		}
		System.out.println("\nGCD of (" + a + "," + b + ") = " + i);
	}
}