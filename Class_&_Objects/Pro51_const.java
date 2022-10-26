/* # Constructors :-

1) Constructor is simply a member function of class whose name is same as that of ClassName.
2) We do not need to call constructor, it get's called automatically when object is created.
   eg=> ClassName obj;				//constructor does not get called for reference variable
        obj = new ClassName();		//Constructor gets called at time of object creation.
3) Constructors have no returntype. If you mention returntype then, it will be treated as normal member function which needs to be
   called using object & dot(.) operator.
4) Constructors only get called on object creation. They do not create objects. The main purpose of constructors is to validiate objects.
   i.e. to initialize datamembers of object at the time of creation. The code which you want to execute on each object creation, must 
   be written inside the constructor.
5) We can define multiple constructors in one class, with different set of parameters. We called it Constructor Overloading.
6) Constructors cannot be static as they always work for objects.
7) Note :- We can create private constructors without any syntactical error. But these private constructors will be accessible from
   member functions only. You can't create object which needs private constructor in Non-member functions. BCZ, private members are 
   accessible only in member functions of class.
8) Types of constructors in JAVA :- 
   1) default constructor
   2) Parameterized constructor
   
   
1] default constructor :- -Constructor without any parameter.
                          -When we do not mention any constructor in class then JVM automatically provides default constructor.
						  -But, if we have mention parameterized constructor in class, then JVM will not provide default constructor
						   In this case, you have to define default constructor if you need it.
						  -When to mention default constructor compulsary ?
								1) When we have mentioned a parameterized constructor.
								2) We are creating an object which need default constructor.

2] Parameterized Constructor :- -Constructor with some parameters is known as parameterized constructor.

Note :- No Copy constructor in JAVA. But, you can pass reference of object of same class as a parameter to parameterized constructor.

*/

class Number
{
	public int x,y;
	
	//making constructor private
	private Number(int a)			// private parameterized constructor (accessible only in member function)
	{
		System.out.println("In private parameterized constructor, a = " + a);
	}
	
	public Number(int a,int b)		// public parameterized constructor
	{
		new Number(10);				//valid in member function
		System.out.println("In 2 parameterized constructor, a = " + a + "\ty = " + b);
	}
}

class Pro51_const
{
	public static void main(String args[])
	{
		System.out.println("\nMain() starts");
		
		//new Number(10);				//error, can't create object in non-member function which requires private constructor
		new Number(5,6);
	}
}