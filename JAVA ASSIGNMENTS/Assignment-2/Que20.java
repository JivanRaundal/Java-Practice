// Q.20] Create a 2-D array of 5*3. Scan it using while loop. Do not use for loop. Check the output of length property with 2-D array.


import java.util.Scanner;

class Que20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num[][];		//2-D array refernce variable
		num = new int[5][3];
		
		System.out.println("\nEnter 2-D array elements (5*3) : ");
		int i=0,j=0;
		while(i<5)
		{
			j=0;
			while(j<3)
			{
				//System.out.print("\nnum[" + i + "][" + j + "] : ");
				num[i][j] = sc.nextInt();
				j++;
			}
			i++;
		}
		
		System.out.println("\nPrinting 2-D array : ");
		for(int x[] : num)
		{
			for(int y : x)
			{
				System.out.print("\t" + y);
			}
			System.out.println();
		}
		
		System.out.println("\nLength property of 2-D array");
		System.out.println("num.length = " + num.length);					//will give nu. of rows in 2-D array
		System.out.println("Length of i th 1-D array of num, where num is 2-D array");
		i=0;
		while(i<5)
		{
			System.out.println("num[" + i + "].length = " + num[i].length);	//will give no. of columns in each row
			i++;
		}
	}
}