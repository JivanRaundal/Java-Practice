// for each loop :-
// understanding for each loop

// Key Note :- Any changes made in x will not reflect in original array num.

class Pro9
{
	public static void main(String args[])
	{
		int num[] = {2,34,12,25,4,8,9,10};
		
		System.out.println("\nChaging value of variable in for each loop : ");
		for(int x : num)
		{
			x=0;					//changes made in x will not reflect in original array num.
			System.out.println(x);
		}
		
		System.out.println("\nWill not change elements of original array : ");
		for(int x : num)
		{
			System.out.println(x);
		}
	}
}