/* # String functions :-

# length() method :-
-SYNTAX : string_object.length();
-It is non-static member function of class String.
-We have to use String object to call this method.
-It gives us number of characters in calling String object. 
*/

class Pro2_length
{
	public static void main(String args[])
	{
		String str = "HELLO";
		System.out.println(str.length());					//5
		System.out.println("this is java".length());		//12 this is also valid
	}
}