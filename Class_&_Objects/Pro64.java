/* # Array Of Objects :-

Note :- -In Java, every object should have it's own reference variable.
	    -When we want to create an array of objects, we first create an array of references. Then, for every element in that array
		 we create an independent object.
*/

//Passing array of objects to another functions. (we only pass reference var to array of references to functions)

import java.util.Scanner;

class Number
{
	public int x;
	public int y;
	
	public Number()
	{
		System.out.println("\nObject created");
	}
}

class Pro64
{
	public static void main(String args[])
	{
		Number obj[];			//created reference to array of references
		obj = new Number[4];	//created array of references
		
		int i;
		//creating object for each reference var in array of references
		for(i=0; i<obj.length; i++)
		{
			obj[i] = new Number();			//constructor will be called
		}
		
		scanData(obj);			//passing reference to array of references as parameter
		
		printData(obj);
	}
	
	public static void scanData(Number ref[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter details of objects\n");
		for(int i=0; i<ref.length; i++)
		{
			System.out.print("Enter x & y : ");
			ref[i].x = sc.nextInt();
			ref[i].y = sc.nextInt();
		}
	}
	
	public static void printData(Number ref[])
	{
		System.out.println("\nPrinting details of objects");
		for(Number temp : ref)		//for each loop
		{
			System.out.println("x = " + temp.x + "\ty = " + temp.y);
		}
	}
}