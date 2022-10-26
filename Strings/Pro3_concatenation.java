/* # String Concatenation :-

Note :- '+' operator is overloaded internally for concatenation of strings.
		After concatenation, new String object will get created. There will be no any change in existing strings BCZ, string is any
        immutable object.
*/

class Pro3_concatenation
{
	public static void main(String args[])
	{
		String S1 = "Hello";
		String S2 = "World";
		String S3 = S1 + S2;		//concatenation of Strings
		
		System.out.println("S1 = " + S1);
		System.out.println("S2 = " + S2);
		System.out.println("S3 = " + S3);
		
		System.out.println("Hii" + " " + "Jivan");
	}
}