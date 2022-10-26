

import program.*;					//will import all the classes of program package
import program.subpackage.*;		//will import all the classes of subpackage package

class Program
{
	public static void main(String args[])
	{
		Addition       A = new Addition();
		Substraction   B = new Substraction();
		Multiplication M = new Multiplication();
		Division       D = new Division();
		
		A.addition(10,20);
		B.substraction(40,20);
		M.multiplication(3,4);
		D.division(64,2);
	}
}