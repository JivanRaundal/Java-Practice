/* Note :
String objects are immutable, it is BCZ once we create an object of string, we cannot change it's content. If you want to change the content of 
currently existing string, you have to create a new string object with tour changes. But original string cannot be modified.
*/

class Pro8
{
	public static void main(String args[])
	{
		String S1 = "Hello";
		String S2 = S1;
		
		System.out.println("\nBefore\nS1 = " + S1);
		System.out.println("S2 = " + S2);
		
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		
		S2 = "Bye";					//this will create another object for S2 but will not change previous string. BCZ, String objects are immutable
		
		System.out.println("\n\nAfter\nS1 = " + S1);
		System.out.println("S2 = " + S2);
		
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
	}
}