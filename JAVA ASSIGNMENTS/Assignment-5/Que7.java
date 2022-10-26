// Q.7] Local Class


class Que7
{
	public static void main(String args[])
	{
		class Demo			//cannot mention access-specifier for local class
		{
			int x;
			
			void show()
			{
				System.out.println("\nIn Local Demo show() x = " + x);
			}
		}
		
		Demo obj = new Demo();
		obj.x = 10;
		obj.show();
		
		myfun();
	}
	
	static void myfun()
	{
		//Demo var = new Demo();			//error, Local classes are not accessible outside it's function of declaration
	}
}