/* # regionMatches() :-

# regionMatches() :- 
-Note :- This function compares set of characters from given strings.
-SYNTAX :- boolean regionMatches(int str1Start, String str2, int str2Start, int no_of_characters);
-this methode is case-sensitive.
-it is non-static member functions of class String. So, regionMatches() will always work for Calling object (Calling String).
 So, calling string is directly accessible and the other one should pe passed as a parameter. 
 
# Note :- But, if we want to compare Strings without considering cases(upperCase/lowerCase), then we have overloaded 'regionMatches()' method.

SYNTAX :  boolean regionMatches(boolean ignorecase,int str1Start,String str2,int str2Start,int no_of_characters);
-If ignorecase value is 'true', it compares set of characters by ignoring case & if 'false' then considers case also for comparison.
*/

class Pro13_regionMatches
{
	public static void main(String args[])
	{
		//1] case-sensitive regionMatches() method
		
		String str1 = "this is JAVA";
		String str2 = "hello this from me";
		
		boolean val1,val2;
		val1 = str1.regionMatches(0,str2,6,4);
		System.out.println("val1 = " + val1);			//true
		
		val2 = str1.regionMatches(0,str2,11,4);
		System.out.println("val2 = " + val2);			//false
		
		System.out.println("------------------------------------------------------------------");
		
		//2] non case-sensitive regionMatches() method  (first para should be 'true')
		
		String S1 = "THIS IS JAVA";
		String S2 = "hello this from me";
		
		val1 = S1.regionMatches(true,0,S2,6,4);			//ignore case
		System.out.println("val1 = " + val1);			//true
		
		val2 = S1.regionMatches(false,0,S2,6,4);		//considers case
		System.out.println("val2 = " + val2);			//false
	}
}