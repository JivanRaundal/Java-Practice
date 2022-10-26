// Q. WAP for given main() function.

import java.util.Scanner;

class Number
{
	public int x;
	public int y;
	
	private void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public void help_getData()
	{
		getData();		//calling one member function from another
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

class Pro22
{
	public static void main(String args[])
	{
		Number obj,var,Ans;
		obj = new Number();
		var = new Number();
		
		obj.help_getData();
		var.help_getData();
		
		Ans = obj.add(var);
		Ans.printData();
	}
}

