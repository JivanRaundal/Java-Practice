// Q. Scan array of n integers from user & print array elements.

import java.util.Scanner;

class Pro4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		System.out.println("\nHow many elements ? ");
		n = sc.nextInt();
		
		int num[];
		num = new int[n];
		
		System.out.println("\nEnter array elements :");
		for(i=0; i<n; i++)				//OR for(i=0; i<num.length; i++)
		{
			System.out.print("\nelement " + i + " : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\nPrintina array :\n");
		for(i=0; i<num.length; i++)
		{
			System.out.print(" " + num[i]);
		}
	}
}