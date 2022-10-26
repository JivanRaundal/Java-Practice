/* # Local Classes :- 
 
 Note :- Defining class inside function is known as local class.
        -Local classes are accessible inside function of declaration only. we can't access them in another function.
 Note :- we can't mention access-specifiers for Local classes like Nested classes, Compiler gives error.
*/

class Pro69
{
	public static void main(String args[])
	{
		//Local class
		class LocalClass			//accessible inside function of declaration only
		{
			public int x;
			
			public void show()
			{
				System.out.println("In Local class show(), x = " + x);
			}
		}
		
		LocalClass obj = new LocalClass();
		obj.x = 10;
		obj.show();
		
		myfun();
	}
	
	public static void myfun()
	{
		//LocalClass var = new LocalClass();			//error, Local classes are accessible inside function of declaration only
	}
}