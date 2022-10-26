// Q.2] WAP to explain static & anonymous block.

/*
Note : 1) -static block get's executed when executor enters the class for first time.
          -non-static members are not direclty accessible from static block. (have to use object & dot)
		  -static members are direclty accessible from static block.
		  
       2) -anonymous block get's executed for each object (same as constructor).
	      -It gets executed on per object basis.
		  -Both static & non-static members are direclty accessible from anonymous block.
*/

class Number
{
	public int x = 10;
	public static int y = 20;
	
	static 					//static block
	{
		System.out.println("\nIn static block");
		//System.out.println(x);		//error, bcz x is non-static
		System.out.println("y = " + y);			//valid bcz, y is static
	}
	
	{						//anonymous block
		System.out.println("\nIn anonymous block");
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Que2
{
	public static void main(String args[])
	{
		Number T1,T2,T3;
		T1 = new Number();
		T2 = new Number();
		T3 = new Number();
	}
}