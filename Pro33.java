// Function returning values :-

// Q. Scan radius in main(). Find area & circumference in function. Print both results back in main().

import java.util.Scanner;

class Pro33
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		float rad;
		System.out.println("\nEnter radius of circle : ");
		rad = sc.nextFloat();
		
		float area,circum;
		area = area(rad);
		circum = circumference(rad);
		
		System.out.println("Area of circle = " + area);
		System.out.println("Circumference of circle = " + circum);
	}
	
	static float area(float rad)
	{
		float area;
		area = (float)(3.14*rad*rad);
		return area;
	}
	
	static float circumference(float rad)
	{
		float circum;
		circum = (float)(2*3.14*rad);
		return circum;
	}
}