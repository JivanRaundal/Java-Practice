// Q 20.4] WAP to print addition of 2 matrices.

import java.util.Scanner;

class Matrix
{
	int num[][];				//num is reference to array of references of type int
	
	public Matrix()
	{
		num = new int[3][4];
	}
	
	public void scanMatrix()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter elements of 3*4 matrices : ");
		int i,j;
		for(i=0; i<num.length; i++)
		{
			for(j=0; j<num[i].length; j++)
			{
				num[i][j] = sc.nextInt();
			}
		}
	}
	
	public void printMatrix()
	{
		System.out.println("\nMatrix : ");
		//printlint using for each loop
		for(int x[] : num)
		{
			for(int y : x)
			{
				System.out.print("  " + y);
			}
			System.out.println();
		}
	}
	
	public void addMatrix(Matrix M1,Matrix M2)
	{
		//adding two matrices in 3rd & returning it's reference
		int i,j;
		for(i=0; i<num.length; i++)
		{
			for(j=0; j<num[i].length; j++)
			{
				num[i][j] = M1.num[i][j] + M2.num[i][j];
			}
		}
	}
}

class Que20_4
{
	public static void main(String args[])
	{
		Matrix M1,M2,M3;
        M1 = new Matrix();
		M2 = new Matrix();
		M3 = new Matrix();
		
		M1.scanMatrix();
		M1.printMatrix();
		M2.scanMatrix();
		M2.printMatrix();
		
		M3.addMatrix(M1,M2);
		
		System.out.println("\n\nAddition of two Matrices M1 & M2 is");
		M3.printMatrix();
	}
}