// Q.1] Scan a year from user, check if it is leap year or not.
// -given year is leap year if it is multiple of 100 & multiple of 400.
// -given year is leap year if it is not multiple of 100 but multiple of 4.
// -Otherwise it is not a leap year.

import java.util.Scanner;

class Que1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.println("\nEnter year : ");
		year = sc.nextInt();
		
		if(year%100 == 0 && year%400 ==0)			//yr is multiple of 100 & multiple of 400
		{
			System.out.println(year + " is a Leap year");
		}
		else if(year%100 != 0 && year%4 == 0)		//yr is not multiple of 100 but multiple of 4
		{
			System.out.println(year + " is a Leap year");
		}
		else										//otherwise not a leap year
		{
			System.out.println(year + " is not a Leap year");
		}
	}
}