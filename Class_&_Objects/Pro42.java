/* # final datamembers :- (same as const keyword in c++ but little difference)

Note=> final local variables : can be initialized only once, at the time of declaration or after declaration but before it's first use.

1) final class variable (datamember) must be initialized at declaration OR in any constructor.
2) If you try to initialize it at both places, compiler generates error.
3) non-static final variable get's memory on per object basis.
4) re-initialization is not allowed. 
*/

class Number
{
	final int x;
	
	Number(int a)				//parameterized constructor
	{
		x = a;					//can initialize final datamember inside the constructor
	}
	
	void show()
	{
		System.out.println("\nx = " + x);
	}
}

class Pro42
{
	public static void main(String args[])
	{
		Number obj = new Number(10);
		Number var = new Number(20);
		
		//obj.x = 100;		//error, cannot re-initialize final datamember
		obj.show();
		var.show();
	}
}