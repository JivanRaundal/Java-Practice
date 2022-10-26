// Logical Operators :- ( &&, ||, !, &, | )

// Note =>
// 1] Logical operators works with boolean values / expressions only.
// 2] Logical '&&' and Logical '||' operators are also called Shortcircuit operators.
// 3] Single '&' and Single '|' are normal logical operators. They are not shortcircuit operators, both expn gets checked.
// 4] divide by zero is runtime error. 'ArithmeticException Error : / by zero'

import java.util.Scanner;

class Pro12
{
	public static void main(String args[])
	{
		boolean res;
		
		res = 2>5 && 8<12;
		System.out.println("res = " + res);
		
		res = 2<5 || 22>15;
		System.out.println("res = " + res);
		
		//Shortcircuiting :-
		
		//(Hindi) = Agar runtime error aayi toh 2nd expn check huaa.
		// Agar runtime error nhi aayi toh 2nd expn check nahi huaa.
		
		int x = 10;
		res = 1>7 && (x/0)>10;		//2nd expn is error '/ by zero'
		System.out.println("res = " + res);
		
		res = 12>2 || (x/0)>10;		//2nd expn is error '/ by zero'
		System.out.println("res = " + res);
		
		/* Error
		res = 1<7 && (x/0)>10;		//2nd expn is error '/ by zero'
		System.out.println("res = " + res);
		
		res = 12<2 || (x/0)>10;		//2nd expn is error '/ by zero'
		System.out.println("res = " + res);
		*/
	}
}