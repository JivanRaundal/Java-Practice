/* # LET'S CREATE NEW THREAD OTHER THAN MAIN THREAD :- (crating our own thread)

# THEORY :
-Thread is an object of class Thread.
-Hence, to create thread, we create an object of class Thread.
-While creating thread, you have to mention that object (as a para constructor) for which your thread will work.
-REMEMBER, the class whose object you will mention while creating a thread, must be a derived class of class Thread. Then only you can pass object
 of that class as a parameter to Thread class constructor. (you have to extend Thread class in your class)
-Now, Override the 'run()' method from class Thread in your class (whose object will be passed as a parameter to Thread class constructor).
-=================(thread is properly created. Now time to start your thread.)=================
-after creation of thread, we have to start it so that it will run. To start thread use non-static function 'start()' from class Thread.
-When we start thread, it goes to run() method for execution. child thread will execute in the run() method of that class whose object is passed
 as a parameter to Thread class constructor while crating that child thread.

Note: Q.Why start() method ??
      => main() thread is responsible for the execution of start() method. In start() method new child thread is started & run() method is called
         using object which is mentioned while creating child thread & child thread executes inside the run() method.

Note :-
1) run() method    :- non-static method of class Thread. It is blank function defined in class Thread. we have to override it in our class for which
                      thread will work.
2) start() method  :- non-static method of class Thread, used to start thread.
*/

class Mythread extends Thread				//inheriting class Thread
{
	public void run()				//overriden run() method from class Thread 
	{
		Thread ref;
		ref = currentThread();			//will return the reference of currently executing thread.
		System.out.println("\nIn Mythread run() method :: " + ref);
	}
}

class PICT extends Thread
{
	public void run()				//overriden run() method from class Thread 
	{
		Thread ref;
		ref = currentThread();			//will return the reference of currently executing thread.
		System.out.println("\nIn PICT run() method :: " + ref);
	}
}


class Pro3_creating_thread
{
	public static void main(String args[])
	{
		System.out.println("\nmain() starts");
		Mythread obj = new Mythread();
		PICT     var = new PICT();
		
		//obj.run();
		
		Thread t;
		//t = new Thread(var);
		t = new Thread(obj);				//creating child thread which will work for mentioned object
		t.start();
		
		System.out.println("\nIn main() method :: " + Thread.currentThread());	//main thread is executing this statement hence, main thread info printed
		System.out.println("\nmain() ends");
		
		//obj.run();
	}
}