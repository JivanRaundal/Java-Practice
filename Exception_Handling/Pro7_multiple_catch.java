/* # Multiple Catch blocks :

-We can mention multiple catch blocks for single try block.
-we usually do this when there is possibility of generating different exceptions from try block. (But generates only one at a time)
-When exception is generated, it tries to find the matching catch one by one. When it finds matching catch, whole code in that catch block gets
 executed and executor jumps to immediate next instruction after all the catch blocks.
-If it does not find any matching catch, it goes to JVM : the default exception handler.
-Only one catch block executes from multiple catch blocks of single try block. 
*/

// eg:

class Pro7_multiple_catch
{
	public static void main(String args[])
	{
		System.out.println("\nmain() starts");
		int res;
		int a = 10;
		int num[] = new int[5];
		
		try
		{
			res = a/2;
			System.out.println("\nres = " + res);
			num[8] = 90;				// 'ArrayIndexOutOfBoundsException'
		}
		catch(ArithmeticException e)
		{
			System.out.println("\ncan not divide by zero :: " + e);
		}
		catch(ArrayIndexOutOfBoundsException ref)
		{
			System.out.println("\nArray index exception :: " + ref);
		}
		
		System.out.println("\nmain() ends");
	}
}