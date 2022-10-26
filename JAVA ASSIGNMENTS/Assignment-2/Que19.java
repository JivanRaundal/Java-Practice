// Q.19] WAP to generate NullPointerException, ArrayIndexOutOfBoundsException, InputMismatchException.

import java.util.Scanner;

class Que19
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		int num[];
		num = null;
		
		System.out.println(num);
		//System.out.println(num[1]);		// 'NullPointerException'
		
		num = new int[3];
		System.out.println(num[1]);
		//System.out.println(num[6]);		// 'ArrayIndexOutOfBoundsException'
		
		System.out.println("\nEnter int value : ");
		num[1] = sc.nextInt();				// 'InputMismatchException'
	}
}