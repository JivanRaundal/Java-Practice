// Q.1] WAP to explain different constructors to create String. check the working of length(),charAt() functions.

class Que1
{
	public static void main(String args[])
	{
		String S1 = "HELLO";
		System.out.println("\nS1 = " + S1);
		System.out.println("length of S1 = " + S1.length());
		System.out.println("S1.charAt(2) = " + S1.charAt(2));
	
		String S2 = new String();
		System.out.println("\nS2 = " + S2);
		System.out.println("length of S2 = " + S2.length());
	
		//we can directly pass string as a parameter to parametrized constructor of String
		String S3 = new String("World");
		System.out.println("\nS3 = " + S3);
		System.out.println("length of S3 = " + S3.length());
		System.out.println("S3.charAt(0) = " + S3.charAt(0));
	
		//we can directly pass string as a parameter to parametrized constructor of String
		String S4 = new String(S3);
		System.out.println("\nS4 = " + S4);
		System.out.println("length of S4 = " + S4.length());
		System.out.println("S4.charAt(3) = " + S4.charAt(3));

		String S5 = S4;
		System.out.println("\nS5 = " + S5);
		System.out.println("length of S5 = " + S5.length());
		System.out.println("S5.charAt(1) = " + S5.charAt(1));
	
		//we can also pass reference of normal character array as a parameter to parametrized constructor of String class
		char arr[] = {'h','e','l','l','o'};			//normal character array
	
		String S6 = new String(arr);				//valid
		System.out.println("\nS6 = " + S6);
		System.out.println("length of S6 = " + S6.length());
		System.out.println("S6.charAt(2) = " + S6.charAt(2));
	
		String S7 =  new String(arr,2,3);
		System.out.println("\nS7 = " + S7);
		System.out.println("length of S7 = " + S7.length());
		System.out.println("S7.charAt(0) = " + S7.charAt(0));
	
		//String S8 = new String(arr,3,10);		//Runtime error, 'StringIndexOutOfBoundsException'
	}
}