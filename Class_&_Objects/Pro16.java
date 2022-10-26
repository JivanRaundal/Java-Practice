// Accessing Private mamners :-

class Number
{
	private int x;
	private int y;
	
	public void set(int a,int b)
	{
		x = a;
		y = b;
		print();		//calling one member function from another
	}
	
	private void print()			//private member function (accessible only from member function of same class)
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
	
}

class Pro16
{
	public static void main(String args[])
	{
		Number obj = new Number();
		
		//obj.x = 10;		//error, x is private
		//obj.y = 20;		//error, y is private
		
		obj.set(10,20);
		
		//obj.print();	//error, print() is private member function & not accessible in non-member function main()
	}
}