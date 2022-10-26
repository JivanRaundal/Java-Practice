/* # endsWith() :-

-SYNTAX :-  boolean endsWith(String str)
-this method returns true if calling sting ends with mentioned string (passed as a parameter).
*/

class Pro15_endsWith
{
	public static void main(String args[])
	{
		String str = "Hello from Java";
		boolean val;
		val = str.endsWith("va");
		System.out.println("val = " + val);
		
		if(str.endsWith("Jav"))
		{
			System.out.println("YES, ends with given string");
		}
		else
		{
			System.out.println("NO, doesn't ends with given sting");
		}		
	}
}