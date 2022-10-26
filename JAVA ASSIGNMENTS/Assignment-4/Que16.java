// Q.16] Complete the following code.

import java.util.Scanner;

class Employee
{
	public int id;
	public String name;
	public int salary;
	
	void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter ID     : ");
		id = sc.nextInt();
		sc.nextLine();					//to avoid buffer problem
		System.out.print("Enter Name   : ");
		name = sc.nextLine();
		System.out.print("Enter Salary : ");
		salary = sc.nextInt();
	}
	
	void printData()
	{
		System.out.println("\nID     = " + id);
		System.out.println("Name   = " + name);
		System.out.println("Salary = " + salary);
	}
}

class Que16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//create an array of 6 employees.
		//scan an id from user. search employees for given id.
		//If found, delete that employee.(i.e. make it's refernce null)
		//Then shift all the remaining objects(means refernces in array) one position towards left.
		
		Employee emp[];				//refernce to array of refernces
		emp = new Employee[4];		//array of refernces
		
		int i,j;
		for(i=0; i<emp.length; i++)
		{
			emp[i] = new Employee();		//creating object for each refernce var in refernce array
			System.out.println("\nEnter details of employee " + (i+1));
			emp[i].scanData();
		}
		
		System.out.println("\n\nPrinting details of employees");
		for(Employee temp : emp)	//for each loop
		{
			temp.printData();
		}
		
		int id,flag=0;
		System.out.print("\n\nEnter ID of employee to be removed : ");
		id = sc.nextInt();
		
		//search that employee in array of objects & make it's refernce null
		for(i=0; i<emp.length; i++)
		{
			if(emp[i].id == id)
			{
				flag = 1;
				for(j=i; j<(emp.length-1); j++)
				{
					emp[j] = emp[j+1];
				}
				emp[j] = null;			//after shifting make last refernce null
				System.out.println("\nEmployee Found & Removed");
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("\nEmployee Not Found");
		}
		
		System.out.println("\nRemaining Employees are");
		for(Employee temp : emp)
		{
			if(temp != null)
			{
				temp.printData();
			}
		}
	}
}