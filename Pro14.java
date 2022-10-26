// Bitwise operators (<<, >>, &, |, ^, ~, >>>)

// Bitwise Left shift '<<' operator :-

class Pro14
{
	public static void main(String args[])
	{
		// bitwise left shift '<<' operator 
		// Formula : ans = num * 2^nb;		where num = is given number & nb = number of bits to be shifted
		short x;
		x = 5;
		
		x = (short)(x<<1);
		System.out.println("5<<1  = " + x);
		
		x = (short)(x<<1);
		System.out.println("10<<1 = " + x);
		
		x = (short)(x<<1);
		System.out.println("20<<1 = " + x);
		
		System.out.println("7<<3  = " + (7<<3));
		
		// if number after shifting goes out of range (for short = -32768 to 32767) then perform actual shifting using steps.
		short y;
		y = 16386;
		
		y = (short)(y<<1);
		System.out.println("\n16386<<1 = " + y);
		
		y = 16400;
		y = (short)(y<<1);
		System.out.println("16400<<1 = " + y);
		
		// left shifting of negative number
		short z;
		z = -20;
		
		z = (short)(z<<1);
		System.out.println("\n-20<<1    = " + z);
		
		z = -16400;
		z = (short)(z<<1);
		System.out.println("-16400<<1 = " + z);
	}
}