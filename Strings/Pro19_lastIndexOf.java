/* # lastIndexOf() :-

-SYNTAX  1) int lastIndexOf(String str)
         2) int lastIndexOf(char ch)
		 3) int lastIndexOf(String str,int endIndex)
		 4) int lastIndexOf(char ch,int endIndex)
-non-static member function of class String.
-searches last occurence of given string or character in calling string upto endIndex-1(if mentioned) and returns index if found.
-If string or character does not found, then is  returns -1.
*/

class Pro19_lastIndexOf
{
	public static void main(String args[])
	{
		String str;
		int ind;
		
		//1] int lastIndexOf(String str)
		str = "apple is mine, apple is yours.";
		ind = str.lastIndexOf("apple");
		System.out.println(ind);			//15
		
		ind = str.lastIndexOf("hello");
		System.out.println(ind);			//-1
		
		ind = str.lastIndexOf("is");
		System.out.println(ind);			//21
		
		ind = str.lastIndexOf("is",10);		//----
		System.out.println(ind);			//6
		
		System.out.println("----------------------------");
		
		ind = str.lastIndexOf('a');
		System.out.println(ind);			//15
		
		ind = str.lastIndexOf('a',5);		//----
		System.out.println(ind);			//0
		
	}
}