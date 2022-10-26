// Member functions returning value :-

// Q. add datamembers of class(x & y) & print result in main().

class Demo
{
	public int x;
	int y;
	
	public void set(int a,int b)
	{
		x = a;
		y = b;
	}
	public void show()
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
	public int addition()		//member-function returning value
	{
		int add;
		add = x + y;		// x & y are of calling object & add is local var of addition()
		return add;
	}
}

class Pro8
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		Demo var = new Demo();
		
		obj.set(10,5);
		var.set(9,7);
		
		System.out.println("\nobj called show i.e. obj.show() : ");
		obj.show();
		System.out.println("\nvar called show i.e. var.show() : ");
		var.show();
		
		int ans1,ans2;
		ans1 = obj.addition();
		ans2 = var.addition();
		
		System.out.println("\nAddition of datamembers of obj = " + ans1);
		System.out.println("Addition of datamembers of var = " + ans2);
	}
}