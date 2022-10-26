// Q.5] WAP to explain inner classes.

class Outer
{
	class Inner
	{
		int x = 10;
		
		void disp()
		{
			System.out.println("\nIn Inner disp() x = " + x);
		}
	}
	
	int y = 20;
	Inner in = new Inner();			//composition
	
	void show()
	{
		System.out.println("\nIn Outer show() y = " + y);
	}
}

class Que5
{
	public static void main(String args[])
	{
		Outer out = new Outer();
		out.show();
		out.in.disp();
		out.y = 2;
		out.in.x = 3;
		System.out.println("\ny = " + out.y + "\tx = " + out.in.x);
		
		//creating object of Inner class in non-member function using object of Outer class
		Outer.Inner ref;		//reference var of Inner class
		ref = out.new Inner();	//creating object of Inner class
		ref.x = 40;
		ref.disp();
	}
}