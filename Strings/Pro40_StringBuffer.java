/* # StringBuffer Class :-

Note :-
-Objects of class 'String' are immutable. (cannot be modified)
-Objects of class 'StringBuffer' are mutable. Means they can be changed. No need to create new object everytime.
*/

import java.util.Scanner;

class Pro40_StringBuffer
{
	public static void main(String args[])
	{
		StringBuffer strb = new StringBuffer();
		
		System.out.println("\nCapacity = " + strb.capacity());
		System.out.println("Length = " + strb.length());
		System.out.println(System.identityHashCode(strb));
		
		strb.append("HI");

		System.out.println("\nCapacity = " + strb.capacity());
		System.out.println("Length = " + strb.length());
		System.out.println(System.identityHashCode(strb));
		
		System.out.println("\nBefore = " +  strb);
		
		strb.setCharAt(0,'B');
		
		System.out.println("\nAfter = " + strb);
		
		/* //Error : incompatible types : String cannot be converted to StringBuffer
		Scanner sc = new Scanner(System.in);
		strb = sc.nextLine();
		*/
	}
}