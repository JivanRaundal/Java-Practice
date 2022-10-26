// Composition :- declaring object of one class as a datamember of another class is known as Composition.
// Note :- Composition => 'Has-a' relationship. eg- Student is a Person
// eg- Student has-a name, Student has-a age


import java.util.Scanner;

class Person
{
	public String name;
	public int age;
	
	public void print()
	{
		System.out.println("\nName  = " + name);
		System.out.println("Age   = " + age);
	}
}

class Student
{
	Person per;	 //not an object, it is just reference variable (Composition) 
	//Person per = new Person(); 			//is also valid
	int marks;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		per = new Person();				//creating object here
		
		System.out.print("\nEnter name  : ");
		per.name = sc.nextLine();
		System.out.print("Enter Age   : ");
		per.age = sc.nextInt();
		System.out.print("Enter marks : ");
		marks = sc.nextInt();
	}
	
	public void showData()
	{
		per.print();			//calling mem-function of class Person
		System.out.println("Marks = " + marks);
	}
}

class Pro17
{
	public static void main(String args[])
	{
		Student S;
		S = new Student();
		System.out.println("\nEnter Student's details");
		S.getData();
		System.out.println("\nStudnt's details");
		S.showData();
	}
}