/* Passing 1-D array to function :-

Note :- -When we pass array to function, we actually pass reference of that array. Hence changes made in array from called function
		 become visible in calling function also.
		-In following eg, both reference variable num & arr are refering to the same memory of array. Hence changes made in array
		 using arr are visible to num also.
		-There is only pass by value & not pass by reference. Bcz, we are actually passing contents of num to function.
*/

class Pro10
{
	public static void main(String args[])
	{
		int num[] = {2,4,6,8};
		System.out.println("\nnum = " + num);
		System.out.println("num.length = " + num.length);
		System.out.println("Before fun call, num[1] = " + num[1]);
		myfun(num);						//Note : passing reference of array stored in num by value to function. Hence pass by value.
		System.out.println("\nAfter fun call, num[1] = " + num[1]);
	}
	static void myfun(int arr[])
	{
		System.out.println("\narr = " + arr);
		System.out.println("arr.length = " + arr.length);
		System.out.println("In myfun(), arr[1] = " + arr[1]);
		arr[1] = 15;		//Note : changes made in array here, are visible in calling function i.e. main()
	}
}
