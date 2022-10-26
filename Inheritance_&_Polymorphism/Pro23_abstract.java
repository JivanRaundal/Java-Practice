/* # 'abstract' keyword :-

# Abstract Method :- (same as pure virtual function in c++)

1) Use 'abstract' keyword to declare abstract method.
2) abstract methods cannot have body. eg:- abstract void show();
3) class containing abstract method must be defined as abstract class. eg:- abstract class Base{  }
4) we cannot create object of abstract class. (abstract class cannot be instantiated)
5) we can define abstract class without any abstract method BUT abstract method must be defined inside abstract class.
   abstract method declared inside normal class is not allowed, compiler generates error.
   eg :- abstract class Number							abstract class Base
		 {												{
			void print()									abstract void show();								
			{
				System.out.println();					}
			}
		 }	
6) we can define normal methods also in abstract class.
7) A class extending an abstract class, must have to define(override) all the abstract methods from abstract base class OR we have to make that 
   derived class abstract. Otherwise, compiler generates error.
8) static methods cannot be abstract bcz abstract is meant for runtime binding, Hence abstract method should be object dependent.
9) Constructors cannot be abstract.
10) We use this concept to apply some compulsions on derived classes. Mostly when we know partial implementation of class and rest of the implementation
   depends on derived classes, we use abstract concept.
*/

//eg :- static methods cannot be abstract bcz abstract is meant for runtime binding, Hence abstract method should be object dependent.
//      as static method is class dependent we cannot make it abstract.

abstract class Base 						//abstract class
{
	abstract static void show();			//error, cannot declare static method as abstract.
}

class Derive extends Base					//must have to override/define show() OR become abstract to avoid error
{	
	static void show()						//not overriding static show() of Base BCZ, static method cannot be abstract
	{
		System.out.println("\nIn Derive show()");
	}	
}

class Pro23_abstract
{
	public static void main(String args[])
	{
		//Base ref = new Base();			//error, cannot create object of abstract classs
		
		Derive.show();
	}
}