/* Accessing Data-members of class using objects :-

Note => -Class is Customized datatype / User-defined datatype
		-There is no any memory allocation for class definition, class only helps JVM to create an object.
		-The actual memory is allocated to variable of class which is also called as an object.
		
		* In JAVA every object get's created on Heap at Runtime
		* We access datamenbers using object name & dot(.) operator.
*/

import java.util.Scanner;

class Teacher
{
	//Data members
	//SYNTAX => access_specifier [static] datatype variable [=value];	//[ ] are optional
	
	public int age = 35;			//In java, we can initialized data member at time of declaration also
	public int salary = 40000;
	
	//Member function
	public void print()
	{
		System.out.println("In member function print()");
	}
}

class Pro1
{
	public static void main(String args[])
	{
		Teacher T1,T2;			//will just create reference variable of class
		T1 = new Teacher();		//this statement will create actual object at runtime on heap.
		T2 = new Teacher();
		
		System.out.println("\nBefore");
		System.out.println(T1.age);
		System.out.println(T2.age);
		
		T1.age = 21;
		T2.age = 20;
		
		System.out.println("\nAfter");
		System.out.println(T1.age);
		System.out.println(T2.age);
	}
}
