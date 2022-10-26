// Q.17] Complete the following code.

import java.util.Scanner;

class Employee
{
	public int id;
	public String name;
	public int salary;
}

class Que17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		/*create an array of 6 employees.
		  scan an id from user. search employees for given id.
		  If found, delete that employee.(i.e. make it's refernce null)
		  Then shift all the remaining objects(means refernces in array) one position towards left.
		  make your code modular. But no any function should be member function of class Employee. */
		
		Employee emp[];				//refernce to array of refernces
		emp = getArrayOfObjects();
		
		printData(emp);
		
		int id;
		System.out.print("\n\nEnter ID of employee to be removed : ");
		id = sc.nextInt();
		//search that employee in array of objects & make it's refernce null
		deleteEmployee(emp,id);
		
		printData(emp);
	}
	
	static Employee[] getArrayOfObjects()
	{
		Employee obj[];				//refernce to array of refernces
		obj = new Employee[4];		//array of refernces
		
		for(int i=0; i<obj.length; i++)
		{
			obj[i] = new Employee();		//creating object for each refernce var in refernce array
			System.out.println("\nEnter details of employee " + (i+1));
			scanData(obj[i]);
		}
		return obj;						//returning array of objects
	}
	
	static void printData(Employee emp[])
	{
		System.out.println("\nEmployees List");
		for(Employee temp : emp)			//for each loop
		{
			if(temp != null)
			{
				System.out.println("\nID     = " + temp.id);
				System.out.println("Name   = " + temp.name);
				System.out.println("Salary = " + temp.salary);
			}
		}
	}
	
	static void scanData(Employee temp)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter ID     : ");
		temp.id = sc.nextInt();
		sc.nextLine();					//to avoid buffer problem
		System.out.print("Enter Name   : ");
		temp.name = sc.nextLine();
		System.out.print("Enter Salary : ");
		temp.salary = sc.nextInt();
	}
	
	static int search(Employee emp[], int id)
	{
		int i,flag=0;
		for(i=0; i<emp.length; i++)
		{
			if(emp[i].id == id)
			{
				System.out.println("\nEmployee Found");
				return i;
			}
		}
		System.out.println("\nEmployee Not Found");
		return -1;
	}
	
	static void deleteEmployee(Employee emp[],int id)
	{
		int ind,i;
		ind = search(emp,id);
		if(ind != -1)		//means employee is found, then delete that employee
		{
			for(i=ind; i<(emp.length-1); i++)
			{
				emp[i] = emp[i+1];
			}
			emp[i] = null;		//after shifting make last refernce null
			System.out.println("\nEmployee Removed");
		}
	}
}