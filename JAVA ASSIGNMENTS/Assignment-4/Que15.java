// Q.15] Create an array of 10 integers. Scan a number from user. Search it in array and delete if found. In delete process shift all remaining 
//       elements 1 position towards left.

import java.util.*;

class Que15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		int i,j;
		
		System.out.println("\nEnter array elements : ");
		for(i=0; i<num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		
		System.out.println("\n\nPrinting array elements : ");
		for(int y : num)
		{
			System.out.print(" " + y);
		}
		
		int x;
		System.out.print("\n\nEnter element to be removed : ");
		x = sc.nextInt();
		
		//removing element from array
		for(i=0; i<num.length; i++)
		{
			if(num[i] == x)
			{
				for(j=i; j<(num.length-1); j++)
				{
					num[j] = num[j+1];
				}
				num[j] = 0;			//make last element 0
				i--;				//if x is present continuos i  array eg :- {2,4,6,3,3,6}
			}
		}
		
		System.out.println("\nAfter deleting " + x + " from array : ");
		for(int y : num)
		{
			System.out.print(" " + y);
		}
	}
}