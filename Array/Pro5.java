// Q. Scan array of 6 integers from user, print their addition.

import java.util.*;

class Pro5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[6];
		
		int i,sum = 0;
		System.out.println("\nEnter elements of array : ");
		
		for(i=0; i<6; i++)
		{
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		
		System.out.println("\nAddition of all elements of array = " + sum);
	}
}