// Q.2] Scan radius from user in main(). Define functions to find area and circumference of circle. Print both results back in main().

import java.util.Scanner;

class Que2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		float rad;
		float area,circm;
		
		System.out.println("\nEnter radius of circle : ");
		rad = sc.nextFloat();
		
		area  = circleArea(rad);
		circm = circleCircumference(rad);
		
		System.out.println("\nArea of circle = " + area);
		System.out.println("Circumference of circle = " + circm);
	}
	
	static float circleArea(float rad)
	{
		float area;
		area = 3.14f*rad*rad;		
		return area;
	}
	
	static float circleCircumference(float rad)
	{
		float circm;
		circm = 2*3.14f*rad;
		return circm;
	}
}