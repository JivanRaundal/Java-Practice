/*
Note :- 1)non-static members of class always works for object of same class. Hence think about object when working with non-static members
		2)static members of class always works for whole class & not for any specific object. So, no need to think about object while
		  working with static members.
	
# Access Specifiers :- access specifiers decides the Visibility of members of class.

Types of access specifiers in JAVA :-
1) private
2) default (no-name access specifier)
3) protected
4) public

Note :- 1) Public members are accessible everywhere
		2) Private members of class are accessible only inside the member functions of it's own class.
		   you can't access them in non-member functions.
*/

class Number
{
	public 	int x;		//public	: accessible everywhere
	private int y;		//private	: accessible in member functions only
	
	public void show()				//non-static member function
	{
		System.out.println("x = " + x + "\ty = " + y);		//'y' is accessible here
	}
}

class Proc4
{
	public static void main(String args[])
	{
		Number obj;	
		obj = new Number();
		
		obj.show();		
		
		obj.x = 10;
		obj.y = 20;			//will give error, bcz 'y' is private & not accessible in non-member function 'main()'
		
		obj.show();
	}
}
