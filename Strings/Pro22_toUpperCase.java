/* # toLowerCase() & toUpperCase() :-

-SYNTAX :- 1) String toLowerCase()
           2) String toUpperCase()
-non-static functions.
-this functions creates new string, converts the calling string into upper/lower casre & returns the reference of newly created string object.
 Note :- Calling String is not modified.
*/

class Pro22_toUpperCase
{
	public static void main(String args[])
	{
		String str = "hello JIVAN, this is JAVA.";
		String res;
		
		res = str.toLowerCase();
		System.out.println("\ntoLowerCase = " + res);
		
		res = str.toUpperCase();
		System.out.println("toUpperCase = " + res);
		
		System.out.println("str = " + str);
	}
}