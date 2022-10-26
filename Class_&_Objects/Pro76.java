// Swapping two objects :- (Swapping datamembers)

import java.util.Scanner;

class Student
{
	String name;
	int age;
	
	Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Age  : ");
		age = sc.nextInt();
	}
	
	void show()
	{
		System.out.println("\nName = " + name + "\tAge = " + age);
	}
}

class Pro76
{
	public static void main(String args[])
	{
		Student S1 = new Student();
		Student S2 = new Student();
		
		System.out.println("\n\nBefore Swapping");
		S1.show();
		S2.show();
		
		//swapping objects datamembers
		String tempname;
		int tempage;
		
		tempname = S1.name;
		S1.name  = S2.name;
		S2.name  = tempname;
		
		tempage = S1.age;
		S1.age  = S2.age;
		S2.age  = tempage;
		
		System.out.println("\n\nAfter Swapping");
		S1.show();
		S2.show();
	}
}