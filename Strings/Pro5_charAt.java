// Q. create a database of 5 students containing name & age. Print all those students whose name starts with 'A' or 'a'. Also print students whose
//    name ends with 'i'.

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

class Pro5_charAt
{
	public static void main(String args[])
	{
		Student std[];				//created reference to array of references
		std = new Student[5];		//created array of references
		
		int i;
		for(i=0; i<std.length; i++)
		{
			std[i] = new Student();		//creating object for each reference var in reference array
		}
		
		System.out.println("\n\nPrinting Students whose name starts with 'A' or 'a'");
		for(i=0; i<std.length; i++)
		{
			if(std[i].name.charAt(0) == 'A' || std[i].name.charAt(0) == 'a')
			{
				std[i].show();
			}
		}
		
		System.out.println("\n\nPrinting students whose name ends with 'i'");
		int len;
		for(Student temp : std)			//for each loop
		{
			len = temp.name.length();
			if(temp.name.charAt(len-1) == 'i')
			{
				temp.show();
			}
		}
	}
}