// Scanning values from user in JAVA

// -we have to use Scanner class to scan values from user.
// -Scanner class comes from java.util package, so we have to import Scanner class from java.util package.
// -when we create object of Scanner class at that time we have to mention in Scanner class constructor that from where
//  we have to scan values i.e. from keyboard/console or from file.
// -If we pass System.in as a parameter to Scanner class while creating object of Scanner, it creates the object of Scanner
//  class which will used to scan values from console.
// -'in' is static datamember/variable of System class which tells Scanner object that we have to scan values from console.
// -System class comes from java.lang package which is by default impoeted.

//import java.util.*;				//will import all the classes from java.util package
import java.util.Scanner;		    //will import only specific class

class Pro4
{
	public static void main(String args[])
	{
		System.out.println("\nScanning values from user\n");
		
		String name;
		int age;
		char gender;
		long mob_no;
		double cgpa;
		
		Scanner sc;			//not an object, it is just the reference variable of Scanner class
		//objects in JAVA are created at runtime using new keyword.
		sc = new Scanner(System.in);		//System.in  => to scan values from console
		
		System.out.println("Enter your name : ");
		//name = sc.next();				//will scan only single word ['\n', tab, space are terminating characters]
		name = sc.nextLine();			//will scan space seperated String upto '\n'
		
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		
		System.out.println("Enter your gender (m/f) : ");
		gender = sc.next().charAt(0);
		
		System.out.println("Enter your mob no. : ");
		mob_no = sc.nextLong();
		
		System.out.println("Enter your cgpa : ");
		cgpa = sc.nextDouble();
		
		System.out.println("\n------------------Information------------------");
		System.out.println("Name   = " + name);
		System.out.println("Age    = " + age);
		System.out.println("Gender = " + gender);
		System.out.println("Mob no = " + mob_no);
		System.out.println("CGPA   = " + cgpa);
		System.out.println("\n-----------------------------------------------");
		
		System.out.println();
	}
}