/* 2-D Array :- 2-D array is combination of multiple 1-D arays.

Note :- -int num[][]; here, num is reference variable which will store reference of 2-D array. (2-D array reference variable)
		-Actually, num is reference variable to array of references. (will see later)
		
Note :- Ways of initializing 2-D array reference variable. 3 ways
		-1) using new 
		-2) using {}
		-3) using null value

Note :- int num[][] = new int[3][4];
		-1) num       => It is refering to whole 2-D array
		-2) num[0]    => It is refering to 0th 1-D array of num, where num is 2-D array.
		-3) num[0][0] => It is refering to basic value of 0th row & 0th columnn.
*/

class Pro13
{
	public static void main(String args[])
	{
		//1) using new 
		int num[][];				//2-D array reference variable
		num = new int[3][4];		//will create runtime array of 3 rows & 4 columns
		
		System.out.println("\nnum       = " + num);			//will give reference of whole 2-D array
		System.out.println("num[0]    = " + num[0]);		//will give reference of 0th 1-D array of num, where num is 2-D array
		System.out.println("num[0][0] = " + num[0][0]);		//will print basic value of 0th row & 0th column.
		
		
		//2) using {}
		int arr[][] = {
					   {2,3,4,5},
					   {6,7,8,9},
					   {1,0,6,3}
					  };
		//OR int arr[][] = {{2,3,4,5},{6,7,8,9},{1,0,6,3}};		//in single line
		
		System.out.println("\narr       = " + arr);			//will give reference of whole 2-D array
		System.out.println("arr[0]    = " + arr[0]);		//will give reference of 0th 1-D array of arr, where arr is 2-D array
		System.out.println("arr[0][0] = " + arr[0][0]);		//will print basic value of 0th row & 0th column.
		
		
		//3) using null value
		int num2[][];
		num2 = null;
		
		System.out.println("\nnum2       = " + num2);			//will print null 
		//System.out.println("num2[0]    = " + num2[0]);		// runtime error => 'java.lang.NullPointerException'
		//System.out.println("num2[0][0] = " + num2[0][0]);		// runtime error => 'java.lang.NullPointerException'	
	}
}