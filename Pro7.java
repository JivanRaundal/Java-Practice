// Input Buffer Problem with nextLine() method.

import java.util.Scanner;

class Pro7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		int x;
		
		System.out.println("\nEnter integer value : ");
		x = sc.nextInt();
		System.out.println("\nValue of x = " + x);
		
		//Buffer problem 
		/*
		System.out.println("\nEnter String : ");
		str = sc.nextLine();		//due to previous sc.nextInt(). '\n' will be already in buffer & nextLine() will terminat.
		System.out.println("\nstr = " + str);
		*/
		
		System.out.println("\nEnter String : ");
		sc.nextLine();						//will remove '\n' from buffer
		str = sc.nextLine();				//will scan string from user
		System.out.println("\nstr = " + str);
		
		//Note => No any buffer problem if we use next() method.

		int y;
		System.out.println("\nEnter integer value : ");
		y = sc.nextInt();
		System.out.println("\nvalue of y = " + y);
		
		String mystr;
		System.out.println("\nEnter string : ");
		mystr = sc.next();
		System.out.println("\nmystr = " + mystr);
		
		System.out.println();
	}
}