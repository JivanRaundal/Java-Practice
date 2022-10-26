// Bitwise zero filled right shift '>>>' operator :-

// Note :- 1) Right shift without bit-extension.
//         2) (HINDI) extreme left me empty space ki jagah by default zero(0) place hoga, no matter what the previous bit was.
//         3) Positive number ko zero filled right shift '>>>' me no problem / no change (same as >> for + ve number)
//         4) For Negative number, result after zero filled right shift '>>>' is Positive(+ve) always.
// Note :- Restriction => Perform bitwise >>> on int only, means go with 32-bit only.

class Pro18
{
	public static void main(String args[])
	{
		int x;
		x = 10;
		
		x = x>>>1;					//result will be same as >> for +ve number
		System.out.println("\n10>>>1 = " + x);
		
		//what about -ve numbers
		x = -4;
		x = x>>>1;
		System.out.println("\n-4>>>1 = " + x);
		
		x = -10;
		x = x>>>1;
		System.out.println("\n-10>>>1 = " + x);
		
		//let's try with short (16-bit)
		// If you try with 16-bit datatype (short) we get same result as of >> for -ve number
		short y;
		y = -4;
		y = (short)(y>>>1);
		System.out.println("\n-4>>>1 (16-bit) = " + y);
		
		y = (short)(y>>>1);
		System.out.println("-2>>>1 (16-bit) = " + y);
		
		y = 10;
		y = (short)(y>>>1);
		System.out.println("\n10>>>1 (16-bit) = " + y);
	}
}	