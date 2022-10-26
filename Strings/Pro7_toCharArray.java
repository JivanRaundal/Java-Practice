/* # String functions :-

# toCharArray() :
-SYNTAX :   char[] toCharArray();
-It is non-static member function of class String, which converts String into character array & returns the reference of character array..
-If you want to convert all the characters of string object into character array, you have to use 'toCharArray()' method.
 This method returns an array of characters containing all the characters in your String, we have to store this returned reference in 
 some reference variable. 
*/

//eg : toCharArray()

class Pro7_toCharArray
{
	public static void main(String args[])
	{
		String str = "Hello People. This is String in Java.";
		
		char target[];				//needs only reference variable (no need to initialize it like for getChars() method)
		
		target = str.toCharArray();		//converts string into character array & returns reference of character array
		
		for(char ch : target)
		{
			System.out.print(ch + "  ");
		}
	}
}