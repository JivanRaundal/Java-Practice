/* # String functions :

# getChars() :
-SYNTAX :  void getChars(int sourceStart,int sourceEnd,char target[],int targetStart);
-This method will extract multiple characters from String.
-It is non-static member function of class String.
-We have to create & initialize target character array and has to pass it's reference. It will extract characters from string & will copy
 it in character array.
*/

//eg : getChars()

class Pro6_getChars
{
	public static void main(String args[])
	{
		String str = "Hello People. This is String in Java";		//String
		
		char target[] = new char[10];		//created & initialized character array
				
		str.getChars(0,8,target,0);			//Note :- here, sourceEnd is 8, but it actually copies only 0-7 characters only (last index is not copied)
		
		for(char ch : target)				//printing character array
		{
			System.out.print(ch + "  ");
		}
		
		
		char arr[] = new char[12];
		
		str.getChars(6,12,arr,2);
		
		System.out.println();
		for(char ch : arr)
		{
			System.out.print(ch + "  ");
		}
	}
}