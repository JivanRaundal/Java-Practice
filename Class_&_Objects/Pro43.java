/* # final datamembers :- (same as const keyword in c++ but little difference)

Note=> final local variables : can be initialized only once, at the time of declaration or after declaration but before it's first use.

1) final class variable (datamember) must be initialized at declaration OR in any constructor.
2) If you try to initialize it at both places, compiler generates error.
3) non-static final variable get's memory on per object basis.
4) re-initialization is not allowed. 

# static final class variable (datamember) :-

1) (Hindi) - Agar static datamember ko finalize karna hai toh at the time of declaration OR in static block hi initialize kar skte,
			 constructor me initialize nhi kar skte bcz, we may use static datamember before creating object & also for each object
			 constructor call hoga & final static datamember re-initialize ho skta hai.
			 
2) Technically :- static final datamember must be initialized at the time of declaration OR in static block only.
                  We can't initialize it in constructor. BCZ, we may access static final class variable before creating any object. 
*/

class Number
{
	final static int x = 10;		// can initialize final static datamember at time of declaration
	final static int y;
	
	static
	{
		//x = 10;					// error, can't initialize it in both places.
		y = 20;						// can initialize final static datamember after declaration but in static block
	}
	
	Number()
	{
		//x = 10;						//error, can't initialize final static datamember in constructor
	}
}

class Pro43
{
	public static void main(String args[])
	{
		//Number.x = 100;				//error
		
		System.out.println("\nx = " + Number.x + "\ty = " + Number.y);
	}
}