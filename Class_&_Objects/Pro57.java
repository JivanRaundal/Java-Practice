// # Array as a datamembers of class :- (Array within class)

// Note :- runtime memory (on heap) has default value.

import java.util.Scanner;

class Number
{
	public int num[];			//not an array, just refernce variable to array of integers	
	
	public Number()
	{
		num = new int[5];
	}
}

class Pro57
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Number obj;
		obj = new Number();
		System.out.println(obj.num);		
		
		System.out.println("\nScanning num array of obj in non-member function : ");
		for(int i=0; i<obj.num.length; i++)		//length property of array
		{
			System.out.print("element " + i + " : ");
			obj.num[i] = sc.nextInt();
		}
		
		System.out.println("\nPrinting Array : ");
		for(int x : obj.num)		//for each loop
		{
			System.out.print(" " + x);
		}
	}
}