// Bitwise// Bitwise operators (<<, >>, &, |, ^, ~, >>>)

// Bitwise Right shift '>>' operator :-

class Pro15
{
	public static void main(String args[])
	{
		//Bitwise right shift operator '>>'
		//Formula : ans = num/2^nb   ;where num is number to be shifted & nb is no. of bytes to be shifted
		// If number is positive right shift will stop once reached to 0 (zero)
		// If number is negative right shift will stop once reached to -1
		// Answer in case of right shift is always in range, there is no possibility of going out of range.
		
		short x;
		x = 20;
		
		x = (short)(x>>1);
		System.out.println("20>>1 = " + x);
		
		x = (short)(x>>1);
		System.out.println("10>>1 = " + x);
		
		x = (short)(x>>1);
		System.out.println("5>>1  = " + x);
		
		x = (short)(x>>1);
		System.out.println("2>>1  = " + x);
		
		x = (short)(x>>1);
		System.out.println("1>>1  = " + x);
		
		// Right Shifting for positive number stops at zero(0)
		System.out.println("\n5>>1 = " + (5>>1));
		System.out.println("5>>2 = " + (5>>2));
		System.out.println("5>>3 = " + (5>>3));
		System.out.println("5>>4 = " + (5>>4));
		System.out.println("5>>5 = " + (5>>5));
	
		// Right shift of negative number.
		// Right shift for negative number stops at -1
		
		int y = -10;
		y = y>>1;
		System.out.println("\n-10>>1 = " + y);
			
		System.out.println("\n-20>>1 = " + (-20>>1));
		System.out.println("-20>>2 = " + (-20>>2));
		System.out.println("-20>>3 = " + (-20>>3));
		System.out.println("-20>>4 = " + (-20>>4));
		System.out.println("-20>>5 = " + (-20>>5));
		System.out.println("-20>>6 = " + (-20>>6));
		System.out.println("-20>>7 = " + (-20>>7));
	}
}
