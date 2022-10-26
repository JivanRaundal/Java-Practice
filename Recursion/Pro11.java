// Q. print addition of 1 to 10 numbers recursively.

class Pro11
{
	public static void main(String args[])
	{
		int ans;
		ans = add(1);
		System.out.println("\nAddition of 1 to 10 numbers = " + ans);
	}
	
	static int add(int x)
	{
		if(x == 11)
		{
			return 0;
		}
		else
		{
			int y;
			y = add(x+1);
			return (x+y);
		}
	}
}