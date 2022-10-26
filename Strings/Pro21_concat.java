/* # concat() :-

-SYNTAX : String concat(String str2)
-this method creates new String object, concatenates two Strings and returns the reference of newly created String.
*/

class Pro21_concat
{
	public static void main(String args[])
	{
		String str = "apple is";
		String s   = " mine.";
		String res;
		res = str.concat(s);
		System.out.println("\nstr = " +  str);			//original strings are not modified
		System.out.println("s   = " + s);
		System.out.println("res = " + res);				//concatenated String
		
		//if you want to store result of concat() in original string reference variable then you can do this
		str = str.concat(" yours.");			//Note:- String objects cannot be modified but, reference variable can ne modified.
		System.out.println("\nstr = " + str);
	}
}