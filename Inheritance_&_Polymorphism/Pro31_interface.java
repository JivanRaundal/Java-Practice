
// Interfaces example :-

interface Intr1
{
	int x = 10;
	void show();
}

interface Intr2
{
	int x = 20;
	void disp();
}

class Myclass implements Intr1, Intr2
{
	public void show()
	{
		//System.out.println(x);					//Ambuiguity error
		System.out.println("In show Intr2.x = " + Intr2.x);
		System.out.println("In show Intr1.x = " + Intr1.x);
	}
	public void disp()
	{
		//System.out.println(x);					//Ambuiguity error
		System.out.println("In disp Intr2.x = " + Intr2.x);
		System.out.println("In disp Intr1.x = " + Intr1.x);
	}
}

class Pro31_interface
{
	public static void main(String args[])
	{
		Myclass obj = new Myclass();
		//System.out.println(obj.x);				//Ambuiguity error
		System.out.println("Intr2.x = " + Intr2.x);
		System.out.println("Intr1.x = " + Intr1.x);
	}
}