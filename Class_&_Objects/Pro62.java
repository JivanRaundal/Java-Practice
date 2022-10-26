/* # Array Of Objects :-

Note :- -In Java, every object should have it's own reference variable.
	    -When we want to create an array of objects, we first create an array of references. Then, for every element in that array
		 we create an independent object.
*/

import java.util.Scanner;

class Number
{
	public int x;
	public int y;
	
	public Number()					//constructor
	{
		System.out.println("Object created");
	}
}

class Pro62
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Number obj[];			//created reference to array of references
		obj = new Number[4];	//created array of references
		
		//Initially all reference variables in array of references will have default value null.
		int i;
		for(i=0; i<4; i++)
		{
			System.out.print(" " + obj[i]);
		}
		System.out.println();
		
		//creating object for each reference variable in reference array.
		for(i=0; i<obj.length; i++)
		{
			obj[i] = new Number();			//default constructor will get called here for each object creation
		}
		
		System.out.println("\nAfter creating object for each reference var in array of references : ");
		for(i=0; i<obj.length; i++)
		{
			System.out.print("  " + obj[i]);
		}
		
		System.out.println("\n\nEnter x & y for each objects");
		for(i=0; i<obj.length; i++)
		{
			System.out.print("Enter x & y : ");
			obj[i].x = sc.nextInt();
			obj[i].y = sc.nextInt();
		}
		
		System.out.println("\nPrinting x & y of each objects : ");
		for(Number temp : obj)		//using for each loop
		{
			System.out.print("\nx = " + temp.x + "\ty = " + temp.y);
		}
	}
}