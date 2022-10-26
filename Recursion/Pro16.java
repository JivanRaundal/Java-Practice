// Q. Keep scanning a number from user until user enters 0(zero).

// Note :- sc is local variable, hence we you have to declare it in every function where we want to scan values from user.


import java.util.Scanner;

class Pro16
{
	public static void main(String args[])
	{
		scan();
	}
	
	static void scan()
	{
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Enter value : ");
		x = sc.nextInt();
		
		if(x == 0)
		{
			return;
		}
		else
		{
			System.out.println("x = " + x);
			scan();
		}
	}
}