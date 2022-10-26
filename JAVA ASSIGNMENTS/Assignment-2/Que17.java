// Q.17] Create an array of 8 integers. Scan this array using for loop. Print this array using for each loop.

import java.util.Scanner;

class Que17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[8];
		
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<8; i++)
		{
			System.out.print("\nelement " + i + " : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\nPrinting array elements : ");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
	}
}