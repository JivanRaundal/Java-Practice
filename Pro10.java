// Arithmetic Operators

import java.util.Scanner;

class Pro10
{
	public static void main(String args[])
	{
		System.out.println("\nArithmetic Operators\n");
		
		System.out.println(10/4);			//int/int => int
		System.out.println(10/4.0);			//int/double => double (Implicit typecasting)
		System.out.println(10/(int)4.0);	//int/int => int       (explicit typecasting)
		
		int x;
		//x = 2.9;			//Error : Possible Lossy Conversion
		
		//x = 10/4.0;			//Error: due to lossy conversion (x(int) = result(double)) Lossy Conversion
		x = 10/(int)4.0;		//Solution to avoid error
		System.out.println("x = " + x);
		
		double y;
		y = 10/4;				// y(double) => result(int); smaller datatype(int) will convert into larger(double) datatype (Implicit typecasting)
		System.out.println("y = " + y);
		
		//to get 2.5 as a result use Explicit typecasting
		y = 10/(double)4;				// y(double) => result(int); smaller datatype(int) will convert into larger(double) datatype
		System.out.println("y = " + y);
	}
}