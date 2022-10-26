/* 
Note: We can throw Unchecked exceptions also using 'throws' keyword from function header, but we don't have any restrictions to handle Unchecked exceptions
      in calling function. BCZ, restrictions are only for Checked exceptions.
*/

// eg :

class Pro30_throws
{
	public static void main(String args[]) 
	{
		show();				//no compile time error like checked exceptions
	}
	
	static void show() throws ArithmeticException	
	{
		int res = 10/0;
	}
}