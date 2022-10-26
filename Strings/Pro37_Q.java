// Q. Scan a String from user. Replace all occurences of JAVA by CPP. Do not use replace() and replaceAll() functions.
// use replaceFirst() & contains() function.

import java.util.Scanner;

class Pro37_Q
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		System.out.print("\nEnter String : ");
		str = sc.nextLine();
		
		while(str.contains("java"))
		{
			str = str.replaceFirst("java","cpp");
		}
		
		System.out.println("\nModified String = " + str);
	}
}