/* # Inheritance :- ('extends' keyword is user for Inheritance in JAVA)
 
 SYNTAX :-  class Parent
			{
				
			}
			class Child extends Parent
			{
				
			}

Note :- private   => Never get's Inherit
	    default   => Inherited in same package only
		protected => Inherited in same as well as different package
		public    => Inherited in same as well as different package + accessible everywhere

Note :- As we are working in same package, 
        private => never get's Inherited
        public/protected/default => Inherited	

Note :- All the datamembers in Inheritance tree will get memory in derived class object no matter what their access-specifier is.		
*/

//making base class members private

class Base
{
	private int bx = 70;
	
	private void show()
	{
		System.out.println("\nIn Base show() bx = " + bx);
	}
	
	public void print()
	{
		System.out.println("\nIn Base print() bx = " + bx);
		show();
	}
}

class Derive extends Base
{
	public int dx = 90;
	
	public void disp()
	{
		System.out.println("\nIn Derive disp() dx = " + dx);
		//System.out.print(" bx = " + bx);			//error, bx is private & cannot be Inherited
		print();			//valid
	}
}

class Pro4
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		
		obj.print();
		obj.disp();
		
		/* Paths to reach bx using obj :
		1) obj -> print() -> bx
		2) obj -> print() -> show() -> bx
		3) obj -> disp() -> print() -> bx
		4) obj -> disp() -> print() ->show() -> bx
		*/
	}
}