// Q.2] Create a database of 6 Employees containing name, age & salary. print all datails of 6 employees.

import java.util.Scanner;

class Employee
{
	private String name;
	private int age;
	private int salary;
	
	public Employee()
	{
		
	}
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name   : ");
		name = sc.nextLine();
		System.out.print("Enter Age    : ");
		age = sc.nextInt();
		System.out.print("Enter Salary : ");
		salary = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.println("\nName   = " + name);
		System.out.println("Age    = " + age);
		System.out.println("Salary = " + salary);
	}
}

class Que2
{
	public static void main(String args[])
	{
		Employee E[] = new Employee[3];		//created array of references
		int i;
		for(i=0; i<E.length; i++)
		{
			E[i] = new Employee();			//creating object for each reference variable in reference array
		}
		
		for(i=0; i<E.length; i++)
		{
			System.out.println("\nEnter details of Employee " + (i+1));
			E[i].scanData();
		}
		
		System.out.println("\n\nPrinting Details of Employees");
		for(Employee temp : E)		//for each loop
		{
			temp.printData();
		}
	}
}