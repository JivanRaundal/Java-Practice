// Q.6] Complete the following code for given main() function.

import java.util.Scanner;

class Base
{
	private int base;
	
	public void scanBase()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Base : ");
		base = sc.nextInt();
	}
	
	public void calculate(Power P)
	{
		int i,ans=1;
		int pow = P.getPower();
		
		for(i=1; i<=pow; i++)
		{
			ans = ans * base;
		}
		
		System.out.println("\n" + base + " raised to " + pow + " = " + ans);
	}
}

class Power
{
	private int power;
	
	public void scanData(Base B)
	{
		Scanner sc = new Scanner(System.in);
		B.scanBase();
		System.out.println("Enter Power : ");
		power = sc.nextInt();
	}
	
	public int getPower()
	{
		return power;
	}
}

class Que6
{
	public static void main(String args[])
	{
		Base objbase;
		Power objpower;
		objbase = new Base();
		objpower = new Power();
		
		objpower.scanData(objbase);				//scans data from user
		objbase.calculate(objpower);			//calculates base raised to power
	}
}