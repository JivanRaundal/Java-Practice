/* Note : You can use Exception class with throws keyword instead of particular exception class.
*/

class Pro29_throws
{
	public static void main(String args[]) throws Exception
	{
		show();
		
		/*
		try
		{
			show();
		}
		catch(Exception e)
		{
			System.out.println("\nException caught :: " + e);
		} */
	}
	
	static void show() throws Exception
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i = " + i);
			Thread.sleep(500);
		}
	}
}