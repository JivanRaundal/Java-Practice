/* # StringBuilder class :-

Note :-
-Objects of class 'String' are immutable. (cannot be modified)
-Objects of class 'StringBuilder' are mutable. Means they can be changed. No need to create new object everytime.

-Same as StringBuffer class.
-But, this is not threadsafe. Means it does not contain Synchronized methods. That can create problem when working with multithreading.
 But, it's performance is faster than StringBuffer class.

*/
class Pro41_StringBuilder
{
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder();

		System.out.println("\nCapacity = " + sb.capacity());
		System.out.println("Length = " + sb.length());
		System.out.println(System.identityHashCode(sb));
		
		sb.append("HELLO");
		
		System.out.println("\nCapacity = " + sb.capacity());
		System.out.println("Length = " + sb.length());
		System.out.println(System.identityHashCode(sb));
		
		System.out.println("\nBefore = " + sb);
		
		sb.setCharAt(0,'K');
		
		System.out.println("\nAfter = " + sb);
	}
}