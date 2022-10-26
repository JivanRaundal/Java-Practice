/* # Nestes Classes :- 

Composition :- Creating object of one class as a datamember of another class is known as Composition. (Has-A relationship)

Note :- In case of Nested classes, If you have to reach to Inner class, you have to go through Outer class.
*/

//eg- composition

import java.util.Scanner;

class Person
{
	public String name;
	public int age;
}

class Student
{
	public Person per;			//composition (not an object, just reference var)
	public int roll;
	
	public Student()
	{
		per = new Person();		//creating object of Person in constructor
	}
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		per.name = sc.nextLine();
		System.out.print("Enter Age  : ");
		per.age = sc.nextInt();
		System.out.print("Enter Roll : ");
		roll = sc.nextInt();
	}
}

class Pro65
{
	public static void main(String args[])
	{
		Student st = new Student();
		
		st.getData();
		
		System.out.println("\nPrinting details : ");
		System.out.println("Name = " + st.per.name);
		System.out.println("Age  = " + st.per.age);
		System.out.println("Roll = " + st.roll);
	}
}