// Q.3] Scan age,name and salary of 2 employees in main(). Print.

import java.util.Scanner;

class Que3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name;
		short age;
		float salary;
		
		for(int i=1; i<=2; i++)
		{
			System.out.println("\nEnter details of Employee " + i);
		
			System.out.print("\nEnter Name   : ");
			name = sc.nextLine();
			System.out.print("\nEnter age    : ");
			age = sc.nextShort();
			System.out.print("\nEnter Salary : ");
			salary = sc.nextFloat();
			
			System.out.println("\nDetails of Employee " + i);
			System.out.print("\nName   = " + name);
			System.out.print("\nAge    = " + age);
			System.out.print("\nSalary = " + salary);
			
			sc.nextLine();			//to avoid problem due to input buffer
			System.out.println();
		}
	}
}