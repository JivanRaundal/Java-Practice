// Q.16] Complete the following main() function. i.e. WAP for following main() function.

import java.util.Scanner;

class Que16
{
	public static void main(String args[])
	{
		double num[];
		num = scanArray();
		printArray(num);
	}
	static double[] scanArray()
	{
		Scanner sc = new Scanner(System.in);
		
		double[] arr;
		arr = new double[6];
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("\nelement " + i + " : ");
			arr[i] = sc.nextDouble();
		}
		return arr;
	}
	static void printArray(double arr[])
	{
		System.out.println("\nprinting array : ");
		for(double x : arr)
		{
			System.out.print(" " + x);
		}
	}
}