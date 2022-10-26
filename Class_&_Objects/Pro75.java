// Swapping two objects :- (Swapping references)

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

class Pro75
{
	public static void main(String args[])
	{
		Student S1 = new Student();
		Student S2 = new Student();
		
		System.out.println("\n\nBefore Swapping");
		S1.show();
		S2.show();
		
		//swapping objects (references)
		Student temp;
		temp = S1;
		S1   = S2;
		S2   = temp;
		
		System.out.println("\n\nAfter Swapping");
		S1.show();
		S2.show();
	}
}