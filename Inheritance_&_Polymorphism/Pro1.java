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

class Parent
{
	private void scan()			//not inherited
	{
		System.out.println("In Parent scan()");
	}
	
	public void show()
	{
		System.out.println("In Parent show()");
	}
}

class Child extends Parent
{
	public void print()
	{
		System.out.println("In Child print()");
	}
}

class Pro1
{
	public static void main(String args[])
	{
		Child obj = new Child();
		obj.print();
		obj.show();				//valid due to Inheritance
		//obj.scan();				//error, scan() is private & not Inherited
	}
}
