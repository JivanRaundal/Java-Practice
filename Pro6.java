// Accessing a character at given index from String using using charAt() method.

// Note = we have two methods/functions to scan string. 1) next() & 2) nextLine()
// Both methods/functions are non-static member functions of class Scanner hence, we have to use scanner's object.
// 1) next() 	 => will only scan single word string. ('\n', space, tab is terminating condition)
// 2) nextLine() => will scan space seperated string. (upto '\n')

// Note = String is a class, hence it may contain some member functions.
// To access that member functions, we need String class object / var.
// String class has member function named 'charAt()'
// prototype => char charAt(int index);
// syntax to call it => str_obj.charAt(2);
// charAt() method works for that string only which calls it.
// charAt() method returns the character at given index 'i' from string.


import java.util.Scanner;

class Pro6
{
	public static void main(String args[])
	{
		System.out.println("\nScanning String from user");
		
		Scanner sc = new Scanner(System.in);
		

		String str1,str2;			//str is reference of class String which will refer to object of class String.
		char ch1, ch2;
		
		System.out.println("\nEnter String 1 : ");
		str1 = sc.nextLine();		//will scan space seperated string also (upto '\n')
		System.out.println("\nstr1 = " + str1);
		
		ch1 = str1.charAt(9);
		System.out.println("\ncharAt(9) = " + ch1);
		
		System.out.println("\nEnter String 2 : ");
		str2 = sc.next();			//will scan only single word in string
		System.out.println("\nStr 2 = " + str2);
		
		ch2 = str2.charAt(3);
		System.out.println("\ncharAt(3) = " + ch2);
		
		System.out.println();
	}
}