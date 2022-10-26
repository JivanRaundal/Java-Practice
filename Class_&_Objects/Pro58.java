// # Array as a datamembers of class :- (Array within class)

// Note :- runtime memory (on heap) has default value.
// Accessing array (as a datamember of class) in member functions of same class :-

import java.util.*;

class Number
{
	int num[];			//not an array, just refernce variable to array of integers	
	
	public Number()
	{
		num = new int[5];
	}
	
	public void getArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter array elements : ");
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
}

class Pro58
{
	public static void main(String args[])
	{
		Number obj;
		obj = new Number();
		System.out.println(obj.num);
		obj.getArray();
		obj.printArray();
	}
}