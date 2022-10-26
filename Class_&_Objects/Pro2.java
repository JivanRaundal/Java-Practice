// Q. Create 2 objects of student, scan data & print it.

import java.util.Scanner;

class Student 
{
	public String name;
	public int age;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter name : ");
		name = sc.nextLine();
		System.out.print("\nEnter age  : ");
		age = sc.nextInt();
		
	}
	
	public void putData()
	{
		System.out.println("Name = " + name + "\tAge = " + age);
	}
}

class Pro2
{
	public  static void main(String args[])
	{
		Student S1,S2;
		S1 = new Student();
		S2 = new Student();
		
		System.out.println("\nEnter details of students : ");
		S1.getData();
		S2.getData();
		
		System.out.println("\nPrinting details of students :\n");
		S1.putData();
		S2.putData();
	}
}