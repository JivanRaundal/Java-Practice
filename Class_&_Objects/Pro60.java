// # Array as a datamembers of class :- (Array within class)

// Note :- runtime memory (on heap) has default value.
// Accessing array (as a datamember of class) in member functions of same class :-

import java.util.*;

class Number
{
	int num[];			//not an array, just refernce variable to array of integers	
	
	public Number(int n)		//parameterized constructor
	{
		num = new int[n];		//creating array of n integers
	}
	
	public void scanArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<num.length; i++)
		{
			System.out.print("element " + i + " : ");
			num[i] = sc.nextInt();			//members of calling object are directly accessible in member functions
		}
	}
	
	public void printArray()
	{
		System.out.println("\nPrinting Array : ");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
	}
	
	public int add()
	{
		int sum = 0;
		for(int i=0; i<num.length; i++)
		{
			sum = sum + num[i];
		}
		return sum;
	}
}

class Pro60
{
	public static void main(String args[])
	{
		Number obj1 = new Number(4);
		Number obj2 = new Number(6);
		
		System.out.println("\nEnter elements of 1st array : ");
		obj1.scanArray();
		System.out.println("\nEnter elements of 2nd array : ");
		obj2.scanArray();
		obj1.printArray();
		obj2.printArray();
		
		int add1,add2;
		add1 = obj1.add();
		add2 = obj2.add();
		System.out.println("\n\nadd1 = " + add1 + "\tadd2 = " + add2);
	}
}