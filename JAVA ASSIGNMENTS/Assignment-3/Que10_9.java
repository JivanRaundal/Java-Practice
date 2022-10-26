// Q.10-9] Ask 2 students total time they took to go from pune to mumbai. check who has taken max time .

import java.util.Scanner;

class Time
{
	private int hr,min;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("\nEnter time in hr & min: ");
		hr = sc.nextInt();
		min = sc.nextInt();
	}
	
	public void convert()			//to convert time in proper format
	{
		hr = hr + min/60;
		min = min%60;
	}
	
	public void maxTime(Time T)
	{
		//convert time into total minutes
		int t1 = hr * 60 + min;
		int t2 = T.hr * 60 + T.min;
		
		if(t1 > t2)
		{
			System.out.println("\nStudent 1 takes maximum time");
		}
		else
		{
			System.out.println("\nStudent 2 takes maximum time");
		}
	}
}

class Que10_9
{
	public static void main(String args[])
	{
		Time T1,T2;
		T1 = new Time();
		T2 = new Time();
		
		System.out.println("\nEnter time taken by 1st student in hr & min: ");
		T1.getData();
		System.out.println("\nEnter time taken by 2nd student in hr & min: ");
		T2.getData();
		T1.convert();
		T2.convert();
		T1.maxTime(T2);	
	}
}