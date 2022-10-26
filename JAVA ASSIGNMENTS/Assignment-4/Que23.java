// Q.23] 

import java.util.Scanner;

class Student
{
	String name;
	int age;
	static int clgcode;				//static member
	
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
		clgcode = 423301;
	}
	
	static void clgInfo()
	{
		//this.name = "Jivan";		//error, this keyword cannot be used in static block.
		System.out.println("\nSmt. Kashibai Navale College of Engninnering - " + clgcode + " Pune");
	}
	
	void show()
	{
		System.out.println("\nName = " + name + "\tAge = " + age);
	}
}

class Que23
{
	public static void main(String args[])
	{
		Student S1,S2;
		S1 = new Student("Jivan",22);
		S2 = new Student("Prasad",23);
		
		Student.clgInfo();
		
		S1.show();
		S2.show();
	}
}