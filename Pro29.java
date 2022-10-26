//  Scan salary from user. keep scanning if salary<5000

import java.util.*;

class Pro29
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int sal;
		System.out.println("\nEnter salary : ");
		
		while(true)
		{
			sal = sc.nextInt();
			if(sal < 5000)
			{
				System.out.println("Enter correct salary : ");
			}
			else
			{
				break;
			}
		}
		
		System.out.println("\nSalary = " + sal);
	}	
}