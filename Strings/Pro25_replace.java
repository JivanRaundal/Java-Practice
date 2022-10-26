/* replace() & replaceFirst() :-

-non-static member functions of class String.
SYNTAX :- 
1) String replace(String source, String target)
   -replaces all the occurences of source by target in calling string and returns a new modified string. Does not change calling string.
 
2) String replaceFirst(String source, String target)
   -replaces only first occurence of source by target in calling string.
*/

class Pro25_replace
{
	public static void main(String args[])
	{
		String str = "This is java. We are doing java, java is good language.";
		String res;
		res = str.replace("java","cpp");		//replaces all the occurences of java by cpp
		System.out.println("\nres = " + res);
		
		System.out.println("str = " + str);
		
		res = str.replaceFirst("java","cpp");		//replaces only first occurence of java by cpp
		System.out.println("res = " + res);	
	}
}