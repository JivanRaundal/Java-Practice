/* Array :-
 
Initializing array reference variable :-
1) int num[] = new int[5];
2) we can initialize array reference variable by mentioning values in { }. But we can do this only at the time of reference variable
   declaration.
   int num[] = {3,5,12,15,19};
3) If we don't have valid address/reference to store in reference variable, then we have to initialize reference variable by null.(small)

Accessing elements of array in JAVA:-
Same as a/c++ using [ ] i.e. square bracket notation.

Note1 :- (hindi) Runtime memory (allocated on heap) without initializing hum use kar sakte hai, bcz java me runtime memory ko default 
		 value hoti hai. & i.e. 0(zero) for integers, 0.0 for float & double & \0(ASCII value 0) for char.
		
Note2 :- When you try to access memory/value allocated by reference variable, but that reference variable stores null value,
		 then you get runtime exception. i.e. 'java.lang.NullPointerException'
*/

class Pro2
{
	public static void main(String args[])
	{
		int num1[];
		num1 = new int[5];
		System.out.println("num1[0] = " + num1[0]);
		System.out.println("num1[2] = " + num1[2]);
		
		int arr[] = {2,4,7,8,12};
		System.out.println("\narr[2] = " + arr[2]);
		System.out.println("arr[4] = " + arr[4]);
		
		char arr2[];
		arr2 = new char[5];
		System.out.println("\narr2[0] = " + arr2[0]);		//will print nothing bcz 0(zero) is ASCII value of '\0' & String terminates 
		System.out.println("(int)arr2[0] = " + (int)arr2[0]);
		
		int num2[];
		num2 = null;
		System.out.println("\nnum2[0] = " + num2[0]);		//will give exception(runtime error) => 'java.lang.NullPointerException' (Note2)
		
	}
}