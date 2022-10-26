// Q.24] Scan 8 integers from user. Sort numbers at even index only.

import java.util.Scanner;

class Que24
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int []num = new int[8];
		
		int i,j,temp;
		System.out.println("\nEnter array elements : ");
		for(i=0; i<8; i++)
		{
			System.out.print("element " + i + " : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\nArray before sorting : ");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
		
		//sorting elements at even index
		for(i=0; i<8; i=i+2)		//excluding 0th index=> for(i=2; i<8; i=i+2)
		{
			for(j=i+2; j<8; j=j+2)
			{
				if(num[i] > num[j])
				{
					temp   = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("\n\nArray after sorting elements at even index : ");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
	}
}