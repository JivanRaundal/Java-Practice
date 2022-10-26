// Q.10] 

import java.util.Scanner;

class Person
{
	class Birthdate
	{
		int day;
		int month;
		int year;
		
		void scanDate()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Birthdate (dd/mm/yy) : ");
			day = sc.nextInt();
			month = sc.nextInt();
			year = sc.nextInt();
			sc.nextLine();			//buffer problem
		}
	}
	
	String name;
	Birthdate bday = new Birthdate();			//composition
	String addr;
	
	Person()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name = sc.nextLine();
		name = name.toUpperCase();
		bday.scanDate();
		System.out.print("Enter Address : ");
		addr = sc.nextLine();
		addr = addr.toLowerCase();
	}
	
	void show()
	{
		System.out.println("\nName = " + name);
		System.out.println("Birthdate = " + bday.day + "/" + bday.month + "/" + bday.year);
		System.out.println("Address = " + addr);
	}
}

class Employee extends Person
{
	int id;
	int salary;
	
	Employee()			//when an object of Employee is created first constructor of Person will be called & then of Employee
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id :");
		id = sc.nextInt();
		System.out.print("Enter salary : ");
		salary = sc.nextInt();
	}
	
	void printEmp()
	{
		show();
		System.out.println("Employee id = " + id);
		System.out.println("Salary = " + salary);
	}
}

class Student extends Person
{
	int roll;
	float height;
	
	Student()		//when an object of Student is created first constructor of Person will be called & then of Student
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll no : ");
		roll = sc.nextInt();
		System.out.print("Enter height (in inch) : ");
		height = sc.nextFloat();
	}
	
	void printSt()
	{
		show();
		System.out.println("Roll no = " + roll);
		System.out.println("Height = " + height + " inches");
	}
}

class Que10
{
	public static void main(String args[])
	{
		Student S1,S2,S3;
		Employee E1,E2;
		
		System.out.println("\nEnter data for 3 Students : ");
		S1 = new Student();
		S2 = new Student();
		S3 = new Student();
		S1.printSt();
		S2.printSt();
		S3.printSt();
		
		System.out.println("\nEnter data for 2 Employees : ");
		E1 = new Employee();
		E2 = new Employee();
		E1.printEmp();
		E2.printEmp();
	}
}