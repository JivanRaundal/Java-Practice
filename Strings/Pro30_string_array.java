// Array Of Strings :- (same as array of objects bcz String is also Class)

import java.util.Scanner;

class Pro30_string_array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str[] = new String[5];			//created array of references
		
		System.out.println("\nEnter 5 strings");
		int i;
		for(i=0; i<str.length; i++)
		{
			str[i] = sc.nextLine();			//nextLine() method creates new string object & returns it's reference
		}
		
		System.out.println("\nPrinting Strins");
		for(i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
	}
}