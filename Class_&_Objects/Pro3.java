/* Class & Objects 

Note   => Class is customized datatype / User-defined datatype. where, name of datatype & size(memory) of datatype is decided by programmer.
		-There is no any memory allocation for class defination. It just helps JVM to create object.
		-Actual memory is allocated to variable of class which is also called as object.
		-In JAVA, every object gets created at Runtime only. hence we have to use 'new' operator.
		-After creating an object on heap, 'new' operator returns reference of that memory, which we have to store in a reference variable
		- Note :- Object is created on heap, but reference variable which stores reference of object is local variable.
		-The total memory allocated to object is equal to the total memory required for the datamembers defined inside that objects class.
		-If we create 'n' objects of any class, every object has it's own copy of each non-static datamembers.
		-static datamembers do not get memory on per object basis. (only 1 copy for whole class i.e. all objects access that single copy)
		-we access data members using object name & .(dot) operator.
		


SYNTAX OF CLASS :-

	class ClassName
	{
		//datamembers
		access_specifier [static] datatype variable_name [= value];			//syntax for datamembers
		// Note :- You can initialize datamembers at time of declaration in JAVA
		
		//member functions
		access_specifier [static] returntype function_name ([para_list])	//syntax for member function
		{
			//body of function
		}
	}
	
SYNTAX OF CREATING OBJECT :-

	ClassName obj;			//this will just create local reference variable of class
	obj = new ClassName([para_list]);	//this will create actual object on heap & will return reference of that object 
										//which is stored in reference variable. [para_list] is optional part
										
	//to access datamembers & member functions
	obj_name.datamember_name;
	obj_name.memberfunction_name([para]);
	
	
	Note :- In JAVA, every object gets created on heap, hence objects dont have name, we have to access objects using reference variable.
*/

class Number
{
	//datamembers
	public int x = 10;		//can initialize datamembers 
	public int y;			//default value 0 bcz, they get memory on heap
	
	//member functions
	public void show()		//member fun for class Number but non-member fun for class Pro3
	{
		System.out.println("x = " + x + "\ty = " + y);
	}
}

class Pro3
{
	public static void main(String args[])		//member fun for class Pro3 but non-member fun for class Number
	{
		Number obj;				//reference var of class Number
		obj = new Number();		//will create object on heap
		
		System.out.println("\nBefore changing values of datamembers : ");
		obj.show();
		
		//accessing datamembers here using objext & .(dot) operator
		obj.x = 100;
		obj.y = 200;
		
		System.out.println("After changing values of datamembers : ");
		obj.show();
	}
}