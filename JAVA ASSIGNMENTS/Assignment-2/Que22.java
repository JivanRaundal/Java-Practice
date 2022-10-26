// Q.22] Scan a number from user, check if it is prime or not recursively.

import java.util.*;

class Que22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("\nEnter number : ");
		n = sc.nextInt();
		
		if(isPrime(n,2))
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
	
	static boolean isPrime(int n,int i)
	{
		if(n < 2)					// 0 & 1 are neither prime nor composite
		{
			return false;
		}
		else if(i == n)				// means number is not divisible by other numbers (prime numbers are only divisible by itself)
		{
			return true;
		}
		else if(n%i == 0)			// if number is divisible by other numbers then it is not prime 
		{
			return false;
		}
		else
		{
			return isPrime(n,i+1);	//call isPrime() function recursively by incrementing i 
		}
	}
}
