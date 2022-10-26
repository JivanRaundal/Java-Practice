/* # contains() :-

-SYNTAX :- boolean contains(String str)
-returns true if given string is present in callind string, else false. 
*/

class Pro26_contains
{
	public static void main(String args[])
	{
		String str = "This is java.";
		boolean val;
		val = str.contains("is");
		System.out.println(val);
		
		val = str.contains("hello");
		System.out.println(val);
	}
}