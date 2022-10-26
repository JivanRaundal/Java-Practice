// Q.7] Create a database of 6 Students containing name and age. Print all those students whose name starts with A or a and ends with a or i.

import java.util.Scanner;

class Student
{
	private String name;
	private int age;
	
	void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name  : ");
		name = sc.nextLine();
		System.out.print("Enter Age   : ");
		age = sc.nextInt();
	}
	
	void printData()
	{
		System.out.println("\nName = " + name + "\tAge = " + age);
	}
	
	static Student[] getArray()
	{
		Student S[];			//reference to array of references
		S = new Student[4];	//created array of references
		for(int i=0; i<S.length; i++)
		{
			S[i] = new Student();		//creating object for each reference variable in array of references
			System.out.println("\nEnter details of Student " + (i+1));
			S[i].scanData();
		}
		return S;		//returning array of objects
	}
	
	static void print(Student S[])
	{
		System.out.println("\n\nStundents whose name starts with 'A' or 'a' & ends with 'a' or 'i' : ");
		for(int i=0; i<S.length; i++)
		{
			if( (S[i].name.charAt(0)=='A' || S[i].name.charAt(0)=='a') && 
			    (S[i].name.charAt(S[i].name.length()-1)=='a' || S[i].name.charAt(S[i].name.length()-1)=='i') )
			{
				S[i].printData();
			}
		}
	}
}

class Que7
{
	public static void main(String args[])
	{
		Student st[];				//created reference to array of references
		st = Student.getArray();	//this function will create & returns array of reference / array of objects
		
		Student.print(st);			//this function will print details of students whose name starts with 'A' or 'a' & ends with 'a' or 'i'.
	}
}