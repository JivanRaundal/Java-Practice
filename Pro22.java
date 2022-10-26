// Switch case :-

// Basic calculator

import java.util.Scanner;

class Pro22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x,y,ans;
		int ch;
		char c;
		
		do
		{
			System.out.println("\nEnter two numbers : ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			System.out.println("\n-----------------------------");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus Division");
			System.out.println("-----------------------------");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					ans = x + y;
					System.out.println("Addition = " + ans);
					break;
					
				case 2:
					ans = x - y;
					System.out.println("Substraction = " + ans);
					break;
					
				case 3:
					ans = x * y;
					System.out.println("Multiplication = " + ans);
					break;
					
				case 4:
					ans = x / y;
					System.out.println("Division = " + ans);
					break;
					
				case 5:
					ans = x % y;
					System.out.println("Modulus Division = " + ans);
					break;
					
				default:
					System.out.println("Invalid Choice....");
			}
			
			System.out.println("\nDo you want to continue (y/n) : ");
			c = sc.next().charAt(0);
		}while(c != 'n' && c != 'N');
	}
}