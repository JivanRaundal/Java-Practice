
/* # compareTo() :-

-Same as 'strcmp()' in C++
-non-static member function of class String.
-return type is 'int'.
-this method will compare two strings char by char and will perform substraction of ASCII values of characters in string & finally will return
 substraction.
-return values of compareTo() method will be substraction of ASCII values of characters in strings.
 1) 0 	=> If both strings are equal.
 2) -ve => if String1 < String2 (i.e. Calling String < Parameter String)
 2) +4 
 ve => if String1 > String2 (i.e. Calling String > Parameter String)
*/

// Q. dictionary code

import java.util.Scanner;

class Pro17_compareTo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str1,str2;
		System.out.println("\nEnter String1 : ");
		str1 = sc.nextLine();
		System.out.println("Enter String2 : ");
		str2 = sc.nextLine();
		
		int res = str1.compareTo(str2);
		
		if(res > 0)			// str1 > str2
		{
			System.out.println("\n" + str2 + " will go first in dictionary.");
		}
		else if(res < 0)	//str1 < str2
		{
			System.out.println("\n" + str1 + " will go first in dictionary.");
		}
		else 				//res == 0  (str1 == str2)
		{
			System.out.println("\nBoth strings are same anyone can go first in dictionary.");
		}
	}
}