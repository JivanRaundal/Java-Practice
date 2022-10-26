// Q.9] Complete the code for given main() function.

import java.util.Scanner;

class Time
{
	private int hr,min;
	
	//scanning time of each object in constructor
	public Time()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time in hr & min : ");
		hr = sc.nextInt();
		min = sc.nextInt();
		//user may give improper time, to convert it in proper timr
		convert();
	}
	
	public void convert()			//this function will convert time into proper hr & min format
	{
		hr = hr + min/60;
		min = min%60;
	}
	
	public void printTime()
	{
		System.out.println("Time = " + hr + " hr & " + min + " min");
	}
	
	public int totalMin()			//This function will return time into total minitues. to make comparison easy. 
	{
		return 1000*hr + min;		
	}
	
	//findLargestTime() function will find the largest time from array of objects
	public static void findLargestTime(Time obj[])			//static member function of Time class
	{
		int i;
		Time largest = obj[0];			//this reference var will store reference of object which has largest time
		for(i=0; i<obj.length; i++)
		{
			if(largest.totalMin() < obj[i].totalMin())
			{
				largest = obj[i];
			}
		}
		System.out.println("\n\nLargest Time = " + largest.hr + " hr & " + largest.min + " min");
	}
}

class Que9
{
	public static void main(String args[])
	{
		//Q. create an array of 5 objects. Find the largest time.
		
		Time obj[];			//created reference to array of references
		obj = new Time[5];	//created array of references
		
		int i;
		System.out.println("\nEnter time for each object in array of objects\n");
		//creating object for each reference var in reference array 
		for(i=0; i<obj.length; i++)
		{
			obj[i] = new Time();				//time will be scanned in constructor only
		}
		
		System.out.println("\nPrinting Time of each objects");
		for(Time temp : obj)
		{
			temp.printTime();
		}
		
		Time.findLargestTime(obj);
	}
}