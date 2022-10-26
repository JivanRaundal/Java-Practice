// datatypes & variables

class Pro3
{
	public static void main(String args[])
	{
		System.out.println("\nHello Jivan Welcome to JAVA Programming.");
		
		//fractional values are considered as double & not float by compiler.
		//to make it float we have to use Typecasting.
		float f;
		//f = 3.5;			//error :  possible lossy conversion from double to float
		// to aviod above error we have to use typecasting or use 'f' at last.
		f = (float)3.5;
		System.out.println("f = " + f);
		f = 4.5f;
		System.out.println("f = " + f);
		
		boolean b;
		//b = 5;			//error : int cannot be converted to boolean
		//b = (int)5;		//error : int cannot be converted to boolean (not possible using typecasting also)
		//boolean can have only true & false values.
		b = true;		//no error
		
		System.out.println("b = " + b);
		
		char ch;
		ch = 'A';
		//ch = 'AB';		//error, we can mention only single character in single quotes ' '
		System.out.println("ch = " + ch);
		
		System.out.println();
	}
}