// Q. Complete the code. (Composition)

import java.util.Scanner;

class Person
{
	private String name;
	private int age;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Age  : ");
		age = sc.nextInt();
	}
	
	public void showData()
	{
		System.out.println("\nName = " + name);
		System.out.println("Age  = " + age);
	}
}

class Exam
{
	private int sub1,sub2,sub3;
	
	public void getMarks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks of sub1, sub2 & sub3 : ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
	}
	
	public void showMarks()
	{
		System.out.println("Marks of sub1 = " + sub1 + ", sub2 = " + sub2 + " & sub3 = " + sub3);
	}
	
	public float average()
	{
		float avg;
		avg = (sub1 + sub2 + sub3) / (float)3.0;
		return avg;
	}
}

class Student
{
	private Person per;
	private Exam exm;
	
	public Student()
	{
		per = new Person();
		exm = new Exam();
	}
	
	public void scanData()
	{
		per.getData();
		exm.getMarks();
	}
	
	public void printData()
	{
		per.showData();
		exm.showMarks();
	}
	
	public float getAvgMarks()
	{
		return exm.average();
	}
}

class Pro73
{
	public static void main(String args[])
	{
		//scan details for 2 students & print their average marks in main()
		Student S1 = new Student();
		Student S2 = new Student();
		
		System.out.println("\nEnter details of 2 students");
		S1.scanData();
		S2.scanData();
		
		System.out.println("\nPrinting details");
		S1.printData();
		S2.printData();
		
		System.out.println("\nAverage marks of student 1 = " + S1.getAvgMarks());
		System.out.println("Average marks of student 2 = " + S2.getAvgMarks());
	}
}