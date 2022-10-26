// Scanning character from user

import java.util.Scanner;

class Pro8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		char ch;
		
		System.out.println("\nEnter character : ");
		str = sc.next();
		ch = str.charAt(0);		///charAt() method will return character at given index
		System.out.println("\nYour character is = " + ch);
		
		// Or scan character directly , char ch = sc.next().charAt(0);  Both methods are same
		
		char c;
		System.out.println("\nEnter another character : ");
		c = sc.next().charAt(0);
		System.out.println("\nAnother character = " + c);
	}
}