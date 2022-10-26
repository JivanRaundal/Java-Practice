/* Some methods of Thread class :-

Note :- main thread is executing the main() method by default.

1] currentThread() :
-static method of Thread class.
-returns the reference of currently executing Thread. Means returntype is Thread.
-Header :- static Thread currentThread()

2] getName() :
-non-static method of class Thread.
-returns the name of thread. Means returntype is String.
-Header :- String getName()

3] getPriority() :
-non-static method of class Thread.
-returns the priority of thread. Means returntype is int.
-Header :- int getPriority()

4] setName(String name) :
-non-static method of class Thread.
-sets the name of thread.
-Header :- void setName(String name)

5] setPriority(int priority) :
-non-static method of class Thread.
-sets the priority of thread.
-Header :- int setPriority()
*/

//eg :-

class Pro1
{
	public static void main(String args[])
	{
		Thread t;						//reference variable of thread class
		t = Thread.currentThread();		//this method will return reference of currently executing thread
		System.out.println(t);			//toString() method will get called when print reference 
		
		String name;
		name = t.getName();				//this method will return name of thread
		System.out.println("\nThread name = " + name);
		
		int priority;
		priority = t.getPriority();		//this method will return priority of thread
		System.out.println("\nPriority of thread = " + priority);
		
		System.out.println("===========================================");
		
		t.setName("PICT");				//this method sets name for thread
		
		t.setPriority(9);				//this method sets priority for thread
		
		System.out.println(t);
	}
}

