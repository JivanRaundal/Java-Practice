// Q.10] Write menue driven program for arithmetic operations on given 2 numbers. Ask user if he wants to repeat or not.

import java.util.Scanner;

class Que10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int choice;
		char ch;
		
		do
		{
			System.out.println("\nEnter 2 numbers : ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println();
			System.out.println("\n--------MENUE--------");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("---------------------\n");
			
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Addition = " + (a+b));
					break;
					
				case 2:
					System.out.println("Substraction = " + (a-b));
					break;
					
				case 3:
					System.out.println("Multiplication = " + (a*b));
					break;
				
				case 4:
					System.out.println("Division = " + (a/b));
					break;
					
				default:
					System.out.println("invalid choice...");
			}
			
			System.out.print("\nDo you want to continue? (y/n) : ");
			ch = sc.next().charAt(0);
			
		}while(ch!='n' && ch!='N');
	}
}