// Functions returning objects :-

// Note :- When we return object from function, we actually return it's reference from function.

class Number
{
	int x;	//default access-specifier 
	int y;
}

class Pro11
{
	public static void main(String args[])
	{
		Number obj,var;
		
		obj = createObject();
		var = createObject();
		
		printObject(obj);
		printObject(var);
	}
	
	static Number createObject()
	{
		Number ref;
		ref = new Number();
		ref.x = 10;
		ref.y = 20;
		return ref;			//will return reference of object
	}
	
	static void printObject(Number T)
	{
		System.out.println("x = " + T.x + "\ty = " + T.y);
	}
}