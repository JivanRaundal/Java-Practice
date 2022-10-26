// for each loop :-

// Q. Scan array of 6 integers using for each loop, then print array using for each loop.

import java.util.Scanner;

class Pro7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[6];
		
		System.out.println("\nEnter array elements : ");
		
		int i=0;
		for(int x : num)				//no need of any terminating condition in for each loop
		{
			System.out.print("\nelement " + i + " : ");
			num[i] = sc.nextInt();
			i++;
		}
		
		System.out.println("\n\nPrinting array : ");
		for(int x : num)
		{
			System.out.println(" " + x	);
		}
	}
}