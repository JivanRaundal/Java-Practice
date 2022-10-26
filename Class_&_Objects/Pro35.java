/* # Anonymous Block :- 'no-name' block

1) Anonymous block means block with 'No-name'.
2) It does not get executed when executor enters class for first time like static block.
3) It get's executed on per object basis.
4) Whenever, you create an object of class, anonymous block will get executed. (same as constructor)
5) Both static & non-static members are directly accessible from anonymous block.
6) One class can contain multiple anonymous blocks.
7) Anonymous block get's executed before the constructor.
8) USE : same as constructor. In your code you may have multiple constructor & some statements are common in all constructors then,
		 you can write that statements in anonymous block.
*/

// Note :- Both static & non-static members are directly accessible from anonymous block.

class Number
{
	public int x = 10;				//non-static
	public static int y = 20;		//static
	
	static
	{
		System.out.println("\nIn static block");
	}
	
	{
		System.out.println("\nIn anonymous block, x = " + x + "\ty = " + y);
		print();
		show();
	}
	
	static void print()
	{
		System.out.println("In static print()");
	}
	
	void show()
	{
		System.out.println("In non-static show()");
	}
}

class Pro35
{
	public static void main(String args[])
	{
		Number T1 = new Number();
		Number T2 = new Number();
		Number T3 = new Number();
	}
}