/* # Nestes Classes :- 

Composition :- Creating object of one class as a datamember of another class is known as Composition. (Has-A relationship)

Note :- In case of Nested classes, If you have to reach to Inner class, you have to go through Outer class.
       -We can have multiple Nested classes just like 'if-else'
	   -In case of Nested classes, If Inner class is made Private, we can't access it's members in non-member member function.
	    Even if access-specifiers of members is public.

Note :- How to create an object of Inner class in non-member function?
		SYNTAX :-  Outer obj = new Outer();			//requires object of Outer class also
				   Outer.Inner ref;					//this will create reference var of Inner class
		           ref = obj.new Inner();			//will create object of Inner class in non-member function
*/

// Q. If class Inner is made private. What will happen ? 

class Outer			//Outer class
{
	private class Inner		//Inner class
	{
		public int x;		//x will get memory when object of Inner gets created
		
		public void show()
		{
			System.out.println("In Inner show()");
		}		
	}
	
	public int y;
	public Inner in = new Inner();			//composition (creating object of class Inner as a datamember of class Outer)
	
	public void print()
	{
		//System.out.println("In Outer print()");
		System.out.println("y = " + y + "\tin.x = " + in.x);
		in.show();
	}
}

class Pro68
{
	public static void main(String args[])
	{
		Outer out = new Outer();
		
		out.y = 10;			//valid bcz, y belongs to Outer
		
		//out.in.x = 20;	//error, cannot access members of class Inner in non-member function BCZ, class Inner is private
		
		//System.out.println("out.y = " + out.y + "\tout.in.x = " + out.in.x);
		out.print();
	}
}
 