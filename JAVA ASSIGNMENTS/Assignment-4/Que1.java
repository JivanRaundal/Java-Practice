// Q.1] WAP to explain static variables.

class Number
{
	public int x;			//non-static datamember
	public static int y;	//static datamember
	
	public void change()
	{
		x++;
		y++;
	}
	
	public void print()
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Que1
{
	public static void main(String args[])
	{
		Number T1 = new Number();
		Number T2 = new Number();
		Number T3 = new Number();
		
		T1.change();
		T1.print();
		T2.change();
		T2.print();
		T3.change();
		T3.print();
	}
}