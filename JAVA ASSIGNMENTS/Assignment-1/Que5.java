// Q.5] Scan Name, age & salary of an employee. If employee enters age less than 18, ask him to re-enter correct age. keep asking until
//      he/she enters correct age. If he enters negative salary, keep asking him to enter correct salary. print the data.

import java.util.Scanner;

class Que5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		short age;
		int sal;
		
		System.out.println("\nEnter Name : ");
		name = sc.nextLine();
		
		System.out.println("Enter Age : ");
		do
		{
			age = sc.nextShort();
			if(age < 18)
			{
				System.out.println("please enter valid age i.e. above 18");
			}
		}while(age < 18);
		
		System.out.println("Enter Salary : ");
		do
		{
			sal = sc.nextInt();
			if(sal < 0)
			{
				System.out.println("please enter valid salary");
			}
		}while(sal < 0);
		
		System.out.println("\n----------EMPLOYEE DETAILS----------");
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Salary : " + sal);
		System.out.println("------------------------------------\n");
	}
}