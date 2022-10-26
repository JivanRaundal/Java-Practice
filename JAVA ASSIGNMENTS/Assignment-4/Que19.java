// Q.19] In below Que, you cannot define any parameterized const in any class. Given default constructors are private. Find base raised to power
//       in calculate() function and print answer in main() function.

import java.util.Scanner;

class Base
{
	private int base;
	
	private Base()
	{
		
	}
	
	static Base getBaseObject()
	{
		Scanner sc = new Scanner(System.in);
		Base temp = new Base();
		System.out.println("\nEnter Base : ");
		temp.base = sc.nextInt();
		return temp;
	}
	
	int getBase()
	{
		return base;
	}
}

class Power
{
	private int power;
	private Base bobj;
	
	private Power()
	{
		bobj = Base.getBaseObject();
	}
	
	static Power getPowerObject()
	{
		Scanner sc = new Scanner(System.in);
		Power temp = new Power();		//here, default cont will get called & getBaseObject() will create object of Base
		System.out.println("\nEnter Power : ");
		temp.power = sc.nextInt();
		return temp;
	}
	
	int calculate()
	{
		int i,ans = 1;
		for(i=1; i<=power; i++)
		{
			ans = ans * bobj.getBase();
		}
		return ans;
	}
}

class Que19
{
	public static void main(String args[])
	{
		Power varp = Power.getPowerObject();
		int ans = varp.calculate();
		System.out.println("\nAnswer = " + ans);
	}
}