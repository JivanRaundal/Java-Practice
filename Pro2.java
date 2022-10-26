//Datatypes & VAriables

class Pro2
{	
	public static void main(String args[])
	{
		System.out.println("Hello Jivan Welcome to JAVA");
		System.out.println("Hello" + " " + "Members");
	
		int x;
		x = 35;
		System.out.println("x = " + x);
		
		/*
		//byte range = -128 to 127
		byte b;
		b = 129;		//Error = "Possible lossy conversion from int to byte"
		
		//short range = -32768 to 32767
		short y;
		y = 32769;		//Error = "Possible lossy conversion from int to short"
			
		//int range = -2147483648 to 2147483647	
		int a;
		//a = 2147483649;	//Error = "integer number too large"
		a = 2147483649L;	//Error = "possible lossy conversion from long to int"
		*/
		
		//To avoid these range errors, always assign a value within the range or use typecasting.
		
		//byte range = -128 to 127
		byte b;
		b = (byte)129;			// No error (typecasting)
		System.out.println("byte b = " + b);
		b = 55;
		System.out.println("byte b = " + b);
		
		//short range = -32768 to 32767
		short y;
		y = (short)32769;		//No error (typecasting)
		System.out.println("short y = " + y);
		y = 32765;
		System.out.println("short y = " + y);
			
		//int range = -2147483648 to 2147483647	
		int a;
		//a = 2147483649;		//Error = "integer number too large"
		a = (int)2147483649L;	//No error (typecasting)
		System.out.println("int a = " + a);
		a = 214748;
		System.out.println("int a = " + a);
	}
}