/* # Object class :-

Note: Here, JVM says that in catch you can mention only that class which belongs to Throwable. BCZ creating an exception object, throwing it and
      finding matching catch is an exception handling mechanism which belongs to Throwable class, NOT Object class.
*/

// eg:

class Pro19_object_class
{
	public static void main(String args[])
	{	
		int res;
		
		try
		{
			res = 10/0;
		}
		catch(Object e)					//error, cannot use Object class in catch
		{
			System.out.println("\nException caught :: " + e);
		}
		
		System.out.println("\nmain() ends");
	}
}