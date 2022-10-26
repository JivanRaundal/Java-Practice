// Q. WAP for given main() function

import java.util.Scanner;

class Number
{
	int x;
	int y;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
	
	public Number add(Number T)
	{
		Number Temp;
		Temp = new Number();
		
		Temp.x = x + T.x;
		Temp.y = y + T.y;
		return Temp;
	}
}

class Pro13
{
	public static void main(String args[])
	{
		Number ref,var,Ans;
		ref = new Number();
		var = new Number();
		
		ref.getData();
		var.getData();
		
		Ans = ref.add(var);
		Ans.printData();
	}
}