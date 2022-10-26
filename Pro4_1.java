// Scanning Values from user

import java.util.Scanner;

class Pro4_1
{
	public static void main(String args[])
	{
		System.out.println("\nScannig Values from user");
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		System.out.println("\nEnter int value x & y : ");
		
		x = sc.nextInt();		//this method will scan only one int value at a time & will return scanned value in var
		y = sc.nextInt();
		
		//System.out.println("\nValue of x = " + x + " and y = " + y);
		System.out.println("\nvalue of x = " + x);
		System.out.println("value of y = " + y);
		
		
		long l;
		System.out.println("\nEnter long value l : ");
		l = sc.nextLong();		//this method will scan only one long value at a time & will return scanned value in var
		System.out.println("\nValue of l = " + l);
		
		
		float f;
		double d;
		System.out.println("\nEnter float value f : ");
		f = sc.nextFloat();		//this method will scan only one float value at a time & will return scanned value in var
		
		System.out.println("Enter double value d : ");
		d = sc.nextDouble();	//this method will scan only one double value at a time & will return scanned value in var
		
		System.out.println("\nValue of f = " + f);
		System.out.println("value of d = " + d);
		
		
		byte b;
		System.out.println("\nEnter byte value b : ");
		b = sc.nextByte();		//this method will scan only one Byte value at a time & will return scanned value in var
		System.out.println("\nValue of b = " + b);
		
		short s;
		System.out.println("\nEnter short value s : ");
		s = sc.nextShort();		//this method will scan only one short value at a time & will return scanned value in var
		System.out.println("\nValue of s = " + x);
		
		boolean bool;
		System.out.println("\nEnter boolean value bool : ");
		bool = sc.nextBoolean();  //this method will scan only one boolean value at a time & will return scanned value in var
		System.out.println("\nValue of bool = " + bool);
		
		System.out.println();
	}
}