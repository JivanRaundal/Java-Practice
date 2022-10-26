// Q.10-8] Scan 2 distances from user here. print total meters of each distance. Do not add any extra function.

import java.util.*;

class Distance
{
	private int km, mtr;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter distance in km & mtr : ");
		km = sc.nextInt();
		mtr = sc.nextInt();
	}
	
	private void totalMeters()
	{
		int total;
		total = km * 1000 + mtr;
		System.out.println("\nTotal meters = " + total + " mtr");
	}
	
	public void showData()
	{
		System.out.println("\nOriginal distance = " + km + " km & " + mtr + " mtr");
		totalMeters();					//calling one mem-function from another, bcz totalMeters() is private
	}
}

class Que10_8
{
	public static void main(String args[])
	{
		Distance D1,D2;
		D1 = new Distance();
		D2 = new Distance();
		
		D1.getData();
		D1.showData();
		
		D2.getData();
		D2.showData();
	}
}