/* Array :-
 
Initializing array reference variable :-
1) int num[] = new int[5];
2) we can initialize array reference variable by mentioning values in { }. But we can do this only at the time of reference variable
   declaration.
   int num[] = {3,5,12,15,19};
3) If we don't have valid address/reference to store in reference variable, then we have to initialize reference variable by null.(small)

Note :- You can initialize any reference variable by null value.

*/

class Pro1
{
	public static void main(String args[])
	{
		//1)
		int num1[];
		num1 = new int[5];
		System.out.println("num1 = " + num1);
		
		//2)
		int num2[] = {12,45,2,3,8};
		System.out.println("num2 = " + num2);
		
		//3)
		int num3[];
		num3 = null;
		System.out.println("num3 = " + num3);
	}
}