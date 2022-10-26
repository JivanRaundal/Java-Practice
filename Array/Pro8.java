// for each loop :-

// Q. Given array of 10 integers. Print array using for each loop, but stop printing when element is 17.

class Pro8
{
	public static void main(String args[])
	{
		int arr[] = {2,3,6,8,12,25,10,17,23,56};		//this array is also created at runtime on heap
		
		System.out.println("\nArray : ");
		
		for(int x : arr)
		{
			if(x == 17)			//will break loop when x==17
			{
				break;
			}
			System.out.println(" " + x);
		}
		
	}
}