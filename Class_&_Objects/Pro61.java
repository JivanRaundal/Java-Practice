
// Note :- we can initialize array inside the class at the time of declaration using {}

class Number
{
	public int num[] = {10,20,30,40,50};		//valid 
	
	public Number()
	{
		System.out.println("In default constructor");
	}
}

class Pro61
{
	public static void main(String args[])
	{
		Number obj = new Number();
		
		System.out.println("\nPrinting Array : ");
		for(int x : obj.num)
		{
			System.out.println(x);
		}
	}
}