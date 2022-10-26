// Q.23] Scan 8 integers from user in an array. Sort this array in ascending or in descending order according to user's choice.
//       (make your code madular)

import java.util.Scanner;

class Que23
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[];
		num = scanArray();
		
		int ch;
		do
		{
			System.out.println("\n\n__________MENUE__________");
			System.out.println("1. Ascending order");
			System.out.println("2. Descending order");
			System.out.println("3. Print array");
			System.out.println("4. exit");
			System.out.println("\n_________________________");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					sortAscending(num);
					break;
				
				case 2:
					sortDescending(num);
					break;
				
				case 3:
					printArray(num);
					break;
				
				case 4:
					System.out.println("exited...");
					break;
					
				default:
					System.out.println("Invalid choice");
			}
			
		}while(ch != 4);
		
	}
	static int[] scanArray()
	{
		Scanner sc = new Scanner(System.in);
		int []arr = new int[8];
		
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<8; i++)
		{
			System.out.print("\nelement " + i + " : ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	static void printArray(int arr[])
	{
		System.out.println("\nArray : ");
		for(int x : arr)
		{
			System.out.print(" " + x);
		}
	}
	static void sortAscending(int arr[])
	{
		int i,j,temp;
		for(i=0; i<arr.length; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp   = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	static void sortDescending(int arr[])
	{
		int i,j,temp;
		for(i=0; i<arr.length; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					temp   = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}
}