// Q.8] Complete the code for given main() function.

import java.util.Scanner;

class Number
{
	int num[];
	
	public Number()
	{
		num = new int[5];
	}
	
	public void scanArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<num.length; i++)
		{
			num[i] = sc.nextInt();
		}
	}
	
	public void printArray()
	{
		System.out.println("\n\nPrinting Array : ");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
	}
	
	public int findMax()
	{
		int max = num[0];
		for(int i=0; i<num.length; i++)
		{
			if(max < num[i])
			{
				max = num[i];
			}
		}
		return max;
	}
}

class Que8
{
	public static void main(String args[])
	{
		//create 3 objects. Each object contains an integer array of 5 integers.
		//Find the largest value among all integers.
		Number T1 = new Number();
		Number T2 = new Number();
		Number T3 = new Number();
		T1.scanArray();
		T2.scanArray();
		T3.scanArray();
		T1.printArray();
		T2.printArray();
		T3.printArray();
		
		int max,m1,m2,m3;
		m1 = T1.findMax();
		m2 = T2.findMax();
		m3 = T3.findMax();
		max = m1 > m2 ? m1 : m2;
		max = max > m3 ? max : m3;
		
		System.out.println("\n\nLargest value among all integers = " + max);
	}
}