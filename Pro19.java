// final keyword :-

// -'final' keyword is used with local variables to create constant values.
// -here, 'final' is working as a 'const' in c/c++.
// -A var declared with final keyword can be initialized only once. (At time of declaration or after declaration)
// -Re-initialization of final var will result in compile-time error.

class Pro19
{
	public static void main(String args[])
	{
		final int x;
		int y;
		
		System.out.println("Initializing final var x");
		x = 10;
		System.out.println("x = " + x);
		
		//x = 20;			//error, cannot re-initialize final var
		
		//but you can use it 
		y = x + 5;
		
		System.out.println("y = " + y);
		
	}
}