/* # Object class :-

Note : In following eg, This is simply parameter passing mechanism where reference variable of Object class can store reference of objects of it's derived classes. 

*/

// eg:

class Pro18_object_class
{
	public static void main(String args[])
	{
		ArithmeticException ae = new ArithmeticException();
		
		myfun(ae);
	}
	
	static void myfun(Object e)					//catching object of class ArithmeticException in Object class reference variable
	{
		System.out.println("\nIn myfun() :: " + e);
	}
}