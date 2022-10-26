/* # state of thread :-

# getState() :
-non-static method of class Thread.
-It returns the state of Thread.
-Thread states are : NEW, RUNNABLE & TERMINATED
-Header=>     String getState()

Note: execution of child thread starts immediately when it enters in 'run()' method & after complete execution of run() method, it's execution stops.

1] NEW state 	    :- When thread is properly created but not started yet, then it's state is NEW. (i.e. before t.start() statement)
2] RUNNABLE state   :- When thread starts execution, then it's state is RUNNABLE. (eg- for child thread state in run() method is RUNNABLE)
3] TERMINATED state :- when thread completes the execution, then it's state is TERMINATED.
					   (eg- for child thread, state after coming out of run() is TERMINATED)
4] TIMED_WAITING state :- When thread is in sleep/waiting state then it's state is TIMED_WAITING.
5] WAITING state    :- When thread is made to wait using "wait()" method, then it's state is WAITING.
*/

// eg:

class Mythread extends Thread
{
	public void run()
	{
		int i;
		System.out.println();
		for(i=1; i<=10; i++)
		{
			System.out.println(Thread.currentThread().getName() + " i = " + i);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("\nIn run() method " + Thread.currentThread().getName() + " state = " + Thread.currentThread().getState()); // RUNNABLE
	}
}

class Pro7_thread_state
{
	public static void main(String args[]) throws InterruptedException
	{
		Mythread obj = new Mythread();
		
		Thread t;
		t = new Thread(obj);			//thread is properly created but not started yet
		
		System.out.println("\nBefore starting " + t.getName() + " state = " + t.getState());			// NEW
		
		t.start();				//in start method thread t will be started
		
		Thread.sleep(6000);				//main thread will sleep until child thread completely executs run() method
		
		System.out.println("\nAfter execution " + t.getName() + " state = " + t.getState());			//TERMINATED
	}
}