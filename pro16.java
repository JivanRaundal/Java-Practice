// Bitwise// Bitwise operators (<<, >>, &, |, ^, ~, >>>)

// Bitwise AND(&), OR(|), EX-OR(^) operators :-

// Note => perform bitwise AND(&) / OR(|) / EX-OR(|) ,bit by bit.

class Pro16
{
	public static void main(String args[])
	{
		int x;
		
		// Bitwise AND '&'
		x = 10 & 7;					// 1010 (10) & 0111 (7) => 0010 (2)		//actually represented in 32-bit 
		System.out.println("\n(10 & 7) = " + x);
		
		// Bbitwise OR '|'
		x = 10 | 7;					// 1010 | 0111 => 1111 (15)
		System.out.println("\n(10 | 7) = " + x);
		
		// Bitwise EX-OR '^'			
		x = 10 ^ 7;					// 1010 ^ 0111 => 1101 (13) 
		System.out.println("\n(10 ^ 7) = " + x);
		
		System.out.println();
	}
}
