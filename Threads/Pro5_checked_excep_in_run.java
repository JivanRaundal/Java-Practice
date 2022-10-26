/* Q. CAN WE HANDLE CHECKED EXCEPTIONS IN "run()" METHOD ??

1] Q.Can we use try-catch to handle checked exception in run() method ??
=> YES

2] Q.Can we use throws statement ??
=> NO, Because run() is overriden method & if you write 'throws ExceptionName' statement, header of run() method changes, which is not allowed 
   for overriden method.
*/

//eg: handling checked exception in run() method

class Mythread extends Thread
{
	public void run()	//throws InterruptedException 	//error, cannot use throws statement
	{
		int i;
		System.out.println();
		for(i=1; i<=10; i++)
		{
			System.out.println(Thread.currentThread().getName() + " i = " + i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Pro5_checked_excep_in_run
{
	public static void main(String args[])
	{
		System.out.println("\nmain() starts");
		Mythread obj = new Mythread();
		
		Thread t;
		t = new Thread(obj);
		t.start();
		
		System.out.println("\nmain() ends");
	}
}