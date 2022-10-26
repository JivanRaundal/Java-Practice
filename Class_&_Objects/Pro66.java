/* # Nestes Classes :- 

Composition :- Creating object of one class as a datamember of another class is known as Composition. (Has-A relationship)

Note :- In case of Nested classes, If you have to reach to Inner class, you have to go through Outer class.
       -We can have multiple Nested classes just like 'if-else'

Note :- How to create an object of Inner class in non-member function?
		SYNTAX :-  Outer obj = new Outer();			//requires object of Outer class also
				   Outer.Inner ref;					//this will create reference var of Inner class
		           ref = obj.new Inner();			//will create object of Inner class in non-member function
*/

class Outer			//Outer class
{
	class Inner		//Inner class
	{
		public int x;		//x will get memory when object of Inner gets created
	}
	
	public int y;
	public Inner in = new Inner();			//composition (creating object of class Inner as a datamember of class Outer)
}

class Pro66
{
	public static void main(String args[])
	{
		Outer out = new Outer();
		
		out.y = 10;			//valid bcz, y belongs to Outer
		//out.x = 20;			//error, bcz x belongs to Inner & not Outer
		out.in.x = 20;		//valid
		
		System.out.println("out.y = " + out.y + "\tout.in.x = " + out.in.x);
	}
}
