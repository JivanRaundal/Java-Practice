// Q 20.6] Create a database of 6 Employees containing name, designation and salary. WAP to
//		   -search an employee by name. 
//         -search employees by designation.
//		   -scan a specific amount from user and print all these employees whose salary is greater than given amount.

import java.util.Scanner;

class Employee
{
	private String name;
	private String designation;
	private int salary;
	
	public Employee()
	{
		name = " ";
		designation = " ";
		salary = 0;
	}
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name        : ");
		name = sc.nextLine();
		name = name.toUpperCase();					//converting name into uppercase to maintain proper format
		System.out.print("Enter Designation : ");
		designation = sc.nextLine();
		designation = designation.toLowerCase();	//containing designation into lowercase 
		System.out.print("Enter Salary      : ");
		salary = sc.nextInt();
	}
	
	void printData()
	{
		System.out.println("\nName        = " + name);
		System.out.println("Designation = " + designation);
		System.out.println("Salary      = " + salary);
	}
	
	public static void searchByName(Employee emp[],String name)
	{
		name = name.toUpperCase();			//converting name into uppercase bcz, our database has name in uppercase
		int i,flag=0;
		for(i=0; i<emp.length; i++)
		{
			if(name.equalsIgnoreCase(emp[i].name))			//i.e. if name == emp[i].name
			{
				flag = 1;
				System.out.println("\nEmpolyee Found");
				emp[i].printData();
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("\nEmployee Not Found");
		}
	}

	public static void searchByDesignation(Employee emp[],String designation)
	{
		designation = designation.toLowerCase();	//converting designation into lowercase bcz, our database has designation in lowercase
		int i,flag=0;
		for(i=0; i<emp.length; i++)
		{
			if(designation.equalsIgnoreCase(emp[i].designation))			//i.e. if designation == emp[i].designation
			{
				flag = 1;
				System.out.println("\nEmpolyee Found");
				emp[i].printData();
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("\nEmployee Not Found");
		}
	}
	
	public static void salaryAbove(Employee emp[],int salary)
	{
		System.out.println("\nPrinting employees having salary above " + salary + " Rs");
		int i;
		for(i=0; i<emp.length; i++)
		{
			if(emp[i].salary >= salary)
			{
				emp[i].printData();
			}
		}
	}
}

class Que20_6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Employee emp[] = new Employee[3];
		
		int i;
		System.out.println("\nEnter details of Employees");
		for(i=0; i<emp.length; i++)
		{
			emp[i] = new Employee();
			emp[i].scanData();
		}
		
		/*
		System.out.println("\n\nEmployees List");
		for(Employee temp : emp)
		{
			temp.printData();
		}
		
		//search employee by name
		String name;
		System.out.print("\nEnter name of employee to be searched : ");
		name = sc.nextLine();
		Employee.searchByName(emp,name);
		
		//search employee by designation
		String designation;
		System.out.print("\nEnter designation of employee to be searched : ");
		designation = sc.nextLine();
		Employee.searchByDesignation(emp,designation);
		
		//print all employees having salary above
		int salary;
		System.out.print("\nEnter salary amount to search employees : ");
		salary = sc.nextInt();
		Employee.salaryAbove(emp,salary);
		*/
		
		int ch;
		do
		{
			System.out.println("\n------------------------------------------");
			System.out.println("1. print employee list.");
			System.out.println("2. search employee by name");
			System.out.println("3. search employee by designation");
			System.out.println("4. print employees having salary above");
			System.out.println("5. exit");
			System.out.println("------------------------------------------");
			System.out.print("\nEnter your choice : ");
			ch = sc.nextInt();
			sc.nextLine();					//to avoid buffer problem
			
			switch(ch)
			{
				case 1:
					System.out.println("\n\nEmployees List");
					for(Employee temp : emp)
					{
						temp.printData();
					}
					break;
					
				case 2:
					String name;
					System.out.print("\nEnter name of employee to be searched : ");
					name = sc.nextLine();
					Employee.searchByName(emp,name);
					break;
					
				case 3:
					String designation;
					System.out.print("\nEnter designation of employee to be searched : ");
					designation = sc.nextLine();
					Employee.searchByDesignation(emp,designation);
					break;
					
				case 4:
					int salary;
					System.out.print("\nEnter salary amount to search employees : ");
					salary = sc.nextInt();
					Employee.salaryAbove(emp,salary);
					break;
					
				case 5:
					break;
					
				default:
					System.out.println("\nInvalid choice...");
			}
		}while(ch != 5);
	}
}