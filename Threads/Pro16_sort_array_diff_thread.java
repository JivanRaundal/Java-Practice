/*# Sorting 2 arrays using 2 different threads thread :-

NOTE: -Instant class & Duration class are inbuilt classes in java.
      -Instant class's static method "now()" returns the object of class Instant. i.e. current system time.
	  -Duration class's static method "between()" returns the object of class Duration. i.e. duration between given start and end system time.
	  -Duration class's non-static methods "getNano()" & "getSeconds()" are used to get time in 'nanoseconds' & 'seconds' respectively. 
	  
NOTE: In following code, 2 different threads are used to sort 2 arrays. Hence time required will be almost half than previous code.

NOTE: Each Thread has seperate Stack for memory management.
*/

import java.time.Instant;
import java.time.Duration;
//import java.time.*;

class Sorting implements Runnable			//Runnable is interface [Runnable(interface) => Thread(class) => Myclass]
{
	public int num[];
	
	public Sorting()
	{
		int n = 100000;
		num = new int[n];
		
		for(int i=0; i<n; i++)
		{
			num[i] = n-i;
		}
	}
	
	public void print()
	{
		System.out.println("\nArray : ");
		for(int x : num)
		{
			System.out.print(" " + x);
		}
	}
	
	public void run()				//overriden abstract run() method of Runnable interface, child thread will execute in run() method. 
	{
		int i,j,temp;
		for(i=0; i<num.length; i++)
		{
			for(j=i+1; j<num.length; j++)
			{
				temp   = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
	}
}

class Pro16_sort_array_diff_thread
{
	public static void main(String args[]) throws InterruptedException
	{
		Sorting obj1 = new Sorting();
		Sorting obj2 = new Sorting();
		
		Thread t1,t2;
		t1 = new Thread(obj1);			//t1 is set for obj1
		t2 = new Thread(obj2);			//t2 is set for obj2
		
		Instant start, end;
		
		start = Instant.now();				// now() : static method of class Instant. returns object of Instant. i.e. current system time
		
	    t1.start();					//t1 will execute run() method for obj1 to sort array 
		t2.start();					//t2 will execute run() method for obj2 to sort array
		
		t1.join();
		t2.join();
		//main thread will wait for t1 & t2 to complete their execution
		
		end   = Instant.now();
		
		Duration d = Duration.between(start,end);		// between() : static method, returns object of class Duration. i.e. duration between 2 times
		
		System.out.println(d.getNano() + " nanoseconds");		// getNano()    : non-static method of class Duration. returns time in nanoseconds
		System.out.println(d.getSeconds() + " seconds");		// getSeconds() : non-static method of class Duration. returns time in seconds
	}
}

