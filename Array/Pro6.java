/* Types of loops in JAVA :-
	1)for, 2)while, 3)do-while, 4)for each
	
# for each loop :-
	-to use for each loop, we need set of elements.
	-set of elements => 1) Array, 2) collections (same as STL in c++)
	-SYNTAX : 
				for(dataype var_name :  set_of_elemets)
				{
					statements;
				}
				
		where, set_of_elemets is nothing but name of array for 1-D array.
		Note :- datatype of variable declared in for each loop should be same as that of array(set_of_elemets).
			  - each is not keyword in JAVA it's just use to describe name of loop. i.e. for each loop.
		
		eg => float num[] = new float[5];
			  for(float x : num)
			  {
				  System.out.print(x);
			  }
			  
			  #Executuin :=> -No need of terminating condition.
							 -automatically iterates through whole set(i.e. Array).
							 -In each iteration, next value in array gets copied in x.
							 -* Any changes made in x will not get reflected in num array.
*/

// Q. scan array of 6 integers from uset, print their addition using for each loop.

import java.util.Scanner;

class Pro6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[];
		num = new int[6];
		
		System.out.println("\nEnter array elements : ");
		for(int i=0; i<6; i++)
		{
			System.out.print("\nelement " + i + " : ");
			num[i] = sc.nextInt();
		}
		
		int sum = 0;
		//adding array elements using for each loop
		for(int x : num)
		{
			sum = sum + x;
		}
		
		System.out.println("\n\nAddition of array elements = " + sum);	
	}
}