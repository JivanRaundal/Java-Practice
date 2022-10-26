/* # finalize() method in JAVA :-

Note :- In JAVA, there is not destructor, bcz Garbage Collector does the work of destructor. i.e. to realease/free memory when object 
        is destroyed. But, we can write finalize() method to work as a destructor.
		-Due to lots of drawbacks of finalize() method, JAVA has depricated(banned) finalize() method.
		
Note :- SYNTAX of finalize() method-
		protected voif finalize()
		{
			//code here
		}
		
Note :- finalize() method belongs to class Object. (Base class of all classes) & we override finalize() method in our class, Hence
        it should be available in derived classes. Therefore, finalize() method can be protected or public only. we cant declare
		it with default & private access-specifiers.
   
Drawback of finalize() method :-
-finalize() method is called when your object is destroyed.
-As objects are created on heap & if reference count of object becomes zero(0), Garbage Collector (GC) will come & realease/free that 
 memory & will also call finalize() method if any.
-But, we don't know that when Garbage Collector will come. Hence, we don't know when finalize() will execute.
-Also, the sequence of execution of finalize() method is not same as destructors in c++. (In case of Inheritance)
-Due to this drawbacks, finalize() method is depricated(banned) by java.

Note :- To execute finalize() method, Garbage Collector should execute first. & to call Garbage Collector (GC) we have method gc()
        System.gc();			i.e. gc() is static member function of class System
*/

class Number
{
	public int x,y;
	
	public Number()
	{
		System.out.println("\nObject Created");
	}
	
	protected void finalize()
	{
		System.out.println("Object Destroyed");
	}
}

class Pro54_finalize
{
	public static void main(String args[])
	{
		Number obj = new Number();
		Number var = new Number();
		obj = null;						//due to this there is memory leak & GC will come (don't know when it will free memory)
		var = null;
		
		//to call finalize(), we have to call gc() 
		System.gc();			//gc() is static member function of System class
	}
}