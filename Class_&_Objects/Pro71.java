// Q.2] 

import java.util.Scanner;

class Person
{
	public String name;
	public int age;
}

class Exam
{
	public int s1,s2,s3;
}

class Student
{
	public Person per;			//composition
	public Exam ex;				//composition
	
	public Student()
	{
		per = new Person();
		ex = new Exam();
	}
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter name : ");
		per.name = sc.nextLine();
		System.out.print("Enter age  : ");
		per.age = sc.nextInt();
		System.out.print("Enter marks of 3 subjects : ");
		ex.s1 = sc.nextInt();
		ex.s2 = sc.nextInt();
		ex.s3 = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.println("\nName = " + per.name);
		System.out.println("Age = " + per.age);
		System.out.println("Marks of 3 subjects = " + ex.s1 + " " + ex.s2 + " " + ex.s3);
	}
	
	public float average()
	{
		float avg;
		avg = (ex.s1 + ex.s2 + ex.s3)/(float)3.0;
		//System.out.println("\n\nAverage marks = " + avg);
		return avg;
	}
}

class Pro71
{
	public static void main(String args[])
	{
		Student S1,S2;
		S1 = new Student();
		S2 = new Student();
		
		System.out.println("\nEnter details of 2 students");
		S1.getData();
		S2.getData();
		
		System.out.println("\nPrinting details");
		S1.printData();
		S2.printData();
		
		System.out.println("\nAverage marks of 1st student = " + S1.average());
		System.out.println("\nAverage marks of 2nd student = " + S2.average());
	}
}