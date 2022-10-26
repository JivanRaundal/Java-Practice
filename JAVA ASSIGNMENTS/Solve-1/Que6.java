// Q.6] Create a database of 6 Employees containing name, id & salary. WAP to sort these Employees by salary in ascending order.

import java.util.Scanner;

class Employee
{
	public int id;
	public String name;
	public int salary;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter ID     : ");
		id = sc.nextInt();
		sc.nextLine();			//to avoid buffer problem
		System.out.print("Enter Name   : ");
		name = sc.nextLine();
		System.out.print("Enter Salary : ");
		salary = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.println("\nID     = " + id);
		System.out.println("Name   = " + name);
		System.out.println("Salary = " + salary);
	}
}

class Que6
{
	public static void main(String args[])
	{
		Employee E[] = new Employee[4];
		int i;
		for(i=0; i<E.length; i++)
		{
			E[i] = new Employee();
			System.out.println("\nEnter details of Employee " + (i+1));
			E[i].scanData();
		}
		
		System.out.println("\n\nPrinting details of Employees before sorting");
		for(Employee temp : E)
		{
			temp.printData();
		}
		
		sortEmployees(E);			//will sort Employees according to salary in ascending order
		
		System.out.println("\n\nPrinting details of Employees after sorting");
		for(i=0; i<E.length; i++)
		{
			E[i].printData();
		}
	}
	
	public static void sortEmployees(Employee emp[])
	{
		int i,j;
		Employee temp;
		for(i=0; i<emp.length; i++)
		{
			for(j=i+1; j<emp.length; j++)
			{
				if(emp[i].salary > emp[j].salary)
				{
					temp   = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
	}
}