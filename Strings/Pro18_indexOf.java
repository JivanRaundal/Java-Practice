/* # indexOf() :-

-SYNTAX  1) int indexOf(String str)
         2) int indexOf(char ch)
		 3) int indexOf(String str,int startIndex)
		 4) int indexOf(char ch,int startIndex)
-non-static member function of class String.
-1] int indexOf(String str) :- searches first occurence of given string(passed as a para) in calling string and returns index of substring.
-2] int indexOf(char ch)    :- searches first occurence of given character in calling string and returns it's index.
-3] int indexOf(String str,int startIndex) :- searches first occurence of given string in calling string after the startIndex & returns index.
-4] int indexOf(char ch,int startIndex)    :- searches first occurence of given character in calling string after startIndex and returns it's index.
-Note :- In all above methods, If given string/character is not found, then it returns -1.
*/

class Pro18_indexOf
{
	public static void main(String args[])
	{
		String str;
		int ind;
		
		//1] int indexOf(String str) & int indexOf(String str,int startIndex)
		str = "chapple is mine, apple is yours";
		ind = str.indexOf("apple");
		System.out.println(ind);				//2
		
		ind = str.indexOf(" apple ");
		System.out.println(ind);				//16
		
		ind = str.indexOf("hello");
		System.out.println(ind);				//-1
		
		ind = str.indexOf("is");
		System.out.println(ind);				//8
		
		ind = str.indexOf("is",9);				//----
		System.out.println(ind);				//23
		
		System.out.println("------------------------------------");
		
		//2] int indexOf(char ch) & int indexOf(char ch,int startIndex)
		str = "this is Java";
		ind = str.indexOf('J');
		System.out.println(ind);				//8
		
		ind = str.indexOf('z');					
		System.out.println(ind);				//-1
		
		ind = str.indexOf('i');
		System.out.println(ind);				//2
		
		ind = str.indexOf('i',3);				//----
		System.out.println(ind);				//5
	}
}