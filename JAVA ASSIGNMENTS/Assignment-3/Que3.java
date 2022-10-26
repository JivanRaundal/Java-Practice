// Q.3] Declare an initialize an array of 6 integers. Define a recursive function print() which prints elements in given array.

import java.util.Scanner;

class Que3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[] = {10,20,30,40,50,60};
		
		System.out.println("\nPrinting array elements recursively :");
		print(num,0);
	}
	
	static void print(int arr[],int i)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			System.out.print(" " + arr[i]);
			print(arr,i+1);
		}
	}
}