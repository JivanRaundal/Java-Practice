// Q.5] For the given main() funcion print 1 to 10 recursively.

class Que5
{
	public static void main(String args[])
	{
		System.out.println("\nPrinting 1 to 10 recursively : ");
		print(10);
	}
	static void print(int x)
	{
		if(x == 0)
		{
			return;
		}
		else
		{
			print(x-1);
			System.out.println(x);
		}
	}
}