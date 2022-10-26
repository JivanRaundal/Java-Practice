// # Array as a datamembers of class :- (Array within class)

// Note :- runtime memory (on heap) has default value.
// Accessing array (as a datamember of class) in member functions of same class :-

import java.util.Scanner;

class Number
{
	public int num[];			//not an array, just refernce variable to array of integers	
	
	public Number()
	{
		num = new int[5];
	}
	
	public void scanArray()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			System.out.print("element " + i + " : ");
			num[i] = sc.nextInt();			//members of calling object are directly accessible in member functions
		}
	}
	
	public void printArray()
	{
		System.out.println("\nPrinting Array : ");
		for(int i=0; i<num.length; i++)
		{
			System.out.print(" " + num[i]);
		}
	}
	
	public void add()
	{
		int sum = 0;
		for(int i=0; i<num.length; i++)
		{
			sum += num[i];
		}
		System.out.println("\nAddition of all elements of array = " + sum);	
	}
}

class Pro59
{
	public static void main(String args[])
	{
		Number obj1,obj2;
		obj1 = new Number();
		obj2 = new Number();

		System.out.println("\n1st array");
		obj1.scanArray();
		System.out.println("\n2nd array");
		obj2.scanArray();
		obj1.printArray();
		obj2.printArray();
		obj1.add();
		obj2.add();
	}
}