// Conditional Statement
// if-else
	
// Q. Scan a character from user, print Male if user enters m or M, print Female if user enters f or F,
//    else print wrong input.

import java.util.Scanner;

class Pro20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		char ch;
		
		System.out.println("Enter gender : ");
		str = sc.next();
		ch = str.charAt(0);		//or directly, ch = sc.next().charAt(0);
		
		if(ch == 'm' || ch == 'M')
		{
			System.out.println("Male");
		}
		else if(ch == 'f' || ch == 'F')
		{
			System.out.println("Female");
		}
		else
		{
			System.out.println("Wrong Input");
		}
	}
}