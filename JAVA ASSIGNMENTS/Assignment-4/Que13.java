// Q.13] Complete the following code. Note :- All functions in class must be static & do not use constructor.

import java.util.Scanner;

class Distance
{
	private int km,mtr;
	
	static void scanDistance(Distance temp)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter distance in km & mtr : ");
		temp.km = sc.nextInt();
		temp.mtr = sc.nextInt();
	}
	
	static void printDistance(Distance temp)
	{
		System.out.println("\nOriginal Distance = " + temp.km + " km & " + temp.mtr + " mtr");
		System.out.println("Total meters = " + (temp.km * 1000 + temp.mtr) + " mtr");
	}
}

class Que13
{
	public static void main(String args[])
	{
		Distance D1 = new Distance();
		Distance D2 = new Distance();
		
		Distance.scanDistance(D1);
		Distance.scanDistance(D2);
		
		Distance.printDistance(D1);
		Distance.printDistance(D2);
	}
}

