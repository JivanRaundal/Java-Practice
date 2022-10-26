// Q.8] Inner Class

class Outer
{
	public class Inner
	{
		int y = 20;
		
		private void print()			//accessible inside the class only
		{
			System.out.println("\nIn Inner print() y = " + y);
		}
		
		public void show()
		{
			System.out.println("\nIn Inner show() y = " + y);
		}
	}
	
	int x = 10;
	Inner in = new Inner();
	
	public void disp()
	{
		System.out.println("\nIn Outer disp() x = " + x + " in.y = " + in.y);
	}
	
	public void callPrint()
	{
		in.print();			//will call print() of Inner class bcz it is accessible in Outer class also
	}
}

class Que8
{
	public static void main(String args[])
	{
		Outer out = new Outer();
		out.disp();
		out.in.show();
		//out.in.print();					//error, print() inside class Inner is private
		out.callPrint();
		
		Outer.Inner ref;		
		ref = out.new Inner();				//creating object of Inner class in non-member function
		ref.y = 22;
		ref.show();
	}
}


