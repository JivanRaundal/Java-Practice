// Q. print only even numbers between 1 to 50.

class Pro9
{
	public static void main(String args[])
	{
		fun(1);
	}
	
	static void fun(int x)
	{
		if(x == 51)
		{
			return;
		}
		else
		{
			if(x%2 == 0)
			{
				System.out.println(x);
			}
			fun(x+1);
		}
	}
}