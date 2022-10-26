// Jagged Array :-

class Pro21
{
	public static void main(String args[])
	{
		int num[][];
		
		//System.out.println(num);			//Error, uninitialized variable
		
		num = new int[3][];					//will create refernce array on heap
		
		System.out.println(num);			//No error
		
		System.out.println("Default value of refernces on heap : ");
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("num.length = " + num.length);
		System.out.println("num[0].length = " + num[0].length);		// Runtime error => 'java.lang.NullPointerException'
		
	}
}