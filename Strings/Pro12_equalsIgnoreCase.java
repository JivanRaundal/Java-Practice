/* # Strings Comparison :-
Note :- When we compare string objects using '=='. we actually compare references in String reference variables and not the actual strings. 
        Hence, we cannot use == to compare strings.

Note :- To compare strings we have inbuilt method.

# equalsIgnoreCase() :- -Same as 'equals()' method, But, 'equalsIgnoreCase()' method is 'not case-sensitive'. (means, Uppercase & Lowercase are same)
*/

class Pro12_equalsIgnoreCase
{
	public static void main(String args[])
	{
		String S1 = "hello";				//lowercase
		String S2 = new String("HELLO");	//UPPERCASE
		
		//to check references
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
	
		if(S1.equalsIgnoreCase(S2))				//equalsIgnoreCase() method
		{
			System.out.println("\nEqual");
		}
		else
		{
			System.out.println("\nNot equal");
		}
	}
}


