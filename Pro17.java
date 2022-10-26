// Bitwise ~ (bitwise compliment) Operator :-

// Bitwise compliment (~) operator 0(zero) ko 1 & 1 ko 0(zero) karta hai (HINDI)
// Note formula => 1) compliment of +ve number, ~num   = -(num+1)
//				   2) compliment of -ve number, ~(-num)= +(num-1)

class Pro17
{
	public static void main(String args[])
	{
		short x = 10;
		x = (short)(~x);			//x = ~10;
		System.out.println("\n~10  = " + x);
		
		x = (short)(~x);			//x = ~(-11);
		System.out.println("~(-11) = " + x);
		
		System.out.println("\n~20  = " + (~20));
		System.out.println("~(-21) = " + (~(-21)));
	}
}