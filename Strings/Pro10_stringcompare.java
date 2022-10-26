/* # Strings Comparison :-
Note :- When we compare string objects using '=='. we actually compare references in String reference variables and not the actual strings. 
*/

class Pro10_stringcompare
{
	public static void main(String args[])
	{
		String S1 = "Hello";
		String S2 = "Hello";
		String S3 = new String("Hello");
		
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		System.out.println(System.identityHashCode(S3));
		
		if(S1 == S2)			//When we use == to compare string objects, we actually compare their references. Hence (S1==S2) is true, BCZ, they
		{						//contain same reference number.
			System.out.println("\nEqual");
		}
		else
		{
			System.out.println("\nNot Equal");
		}
		
		System.out.println("-----------------------------------------------");
		
		if(S1 == S3)			//But, (S1==S3) is false as they have different reference number. So, we do not use '==' to compare strings.
		{
			System.out.println("\nEqual");
		}
		else
		{
			System.out.println("\nNot Equal");
		}
	}
}