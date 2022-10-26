// # Array as a datamembers of class :- (Array within class)

// Note :- runtime memory (on heap) has default value.

class Number
{
	public int num[];			//not an array, just refernce variable to array of integers	
}

class Pro55
{
	public static void main(String args[])
	{
		Number obj;
		obj = new Number();
		System.out.println(obj.num);		//null, will not give uninitialized var error, bcz, runtime memory has default value
		
		obj.num = new int[5];
		System.out.println(obj.num);
		
		System.out.println("obj.num[0] = " + obj.num[0]);
		System.out.println("obj.num[2] = " + obj.num[2]);
	}
}