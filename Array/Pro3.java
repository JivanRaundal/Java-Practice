// Initializing array elements (not reference var) :-

// Length property of array :- (number of elements in array)
//		-applicable to all types of arrays in JAVA.
//		-gives length of array
//      -SYNTAX :- int len = arr_name.length;   	(Note => length is not function hence do not mention ())

class Pro3
{
	public static void main(String args[])
	{
		//1)
		int num[];
		num = new int[5];			//int array
		System.out.println("\nLength of num array = " + num.length);
		System.out.println("Printing default value of num array elements :");
		for(int i=0; i<5; i++)
		{
			System.out.print(" " + num[i]);
		}
		
		//2)
		double arr[] = new double[5];	//double array
		System.out.println("\n\nLength of arr array = " + arr.length);
		System.out.println("Printing default value of arr array elements :");
		for(int i=0; i<5; i++)
		{
			System.out.print(" " + arr[i]);
		}
		
		//3) array elements initialize at the time of declaration
		int num2[] = {3,5,8,12,15,9};
		System.out.println("\n\nLength of num2 array = " + num2.length);
		System.out.println("Printing num2 array :");
		for(int i=0; i<num2.length; i++)
		{
			System.out.print(" " + num2[i]);
		}
	}
}