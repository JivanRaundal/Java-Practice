/* Length property of 2-D array.

Note => 2-D array is a combination of multiple 1-D array.

Note :- int num[][] = new int[3][4];
		-1) num       => It is refering to whole 2-D array
		-2) num[0]    => It is refering to 0th 1-D array of num, where num is 2-D array.
		-3) num[0][0] => It is refering to basic value of 0th row & 0th columnn.
*/

class Pro14
{
	public static void main(String args[])
	{
		int num[][] = {{1,2,3,4},{6,7,9,4},{9,0,4,3}};
		
		System.out.println("\nnum.length = " + num.length);			//will give length of reference array / number of rows in 2-D array
		System.out.println("num[o].length = " + num[0].length);		//will give length of 1-D array of num, where num is 2-D array
																	// Or number of elements in each row of 2-D array. i.e. Column
		//System.out.println("num[0][0].length = " + num[0][0].length);		//will give error bcz, length property works on array only
	}
}