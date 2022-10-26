// Q.12] Complete the following code.

import java.util.Scanner;

class Date
{
	private int day;
	private int month;
	private int year;
	
	public void getDate()
	{
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
	}
	
	public void putDate()
	{
		System.out.print(day + "/" + month + "/" + year);
	}
}

class Student
{
	private String name;
	private int age;
	private Date birthdate; 
	
	public Student()
	{
		birthdate = new Date();			//composition
	}
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Age  : ");
		age = sc.nextInt();
		System.out.print("Enter Birthdate in (dd/mm/yy) format : ");
		birthdate.getDate();
	}
	
	public void printData()
	{
		System.out.print("\n\nName 		= " + name);
		System.out.print("\nAge  		= " + age);
		System.out.print("\nBirthdate   	= ");
		birthdate.putDate();
	}
}

class Que12
{
	public static void main(String args[])
	{
		//Q. Scan details of 3 students and print them. Add necessary member functions.
		Student obj[] = new Student[3];		//array of objects
		int i;
		for(i=0; i<obj.length; i++)
		{
			obj[i] = new Student();
			System.out.println("\nEnter details of student " + (i+1));
			obj[i].scanData();
		}
		System.out.println("\n\nPrinting details of students");
		for(Student temp : obj)
		{
			temp.printData();
		}
	}
}