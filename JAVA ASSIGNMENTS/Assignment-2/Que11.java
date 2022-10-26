// Q.11] Scan array of 5 integers from user. But while scanning a number from user, make sure that it is prime number.
//		 If it is not a prime number, do not accept that number. Ask user to enter that number again. Once he gives 5 primes
//		 print all the numbers. Make your code modular. (use functions)

import java.util.Scanner;

class Que11
{
	public static void main(String args[])
	{

		int []num = new int[5];

		System.out.println("\nEnter prime numbers as array elements");
		scanArray(num);
		
		System.out.println("\nPrintina array elements :");
		printArray(num);
	}

	static void scanArray(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			while(true)
			{
				System.out.println("\nelement " + i + " : ");
				arr[i] = sc.nextInt();
				if(isPrime(arr[i]))				//if number is prime then break loop
				{
					break;
				}
			}
		}
	}
	
	static boolean isPrime(int x)
	{
		if(x < 2)
		{
			return false;
		}
		else
		{
			for(int i=2; i<x; i++)
			{
				if(x%i == 0)
				{
					return false;			//number is not prime
				}
			}
			return true;					//number is prime
		}		
	}
	
	static void printArray(int arr[])
	{
		for(int x : arr)
		{
			System.out.print(" " + x);
		}
		System.out.println();
	}
}