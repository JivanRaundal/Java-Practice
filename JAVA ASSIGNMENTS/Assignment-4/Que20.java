// Q.20] Complete the following program to find base raised to power. Do not change the main() function. Do not add any extra function in any class.

import java.util.Scanner;

class Base
{
	private int b;
	
	void getBase()		//scans value of b
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Base : ");
		b = sc.nextInt();
	}
	
	int giveb()			//returns value of b
	{
		return b;
	}
	
	class Power			//Nested class
	{
		private int p;
		
		void getPower()	//scans value of p
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter Power : ");
			p = sc.nextInt();
		}
		
		int givep()		//returns value of p
		{
			return p;
		}
	}
}

class Operation
{
	Base bobj;			//reference to Base class object
	Base.Power pvar;	//reference to Inner/Nested Power class object 
	
	public Operation()		//default constructor - to initialize data members
	{
		bobj = new Base();
		//to create object of Inner/Nested class Power, we will require object of Outer class
		pvar = bobj.new Power();
	}
	
	void getData()			//scans values for datamembers
	{
		bobj.getBase();
		pvar.getPower();
	}
	
	int calculate()			//calculate base raised to power
	{
		int i,ans = 1;
		for(i=1; i<=pvar.givep(); i++)
		{
			ans = ans * bobj.giveb();
		}
		return ans;
	}
}

class Que20
{
	public static void main(String args[])
	{
		Operation operation = new Operation();
		operation.getData();
		System.out.println("\nAnswer = " + operation.calculate());
	}
}