/* Functions :-

Syantax :-

access_specifier [static] ret_type fun_name (para_list)
{
	//body of function
}

Note : 0) Every function in JAVA is always defined inside the class.
	   1) Every function in Java is member function of some class.
       2) Types of member function : 1)static 2)non-static
	   3) Static member function (not need of object to call)
	   4) non-static member function (needs object to call)
	   5) As we have not seen objects yet, we will now work with static member functions only.
	   6) static member functions of same class can call each other directly.
	   7) Every function can be called from another function of from function itself.(recursion)
	   8) We cannot define one function in another.
	   
	   VARIABLE TYPES IN JAVA :- 1) local variable,  2) class variable
*/

import java.util.*;

class Pro28
{
	public static void main(String args[])	//static member function with public access specifier
	{
		System.out.println("main() begins");
		show();								//calling show() from main()
		System.out.println("main() ends");
	}
	
	public static void show()				//static member function with public access specifier
	{
		System.out.println("show() starts");
		print();							//calling print() from show()	
		System.out.println("show() ends");
	}
	
	static void print()						//static member function with default access specifier
	{
		System.out.println("In print()");
	}
}	