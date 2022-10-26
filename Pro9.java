// Q. Scan details of employee in given sequence. age, name, salary, gender

import java.util.Scanner;

class Pro9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		float sal;
		char gender;
		
		System.out.println("\nEnter following details of employee\n");
		
		System.out.println("\nEnter Age  : ");
		age = sc.nextInt();
		
		System.out.println("\nEnter Name : ");
		sc.nextLine();			//will remove '\n' from buffer
		name = sc.nextLine();	//will scan string
		
		System.out.println("\nEnter Salary : ");
		sal = sc.nextFloat();
		
		System.out.println("\nEnter Gender : ");
		gender = sc.next().charAt(0);
		
		System.out.println("\n\n----------------Employee Details----------------\n");
		System.out.println("Name   = " + name);
		System.out.println("Age    = " + age);
		System.out.println("Gender = " + gender);
		System.out.println("Salary = " + sal);
		System.out.println("\n------------------------------------------------\n");
	}
}