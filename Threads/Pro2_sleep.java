/* # sleep() :-

-static method of class Thread.
-The thread which excutes the statement "Thread.sleep(1000);" will go to sleep for 1 second. (1 second = 1000 miliseconds)
-Note:- sleep() method throws checked exception 'InterruptedException'
-SYNTAX :- 
	static void sleep(long miliseconds) throws InterruptedException
	{
		//code here
	}
*/

// eg:


class Pro2_sleep
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("\nmain() starts");
		
		Thread.sleep(5000);					//main thread will go to sleep for 5 seconds
		
		System.out.println("\nAfter 5 seconds\n");
		
		show();
	}
	
	static void show() throws InterruptedException
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i = " + i);
			Thread.sleep(1000);					//currently excuting thread(main for now) will go to sleep for 1 second in each iterations
		}
	}
}