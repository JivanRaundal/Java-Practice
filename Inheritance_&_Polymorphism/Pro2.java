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
*/

class Base
{
	int bx = 70;
	
	void show()
	{
		System.out.println("\nIn Base show() bx = " + bx);
	}
}

class Derive extends Base
{
	int dx = 90;
	
	void disp()
	{
		System.out.println("\nIn Derive disp() dx = " + dx + " bx = " +  bx);
	}
}

class Pro2
{
	public static void main(String args[])
	{
		Derive obj = new Derive();
		
		obj.show();
		obj.disp();
		obj.dx = 10;
		obj.bx = 20;
		System.out.println("\nobj.dx = " + obj.dx + "\tobj.bx = " + obj.bx);
	}
}