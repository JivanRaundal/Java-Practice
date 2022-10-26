/* # substring() :-

//Note :- String object once created, cannot be modified.

-SYNTAX : 1) String substring(int startIndex)						//will copy from startIndex to end of string
          2) String substring(int startIndex,int endIndex)			//will copy from startIndex to endIndex-1
-non-static member function.
-1] String substring(int startIndex) :- creates a new String containing characters from startIndex to end of string and returns reference of newly
    created string. But it does not modify the calling string. (BCZ, string objects are immutable)
-2] String substring(int startIndex,int endIndex) :- In this case, String returned by substring() function contains all the characters starting
    from startIndex upto endIndex-1. (does not include character at endIndex)
*/

class Pro20_substring
{
	public static void main(String args[])
	{
		String str = "apple is mine, apple is yours.";
		String res;
		res = str.substring(6);		//will create substring starting from 6th index to end of string str
		System.out.println("str = " + str);
		System.out.println("res = " + res);
		
		System.out.println("---------------------");
		
		res = str.substring(6,13);	//will create substring starting from 6th index upto 12th index (13-1)
		System.out.println("str = " + str);
		System.out.println("res = " + res);
	}
}