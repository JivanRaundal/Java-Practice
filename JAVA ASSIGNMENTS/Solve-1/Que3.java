// Q.3] Create a database of 5 students containing name,age and marks. print details of all those students whose name starts with S.

import java.util.Scanner;

class Student
{
	private String name;
	private int age;
	private int marks;
	
	void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name  : ");
		name = sc.nextLine();
		System.out.print("Enter Age   : ");
		age = sc.nextInt();
		System.out.print("Enter Marks : ");
		marks = sc.nextInt();
	}
	
	void printData()
	{
		System.out.println("\nName   = " + name);
		System.out.println("Age    = " + age);
		System.out.println("Marks  = " + marks);
	}
	
	static Student[] getArray()
	{
		Student S[];			//reference to array of references
		S = new Student[4];	//created array of references
		for(int i=0; i<S.length; i++)
		{
			S[i] = new Student();		//creating object for each reference variable in array of references
			System.out.println("\nEnter details of Student " + (i+1));
			S[i].scanData();
		}
		return S;		//returning array of objects
	}
	
	static void print(Student S[])
	{
		System.out.println("\n\nStundents whose name starts with 'S' are : ");
		for(int i=0; i<S.length; i++)
		{
			if(S[i].name.charAt(0) == 'S' || S[i].name.charAt(0) == 's')
			{
				S[i].printData();
			}
		}
	}
}

class Que3
{
	public static void main(String args[])
	{
		Student st[];				//created reference to array of references
		st = Student.getArray();	//this function will create & returns array of reference / array of objects
		
		Student.print(st);			//this function will print details of students whose name starts with 'S'.
	}
}