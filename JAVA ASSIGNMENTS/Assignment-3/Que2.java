// Q.2] Create an array of n integers in main(). Defing one more function reverse() which will reverse the array.
 //		Print array again in main(). It should be in reverse order.

import java.util.Scanner;

class Que2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("\nHow many elements ? ");
		n = sc.nextInt();
		
		int num[] = new int[n];
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<n; i++)
		{
			System.out.print("element " + i + " : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\n\nArray before reversing : ");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
		
		reverseArray(num);
		
		System.out.println("\n\nArray after reversing : ");
		for(int x :  num)
		{
			System.out.print(" " + x);
		}
	}
	
	public static void reverseArray(int []arr)
	{
		int i,j,temp;
		i = 0;
		j = arr.length-1;
		
		while(i <= j)
		{
			temp   = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}
} 