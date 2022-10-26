/* # startsWith() :-   

-SYNTAX : boolean startsWith(String str)
-returns true if calling string starts with given string.(mentioned in parameter)

Note :-  Overloaded startsWith() method.
-SYNTAX :  boolean startsWith(String str,int startIndex)
-returns true is calling string starts with String passed as a parameter from given index.
*/

class Pro14_startsWith
{
	public static void main(String args[])
	{
		//startsWith(str);
		String str = "this is Java";
		String S   = "this";
		boolean val1,val2;
		val1 = str.startsWith(S);					//---
		System.out.println("val1 = " + val1);
		val2 = str.startsWith("Hello");				//---
		System.out.println("val2 = " + val2);
		
		System.out.println("--------------------------------------");
		
		//startsWith(str,startIndex);
		val1 = str.startsWith("is",2);				//returns  true if string 'str' starts with string "is" from 2nd index 
		System.out.println("val1 = " + val1);
		val2 = str.startsWith("is",4);				//---
		System.out.println("val2 = " + val2);
	}
}
