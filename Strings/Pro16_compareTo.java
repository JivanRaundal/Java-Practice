/* # compareTo() :-

-Same as 'strcmp()' in C++
-non-static member function of class String.
-return type is 'int'.
-this method will compare two strings char by char and will perform substraction of ASCII values of characters in string & finally will return
 substraction.
-return values of compareTo() method will be substraction of ASCII values of characters in strings.
 1) 0 	=> If both strings are equal.
 2) -ve => if String1 < String2 (i.e. Calling String < Parameter String)
 2) +4 
 ve => if String1 > String2 (i.e. Calling String > Parameter String)
*/

class Pro16_compareTo
{
	public static void main(String args[])
	{
		String str1 = "apple";
		String str2 = "cpple";
		int res;
		
		res = str1.compareTo(str2);
		System.out.println(res);			//-2  str1 < str2
		
		str1 = "apple";
		str2 = "Apple";
		res  = str1.compareTo(str2);
		System.out.println(res);			//+32  str1 > str2
		
		str1 = "Apple";
		str2 = "Apple";
		res  = str1.compareTo(str2);
		System.out.println(res);			//0    str1 == str2
	}
}