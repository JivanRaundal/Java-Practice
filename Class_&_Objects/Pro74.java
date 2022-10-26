// Q. Create database of 5 Students & print. Do not add any member function in class. Do all code in main() only.

import java.util.Scanner;

class Student
{
	public String name;
	public int age;
}

class Pro74
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Student st[];				//created reference to array of references
		st = new Student[2];		//created array of references
		int i;
		for(i=0; i<st.length; i++)
		{
			st[i] = new Student();	//creating object for each reference variable in reference array
		}
		
		for(i=0; i<st.length; i++)
		{
			System.out.print("\nEnter details of Student " + (i+1));
			System.out.print("\nEnter Name : ");
			st[i].name = sc.nextLine();
			System.out.print("Enter Age  : ");
			st[i].age = sc.nextInt();
			sc.nextLine();				//to avoid buffer problem
		}
		
		System.out.println("\n\nPrinting Student's details\n");
		for(i=0; i<st.length; i++)
		{
			System.out.println(st[i].name + "\t" + st[i].age);
		}
	}
}