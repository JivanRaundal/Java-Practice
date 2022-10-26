/* # interfaces :-

 Note :- If you don't know any implementation of class but you know function names, then instead of class define interfaces.
         naming convention for interfaces is same as that of ClassName.
		 SYNTAX :-  interface NameOfInterface
					{
						variable_declaration;
						method_declaration'
					}
# RULES :
1) We inherit class using 'extends' keyword & we inherit interface using 'implements' keyword.
2) methods declared inside interface are abstract & public by default. (the word declared is vary important)
3) The class which implements the interface must have to define/override all the abstract methods from interfaces with public access-specifier only.
   Otherwise, we have to declare that class as an abstract class.
4) We can implement more than one interfaces in one class.
5) There will be no any ambuiguity when multiple interfaces containing same method and implemented in same class.
   But, Java recommends that there should not be same name of methods in multiple interfaces.
6) Variables declared inside interface are static final by default. (i.e. static & final both)
8) If multiple interfaces contain datamember having same name  and we implement all those interfaces in one class, then it generates ambuiguity
   error when try to access that datamember. To remove this ambuiguity, we have to use interface_name & .(dot) operator.
9) # Inheritance in interfaces :- we can inherit one interface into another interface using 'extends' keyword.
*/

// eg- rule-5

interface Intr1
{
	void show();					//abstract & public by default (rule-2)
}

interface Intr2
{
	void show();					//abstract & public by default (rule-2)
}

class Myclass implements Intr1 , Intr2 		//rule-3 (to fill up the requirements of Multiple Inheritance )
{ 
	public void show()					//rule-5 Only one overriden method can work for both methods (no any ambuiguity error)
	{
		System.out.println("\nIn show()");
	}
}

class Pro27_interface
{
	public static void main(String args[])
	{
		Myclass obj = new Myclass();
		obj.show();
	}
}