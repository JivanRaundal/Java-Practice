/* # Defining our own exception class :

Note : To make our class work as a Exception class, we have to extend(inherit) 'Throwable' class in our class BCZ, throw mechanism for try-catch is defined
       inside the Throwable class. Our local class object cannot be thrown using throw keyword unless we inherit throw mechanism. Hence, we have to extend
	   Throwable class Or any of exception class in out local class.

*/

// eg: defining our own exception class

class MyException extends Throwable		//Inheriting Throwable class 
{
	public String toString()			//overriding toString() method of Object class here
	{
		return "Exception of type MyException";
	}
}

class Pro32_MyException_class
{
	public static void main(String args[]) //throws MyException
	{
		MyException me = new MyException();
		
		throw me;		//error: unreported exception MyException; must be caught or declared to be thrown BCZ, we are inheriting Throwable class which is 
						//checked exception, If we inherit RuntimeException class then MyException class will also become unchecked exception
		
		/*
		try
		{
			throw me;
		}
		catch(MyException e)
		{
			System.out.println("\nException caught :: " + e);
		}
		*/
	}
}