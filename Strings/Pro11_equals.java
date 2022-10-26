/* # Strings Comparison :-
Note :- When we compare string objects using '=='. we actually compare references in String reference variables and not the actual strings. 
        Hence, we cannot use == to compare strings.

Note :- To compare strings we have inbuilt method.

# equals() :- -This method will compare the actual strings.
              -this method is case-sensitive (means capital 'A' & small alphabet 'a' are different)
			  -SYNTAX :   boolean equals(Object obj);		//this method is from Object class & is overriden in String class.
			  -Hence,     boolean equals(String str);
*/

class Pro11_equals
{
	public static void main(String args[])
	{
		String S1 = "Hello";
		String S2 = new String("Hello");
		
		//to check references
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
	
		if(S1.equals(S2))				//equals() method
		{
			System.out.println("\nEqual");
		}
		else
		{
			System.out.println("\nNot equal");
		}
		
		//Note :- equals() method is case-sensitive
		if("JIVAN".equals("jivan"))
		{
			System.out.println("\nEqual");
		}
		else
		{
			System.out.println("\nNot Equal");
		}
	}
}


