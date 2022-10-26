/* # final datamembers :- (same as const keyword in c++ but little difference)

Note=> final local variables : can be initialized only once, at the time of declaration or after declaration but before it's first use.

1) final class variable (datamember) must be initialized at declaration OR in any constructor.
2) If you try to initialize it at both places, compiler generates error.
3) non-static final variable get's memory on per object basis.
4) re-initialization is not allowed. 
*/

class Number
{
	final int x = 10;			//can initialize final datamember at time of declaration
	final int y;
	
	Number()					//default constructor
	{
		//x = 90;				//error, can be initialized only once
		y = 20;					//can initialize final datamember inside the constructor
	}
}

class Pro40
{
	public static void main(String args[])
	{
		Number obj = new Number();
		
		//obj.x = 100;		//error, cannot re-initialize final datamember
		System.out.println("\nx = " + obj.x + "\ty = " + obj.y);
	}
}