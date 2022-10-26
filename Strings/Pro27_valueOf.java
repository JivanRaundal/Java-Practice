/* # valueOf() :- (imp)

-SYNTAX for calling :- String.valueOf()
-static member function of class String.
-Converts value of premitive datatype in String.
*/

class Pro27_valueOf
{
	public static void main(String args[])
	{
		String str = "hello";
		str = str + 10;				//valid, converts 10 in string automatically during concatenation
		System.out.println("\n"+str);
		
		//str = 10;					//error, cannot convert premitive type int into String directly.
		
		//to convert premitive datatype into string we have to use 'valueOf()' function.
		str = String.valueOf(10);		
		System.out.println(str);
		
		double d = 9.7;
		str = String.valueOf(d);
		System.out.println(str);
		
		short s = 45;
		str = String.valueOf(s);
		System.out.println(s);
	}
}