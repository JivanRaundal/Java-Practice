// Passing Object as a Parameter :-

/*
Note :- -When we pass object as a parameter to function, we actually pass reference of the object to function.
		-As the reference of object becomes available in called function, changes made in the object from called function becomes
		 visible in calling function also.
*/

class Demo
{
	int x = 10;	//default
	int y = 5;	//default
	
	public void show()				//non-static mem-fun of class Demo but non-mem-fun for class Pro10
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Pro10
{
	public static void main(String args[])		//static mem-fun of class Pro10 but non-mem-fun for class Demo
	{
		Demo obj = new Demo();
		obj.show();
		
		myfun(obj);				//passing obj as a actual parameter
		
		obj.show();
	}
	static void myfun(Demo ref)				//formal parameter | static mem-fun of class Pro10
	{
		ref.x = 9;
		ref.y = 27;
	}
}