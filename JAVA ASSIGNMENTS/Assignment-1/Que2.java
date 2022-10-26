// Q.2] Scan age and gender from a candidate and check if he/she is able to marry or not.

import java.util.*;

class Que2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		short age;
		char gender;
		String str;
		
		System.out.println("\nEnter Age of candidate : ");
		age = sc.nextShort();
		
		System.out.println("Enter gender of candidate : ");
		str = sc.next();			//OR gender = sc.next().charAt(0);
		gender = str.charAt(0);
		
		if((gender=='m' || gender=='M') && age >= 22)
		{
			System.out.println("\nCandidate is able to Marry");
		}
		else if((gender=='f' || gender=='F') && age >= 20)
		{
			System.out.println("\nCandidate is able to Marry");
		}
		else
		{
			System.out.println("\nCandidate is not able to Marry");
		}
	}
}