/* # Strings in JAVA :-

Note :- In C/C++, Strings are null terminated ('\0') character arrays. We can access Strings as a character array. (using [] notation)

JAVA Strings :-
-Strings are not null terminated character arrays.
-String is simply an inbuilt class in JAVA. So, whenever we want to access a String, we create an object of class String.
-This are not '\0' terminated Strings.
-Strings indexing starts from 0.
*/

// Ways to create Strings :

class Pro1
{
	public static void main(String args[])
	{
		String name = "HELLO";			//Note: name is just reference var of object of inbuilt class String
		System.out.println("name = " + name);
		
		String S1 = new String();			//this is also valid, BCZ String is nothing but an object of class String
		System.out.println("S1 = " + S1);	//this will print an blank string
		
		//we can directly pass string as a parameter to parametrized constructor of String
		String S2 = new String("World");	//parametrized constructor of String class
		System.out.println("S2 = " + S2);
		
		//we can also pass another string(object) as a parameter to parametrized constructor of String class
		String S3 = new String(S2);
		System.out.println("S3 = " + S3);
		
		String S4 = S3;					//this is also valid
		System.out.println("S4 = " + S4);
		
		//we can also pass reference of normal character array as a parameter to parametrized constructor of String class
		char arr1[] = {'h','e','l','l','o'};			//normal character array
		String S5 = new String(arr1);				//valid
		System.out.println("S5 = " + S5);
		
		//one more parametrized constructor of class String
		//STNTAX :- String str = new String(ref_var_of_char_arr, start_ind, no_of_characters);
		char arr[] = {'h','e','l','l','0'};
		
		String S6 = new String(arr,0,3);
		System.out.println("\nS6(arr,0,3) = " + S6);		// hel
		
		String S7 = new String(arr,2,2);
		System.out.println("S7(arr,2,2) = " + S7);			// ll
		
		String S8 = new String(arr,2,3);
		System.out.println("S8(arr,2,3) = " + S8);			// llo
		
		String S9 = new String(arr,4,1);
		System.out.println("S9(arr,4,1) = " + S9);			// o
		
		//String S10 = new String(arr,3,10);					//error, 'StringIndexOutOfBoundsException' BCZ, length of char arr is 5  
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: offset 3, count 10, length 5
		
		//String S11 = new String(arr,4,3);				//error, 'java.lang.StringIndexOutOfBoundsException'
		
		//String S12 = new String(arr,-1,3);			//does not support negative indexing like python 
		//error, 'java.lang.StringIndexOutOfBoundsException'
	}
}