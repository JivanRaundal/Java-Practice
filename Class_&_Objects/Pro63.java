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
	
	public Number()
	{
		System.out.println("\nObject created");
	}
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.print("\nx = " + x + "\ty = " + y);
	}
}

class Pro63
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
		
		System.out.println("\nScanning details of objects\n");
		for(i=0; i<obj.length; i++)
		{
			obj[i].scanData();
		}
		
		System.out.println("\nPrinting details of objects");
		for(Number temp : obj)		//for each loop
		{
			temp.printData();
		}
	}
}