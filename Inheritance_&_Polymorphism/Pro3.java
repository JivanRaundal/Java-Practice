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
	
	public void show()
	{
		System.out.println("\nIn Base show() bx = " + bx);
	}
}

class Derive extends Base
{
	public int dx = 90;
	
	public void disp()
	{
		System.out.println("\nIn Derive disp() dx = " + dx);
		//System.out.print(" bx = " + bx);			//error, bx is private & cannot be Inherited
		//show();			//valid
	}
}

class Pro3
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		
		obj.show();
		obj.disp();
		
		/* Paths to reach bx using obj :
		1) obj -> show() -> bx
		2) obj -> disp() -> show() -> bx
		*/
	}
}