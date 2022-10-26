// Q.18] Complete the following code. Do not change main() function.

import java.util.Scanner;

class Student
{
	String name;
	int age;
}

class Data
{
	static void print(Student temp)
	{
		System.out.println("\nName = " + temp.name);
		System.out.println("Age  = " + temp.age);
	}
}

class Que18
{
	public static void main(String args[])
	{
		Student S1,S2;
		S1 = getStudent();
		S2 = getStudent();
		Data.print(S1);
		Data.print(S2);
	}
	
	static Student getStudent()
	{
		Scanner sc = new Scanner(System.in);
		Student temp = new Student();
		System.out.print("\nEnter Name : ");
		temp.name = sc.nextLine();
		System.out.print("Enter Age  : ");
		temp.age = sc.nextInt();
		return temp;
	}
}