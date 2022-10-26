// Q.18] Scan and print array of 6 float values using for each loop.

import java.util.Scanner;

class Que18
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		float num[];
		num = new float[6];
		
		System.out.println("\nEnter array elements : ");
		int i=0;
		for(float x : num)
		{
			System.out.print("\nelement " + i + " : ");
			num[i] = sc.nextFloat();
			i++;
		}
		
		System.out.println("\nPrinting array elements : ");
		for(float x : num)
		{
			System.out.print(" " + x);
		}
	}
}