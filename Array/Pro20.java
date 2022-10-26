// Q. Create 2-D array of 3*3 & initialize it. Scan a number from user & search it in array.

import java.util.Scanner;

class Pro20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		int n;
		System.out.println("\nEnter number to be searched : ");
		n = sc.nextInt();
		
		int i,j,flag=0;
		for(i=0; i<num.length; i++)
		{
			for(j=0; j<num[0].length; j++)
			{
				if(num[i][j] == n)
				{
					System.out.println("Found at index " + "(" + i + "," + j + ")");
					flag=1;
					break;		//will break inner loop
				}
			}
			if(flag == 1)			//will break outer loop
			{
				break;
			}
		}
		
		if(flag == 0)
		{
			System.out.println("Not Found");
		}
	}
}