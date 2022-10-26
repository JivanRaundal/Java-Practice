// Q. Scan distance from user in km & mtr. Convert that distance in total meters. Print original distance & total meters.

import java.util.Scanner;

class Distance
{
	public int km;
	public int mtr;
	
	public void scanDistance()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter distance in km & mtr : ");
		km = sc.nextInt();
		mtr = sc.nextInt();
	}
	public void printDistance()
	{
		System.out.println("\nOriginal Distance = " + km + " km & " + mtr + " mtr");
		System.out.println("Total meters = " + convert() + " mtr");
	}
	public int convert()
	{
		int total;
		total = km * 1000 + mtr;
		return total;			//OR return km*1000+mtr;
	}
}

class Pro9
{
	public static void main(String args[])
	{
		Distance obj = new Distance();
		
		obj.scanDistance();
		obj.printDistance();
	}
}