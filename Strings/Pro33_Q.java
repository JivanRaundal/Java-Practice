// Q. Scan a String from user. Convert it into capital/uppercase form.

import java.util.Scanner;

class Pro33_Q
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		String res;
		
		System.out.print("\nEnter String : ");
		str = sc.nextLine();
		
		res = str.toUpperCase();
		
		System.out.println("\nres = " + res);
		System.out.println("str = " + str);
	}
} 