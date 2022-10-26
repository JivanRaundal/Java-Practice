// Q.10-4] Complete the code for given main() function.

import java.util.Scanner;

class Number
{
	int x,y;		//default access-specifier
	
	void getData()			//default mem-function
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	void showData()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
	
	Number add(Number T)
	{
		Number Temp;
		Temp = new Number();
		Temp.x = x + T.x;
		Temp.y = y + T.y;
		return Temp;
	}
}

class Que10_4
{
	public static void main(String args[])
	{
		Number T1,T2,T3;
		T1 = new Number();
		T2 = new Number();
		
		T1.getData();
		T2.getData();
		T3 = T1.add(T2);		//perform addition of T1 & T2 in T3.
		T3.showData();
	}
}