/* # trim() :-

-SYNTAX :- String trim()
-non-static member function of class String.
-this method creates new String and returns it's reference by eliminating all the leading & trailing spaces in calling String.
*/

class Pro23_trim
{
	public static void main(String args[])
	{
		String str = "   Hello Jivan, this is JAVA.    ";
		String res;
		res = str.trim();				//removes all the leading & trailing spaces in calling string.
		System.out.println("str = " + str);
		System.out.println("res = " + res);
	}
}