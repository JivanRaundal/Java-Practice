// Scanning String from user in JAVA

import java.util.Scanner;

class Pro5
{
	public static void main(String args[])
	{
		System.out.println("\nScanning String from user");
		
		Scanner sc = new Scanner(System.in);
		
		// Note = we have two methods/functions to scan string. 1) next() & 2) nextLine()
		// Both methods/functions are non-static member functions of class Scanner hence, we have to use scanner's object.
		// 1) next() 	 => will only scan single word string. ('\n', space, tab is terminating condition)
		// 2) nextLine() => will scan space seperated string. (upto '\n')

		String str1,str2;			//str is reference of class String which will refer to object of class String.
		
		System.out.println("\nEnter String 1 : ");
		str1 = sc.nextLine();		//will scan space seperated string also (upto '\n')
		System.out.println("\nstr1 = " + str1);
		
		System.out.println("\nEnter String 2 : ");
		str2 = sc.next();			//will scan only single word in string
		System.out.println("\nStr 2 = " + str2);
		
		System.out.println();
	}
}