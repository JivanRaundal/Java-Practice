// Q.9] Create an array of 6 integers, Print addition of numbers at even index only.

import java.util.Scanner;

class Que9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[];			//array reference variable
		num = new int[6];
		
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<6; i++)
		{
			System.out.print("\nelement " + i + " : ");
			num[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<6; i++)
		{
			if(i%2 == 0)					//addition of elements at even index only
				sum = sum + num[i];
		}
		
		System.out.println("\nAddition of elements at even index = " + sum);
	}
}