// Q. print to 10 using recursion.

class Pro8
{
	public static void main(String args[])
	{
		fun(1);
	}
	
	static void fun(int x)
	{
		if(x == 11)		//terminating condition
		{
			return;
		}
		else
		{
			System.out.println(x);
			fun(x+1);
		}
	}
}