// # Array as a datamembers of class :- (Array within class)

// Note :- runtime memory (on heap) has default value.

class Number
{
	public int num[];			//not an array, just refernce variable to array of integers	
	
	public Number()
	{
		num = new int[5];			//creating array for each object in constructor
	}
}

class Pro56
{
	public static void main(String args[])
	{
		Number obj;
		obj = new Number();
		System.out.println(obj.num);
		
		System.out.println("Accessing elements of num array of obj inside non-member function : ");
		for(int i=0; i<5; i++)
		{
			System.out.print(" " + obj.num[i]);
		}
	}
}