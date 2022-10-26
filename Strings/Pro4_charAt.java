/* # charAt() method :-

Note : [] notation is not allowed on String. Hence to access String character by character we can't use [] notation.
       We have to use inbuilt method 'charAt(index)'
	   charAt() is non-static member function of class String. Hence to access it, we have to use String object.
*/

class Pro4_charAt
{
	public static void main(String args[])
	{
		String S1 = "Hello";
		
		//System.out.println(S1[0]);		//error [] cannot be used with Strings
		char ch;
		ch = S1.charAt(1);
		System.out.println(ch);	// e
		
		System.out.println("Jivan".charAt(2));	// v
		
		System.out.println("\nAccessing String here char by char");
		for(int i=0; i<S1.length(); i++)
		{
			System.out.println(S1.charAt(i));
		}
	}
}