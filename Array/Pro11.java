/* Passing array to function :-

Note :- Garbage Collector
		-In below eg, when control goes back to calling function from called function, Local referece variable arr get's destroyed with
		 stackframe hence referece count of 2nd array created in myfun() becomes 0(zero). As no one is referring to that memory
		 Garbage Collator will come and will free that memory. Hence no memory leak in Java.
		-In c/c++ we have to think of memory leak & have to free memory explicitly using free()/delete.
		-Garbage Collector only destroyes memory on heap (not on stack).
		-It destroyes that memory whose referece count is zero(0).

*/

class Pro11
{
	public static void main(String args[])
	{
		int num[] = {6,9,15};
		System.out.println("\nnum[1] = " + num[1]);
		myfun(num);
		System.out.println("\nnum = " + num);
		
		int []x;
		x = num;
		num = null;
		System.out.println("\nx[1] = " + x[1]);
	}
	public static void myfun(int arr[])
	{
		System.out.println("\narr = " + arr);
		arr = new int[2];				//will refer to new array
		System.out.println("\narr = " + arr);
		arr[1] = 10;
	}
}