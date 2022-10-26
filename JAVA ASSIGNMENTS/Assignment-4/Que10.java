// Q.10] WAP to explain 'this' reference.

class Number
{
	public int x,y;
	
	public void getData(int x,int y)
	{
		this.x = x;					//this reference
		this.y = y;
	}
	
	public void printData()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Que10
{
	public static void main(String args[])
	{
		Number T1 = new Number();
		Number T2 = new Number();
		T1.getData(10,20);
		T2.getData(5,6);
		T1.printData();
		T2.printData();
	}
}