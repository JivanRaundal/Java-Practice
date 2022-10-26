/* # How to stop Thread execution ??

# Why 'volatile' keyword?
=> In some cases java provides some optimization which may create problem when their are more than one executor's (Threads) in our code.
   To avoid this problem, we use volatile keyword with datamembers so that we can access actual memory of volatile datamembers without any
   optimization for correct output.

# Note: One more constructor for Thread class.
 SYNTAX :  Thread t = new Thread(obj, "first");		//we can mention name of thread as a parameter in constructor 
*/

// eg:

class Mythread extends Thread
{
	volatile public boolean val = true;	//volatile datamember (whenever we will access val, we will access it's actual memory without optimization)
	
	public void run()
	{
		int i=0;
		System.out.println();
		
		while(val)			//will excute till val = true   (will excute for 3 seconds)
		{
			i++;
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
	}
}

class Pro14_stop_thread_execution
{
	public static void main(String args[]) throws InterruptedException
	{
		Mythread obj = new Mythread();
		
		Thread t = new Thread(obj, "jivan");			//mentioning object & name of thread
		t.start();
		
		Thread.sleep(3000);			//NOTE: after 3 seconds, main thread will wake up & will make val = false & hence, while loop will break
		obj.val = false;			//      which results in termination of thread 't'.
		
		System.out.println("\nmain() ends");
	}
}