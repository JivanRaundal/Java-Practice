// Functions with parameters :-

// Q. Scan length and width from user, find area and perimeter of rectangle using different functions.

import java.util.Scanner;

class Pro31
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		float len,wid;
		System.out.println("\nEnter length & width of rectangle : ");
		len = sc.nextFloat();
		wid = sc.nextFloat();
		
		areaOfRectangle(len,wid);
		periOfRectangle(len,wid);
	}
	
	public static void areaOfRectangle(float l,float w)
	{
		float area;
		area = l * w;
		System.out.println("\nArea of rectangle = " + area);
	}
	
	static void periOfRectangle(float l,float w)
	{
		float peri;
		peri = 2*(l+w);
		System.out.println("Perimeter of rectangle = " + peri);
	}
}