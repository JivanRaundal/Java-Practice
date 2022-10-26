// Q.1] this reference variable

class Number
{
	public int x,y;
	
	public void getdata(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void print()
	{
		System.out.println("\nx =  " + x + "\ty = " + y);
	}
}

class Pro70
{
	public static void main(String args[])
	{
		Number obj = new Number();
		Number var = new Number();
		
		obj.getdata(10,20);
		var.getdata(5,6);
		obj.print();
		var.print();
	}
}

