// Q 20.1]

import java.util.Scanner;

class Distance
{
	private int km,mtr;
	
	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter distance in km & mtr : ");
		km = sc.nextInt();
		mtr = sc.nextInt();
	}
	
	public void print()
	{
		System.out.println("Distance = " + km + " km & " + mtr +" mtr.");
	}
	
	public int convert()			//returns distance in total meters
	{
		return km*1000 + mtr;			
	}
}

class Que20_1
{	
	public static void main(String args[])
	{
		//Q.Scan 3 distances from user. Find which distance is larger.
		Distance D1,D2,D3;
		D1 = new Distance();
		D2 = new Distance();
		D3 = new Distance();
		
		D1.scan();
		D2.scan();
		D3.scan();
		
		Distance max;
		max = D1.convert() > D2.convert() ? D1 : D2 ;
		max = max.convert() > D3.convert() ? max : D3 ;
		
		System.out.println("\nMaximum Distance is");
		max.print();
	}
} 

