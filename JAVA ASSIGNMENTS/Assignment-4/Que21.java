// Q.21] 

import java.util.*;

class Student
{
	private String name;
	private int age;
	private int roll;
	
	Student()
	{
		name = " ";
		age = 0;
		roll = 0;
	}
	
	void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name = sc.nextLine();
		name = name.toUpperCase();				//converting name into uppercase
		System.out.print("Enter Age  : ");
		age = sc.nextInt();
		System.out.print("Enter Roll : ");
		roll = sc.nextInt();
	}
	
	void printData()
	{
		System.out.println("\nName   = " + name);
		System.out.println("Age    = " + age);
		System.out.println("Roll   = " + roll);
	}
	
	static void sortByNameAscending(Student st[])
	{
		int i,j;
		Student temp;
		for(i=0; i<st.length; i++)
		{
			for(j=i+1; j<st.length; j++)
			{
				if(st[i].name.compareTo(st[j].name) > 0)			//ascending order of name
				{
					temp  = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
	}
	
	static void sortByNameDescending(Student st[])
	{
		int i,j;
		Student temp;
		for(i=0; i<st.length; i++)
		{
			for(j=i+1; j<st.length; j++)
			{
				if(st[i].name.compareTo(st[j].name) < 0)			//descending order of name
				{
					temp  = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
	}
	
	static void sortByAgeAscending(Student st[])
	{
		int i,j;
		Student temp;
		for(i=0; i<st.length; i++)
		{
			for(j=i+1; j<st.length; j++)
			{
				if(st[i].age > st[j].age)			//ascending order of age
				{
					temp  = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}	
	}

	static void sortByAgeDescending(Student st[])
	{
		int i,j;
		Student temp;
		for(i=0; i<st.length; i++)
		{
			for(j=i+1; j<st.length; j++)
			{
				if(st[i].age < st[j].age)			//descending order of age
				{
					temp  = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}	
	}
	
	static void deleteByName(Student st[], String name)
	{
		name = name.toUpperCase();			//convert name into uppercase for comparison
		int i,j,flag=0;
		for(i=0; i<st.length; i++)
		{
			if(name.equals(st[i].name))
			{
				flag = 1;
				//left shift references
				for(j=i; j<st.length-1; j++)
				{
					st[j] = st[j+1];
				}
				st[j] = null;			// make last reference null
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("\nNo such student with given name.");
		}
	}
}

class Que21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Student st[] = new Student[3];
		
		int i,ch,x;
		
		System.out.println("\nEnter details of students");
		for(i=0; i<st.length; i++)
		{
			st[i] = new Student();
			st[i].scanData();
		}
		
		do
		{
			System.out.println("\n-------------------------------------");
			System.out.println("1. print student's list.");
			System.out.println("2. sort by name.");
			System.out.println("3. sort by age.");
			System.out.println("4. delete student by name.");
			System.out.println("5. exit.");
			System.out.println("--------------------------------------");
			System.out.print("\nEnter your choice : ");
			ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch)
			{
				case 1:
					//printing students list
					System.out.println("\nStuden's List");
					for(Student temp : st)
					{
						if(temp != null)
							temp.printData();
					}
					break;
					
				case 2:
					System.out.println("1. sort in ascending order.");
					System.out.println("2. sort in descending order.");
					System.out.print("\nWhich sort ? ");
					x = sc.nextInt();
					if(x == 1)
						Student.sortByNameAscending(st);
					else
						Student.sortByNameDescending(st);
					break;
				
				case 3:
					System.out.println("1. sort in ascending order.");
					System.out.println("2. sort in descending order.");
					System.out.print("\nWhich sort ? ");
					x = sc.nextInt();
					if(x == 1)
						Student.sortByAgeAscending(st);
					else
						Student.sortByAgeDescending(st);
					break;
					
				case 4:
					String name;
					System.out.print("\nEnter name of student you want to delete : ");
					name = sc.nextLine();
					Student.deleteByName(st,name);
					break;
					
				case 5:
					break;
				
				default:
					System.out.println("Invalid Choice....");
			}
		}while(ch != 5);
	
	}
}