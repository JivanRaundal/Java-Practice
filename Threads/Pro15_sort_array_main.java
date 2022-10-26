/*# Sorting 2 arrays using single thread :-

NOTE: -Instant class & Duration class are inbuilt classes in java.
      -Instant class's static method "now()" returns the object of class Instant. i.e. current system time.
	  -Duration class's static method "between()" returns the object of class Duration. i.e. duration between given start and end system time.
	  -Duration class's non-static methods "getNano()" & "getSeconds()" are used to get time in 'nanoseconds' & 'seconds' respectively. 
	  
NOTE: In following code only main thread is sorting both arrays hence time required will be more. 
      If 2 different threads are set to sort different arrays then time for sorting will be reduced.(almost half)
	  that we have to see in this & next code.
*/

import java.time.Instant;
import java.time.Duration;
//import java.time.*;

class Sorting 
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
	
	public void sort()
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

class Pro15_sort_array_main
{
	public static void main(String args[])
	{
		Sorting obj1 = new Sorting();
		Sorting obj2 = new Sorting();
		
		Instant start, end;
		
		start = Instant.now();				// now() : static method of class Instant. returns object of Instant. i.e. current system time
		obj1.sort();
		obj2.sort();
		end   = Instant.now();
		
		Duration d = Duration.between(start,end);		// between() : static method, returns object of class Duration. i.e. duration between 2 times
		
		System.out.println(d.getNano() + " nanoseconds");		// getNano()    : non-static method of class Duration. returns time in nanoseconds
		System.out.println(d.getSeconds() + " seconds");		// getSeconds() : non-static method of class Duration. returns time in seconds
	}
}

