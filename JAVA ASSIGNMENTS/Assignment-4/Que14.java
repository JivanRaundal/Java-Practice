// Q.14] WAP for following information.

import java.util.Scanner;

class Teacher
{
	private int id;
	private String name;
	private int age;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter ID   : ");
		id = sc.nextInt();
		sc.nextLine();				//to avoid buffer problem
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Age  : ");
		age = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.println("\nID   = " + id);
		System.out.println("Name = " + name);
		System.out.println("Age  = " + age);
	}
	
	static void search(Teacher ref[], int x)					
	{
		int i,flag=0;
		for(i=0; i<ref.length; i++)
		{
			if(ref[i].id == x)
			{
				flag=1;
				System.out.println("\nTeacher found");
				ref[i].printData();
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("\nTeacher Not Found");
		}
	}
}

class Que14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//create an array of 5 Teachers.
		//print data of all teachers.
		//scan id from user. Search teacher by id and print details if found.
	
		Teacher obj[];				//reference to array of references
		obj = new Teacher[5];		//array of references
		int i;
		for(i=0; i<obj.length; i++)
		{
			obj[i] = new Teacher();			//creating object for each reference var in reference array
			System.out.println("\nEnter details for Teacher " + (i+1));
			obj[i].scanData();
		}
		
		System.out.println("\n\nPrinting details of Teachers");
		for(Teacher temp : obj)		//using for each loop
		{
			temp.printData();
		}
	
		int id;
		System.out.print("\n\nEnter ID of Teacher to be searched : ");
		id = sc.nextInt();
		Teacher.search(obj,id);			//passing array of objects to search()
	}
}