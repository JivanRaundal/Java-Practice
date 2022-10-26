// Q.4] Write a program to print 1 to 10 recursively.

class Que4
{
	public static void main(String args[])
	{
		System.out.println("\nPrinting 1 to 10 recursively : ");
		print(1);
	}
	
	static void print(int x)
	{
		if(x == 11)
		{
			return;
		}
		else
		{
			System.out.println(x);
			print(x+1);
		}
	}
}