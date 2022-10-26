// Q.11] Keep scanning a number from user until user enters -1. Print addition of positive and negative numbers seperate.

import java.util.*;

class Que11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x,addp=0,addn=0;
		
		System.out.println("\nKeep entering number & enter -1 to STOP : ");
		while(true)
		{
			x = sc.nextInt();
			if(x == -1)
			{
				break;
			}
			
			if(x > 0)
			{
				addp = addp + x;
			}
			else 		//(x < 0)
			{
				addn = addn + x;
			}
		}
		
		System.out.println("\nAddition of positive numbers = " + addp);
		System.out.println("Addition of negative numbers = " + addn);
	}
}