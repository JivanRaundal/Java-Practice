/* # stackTrace :-

Note: When we do not handle exceptions explicitly, then JVM handles the exception and it terminates our code's execution and JVM prints the stackTrace
      # What is stackTrace ? - Sequence of functions from function generating exception to main() function. (prints path from exception generating
								function to main() function.)
	  -JVM destroyes the stackframe of all the functions mentioned in stackTrace due to exception.
*/

// eg:- Note the stackTrace 

class Pro1_stackTrace
{
	public static void main(String args[])
	{
		System.out.println("main() starts");
		myfun();
		System.out.println("main() ends");
	}
	
	static void myfun()
	{
		show();
		yourfun();
	}
	
	static void yourfun()
	{
		System.out.println("In yourfun()");
		int res;
		res = 5/0;				// 'ArithmeticException'
		System.out.println("res = " + res);
	}
	
	static void show()
	{
		System.out.println("In show()");
	}
}