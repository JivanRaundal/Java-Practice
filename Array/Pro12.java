// Functions returning references :-

// Note :- returntype of function should be reference variable. i.e. datatype[]
//eg :  

import java.util.Scanner;

class Pro12
{
	public static void main(String args[])
	{
		int num[];				//reference variable to 1-D array
		
		num = createArray();
		
		printArray(num);
	}
	
	static int[] createArray()			//function returning reference, returntype should be int[]
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr;				//another syntax to declare reference variable
		arr = new int[5];
		
		System.out.println("\nEnter array elements :");
		int i=0;
		for(i=0; i<5; i++)
		{
			System.out.print("\nelement " + i + " : ");
			arr[i] = sc.nextInt();
		}
		return arr;					//returning reference of array
	}
	
	static void printArray(int x[])
	{
		System.out.println("\nPrinting array :\n");
		
		for(int y : x)
		{
			System.out.print(" " + y);
		}
	}
}