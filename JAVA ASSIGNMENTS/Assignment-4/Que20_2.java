// Q 20.2] WAP to check working of toString() and valueOf() method.

import java.util.Scanner;

class Student
{
	String name;
	int age;
	
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()		//overriding toString() method
	{
		return "\nStudent class object. Name = " + name + "  Age = " + age;
	}
}

class Que20_2
{
	public static void main(String args[])
	{
		String str1,str2;
		
		//str = 10;			//error, int cannot be converted to String directly.
		str1 = String.valueOf(10);
		System.out.println("\nstr1 = " + str1);
		str2 = String.valueOf(4.5);
		System.out.println("str2 = " + str2);
		System.out.println("str1 + str2 = " + str1 + str2);
		
		Student st = new Student("Jivan",21);
		System.out.println(st);
	}
}
