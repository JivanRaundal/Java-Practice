/* Note :
String objects are immutable, it is BCZ once we create an object of string, we cannot change it's content. If you want to change the content of 
currently existing string, you have to create a new string object with tour changes. But original string cannot be modified.

Note :- for [ String str = "Hello"; ] this Syntax, if 2 strings have same content then both reference variables refere to same String object.
        But, for [ String str =  new String("Hello"); ] this syntax, memory of both objects will be different.
*/

class Pro9
{
	public static void main(String args[])
	{
		//for String str = "Hello"; this syntax
		//memory will be same if both strings contents are same
		String S1 = "Hello";
		String S2 = "Hello";
		
		System.out.println("\nBefore\nS1 = " + S1);
		System.out.println("S2 = " + S2);
		
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		
		S2 = "Bye";					//this will create another object for S2 but will not change previous string. BCZ, String objects are immutable
		
		System.out.println("\n\nAfter\nS1 = " + S1);
		System.out.println("S2 = " + S2);
		
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		
		//for String str = new String("Hello"); this syntax
		//although contents are same but memory will be different
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println("\nstr1 = " + str1);
		System.out.println("str2 = " + str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}