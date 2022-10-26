
/* Note :- Following code was valid in c/c++. i.e. In c/c++ we were allowed to declare more than 1 variable with same name but in 
		   different block/scope. But, it's not allowed in Java. i.e. You cannot declare 2 variables with same name in one function.
		   even if you declare them in different block/scope.
		   You will get => error: variable x is already defined in method main(String[])
*/

class Pro35
{
	public static void main(String args[])
	{
		int x = 10;
		{
			int x = 12;
			System.out.println("Inner x = " + x);
		}
		System.out.println("Outer x = " + x);
	}
}
 