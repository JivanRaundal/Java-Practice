// Q.10-7] Complete the code for given main() function. Scan & print details of T1 & T2

import java.util.Scanner;

class Number
{
	private int x,y;				//private datamembers
	
	private void getData()			//private mem-function
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public void printData()			//public mem-function
	{
		getData();					//calling one mem-function from another bcz, getData() is private
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Que10_7
{
	public static void main(String args[])
	{
		Number T1,T2;
		T1 = new Number();
		T2 = new Number();
		
		T1.printData();
		T2.printData();
	}
}