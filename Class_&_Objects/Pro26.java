/* # static datamembers :-

1) static datamembers does not belong to any object, they work for the whole class.
2) memory does not get allocated on per object basis.
3) Only one copy of static datamember gets created for whole class. Hence, all objects access that single copy & changes made by
   one object are visible to other objects also.
4) static & access-specifier does not affect each other's meaning.
5) To access static  datamember in non-member function, use ClassName & .(dot) operator. eg- Number.x = 10;
6) You can access static datamember using object name & .(dot) operator also, without change in the meaning.
*/

class Number
{
	public int x;				//non-static datamember
	public static int y;		//static datamember
}

class Pro26
{
	public static void main(String args[])
	{
		Number T1,T2,T3;
		T1 = new Number();
		T2 = new Number();
		T3 = new Number();
		
		T1.x = 10;
		Number.y = 20;				//accessing static datamember in non-member function using ClassName & (.)dot operator
		System.out.println("\nx = " + T1.x + "\ty = " + Number.y);		//10 20
		
		T2.x = 50;
		T2.y = 50;					//accessing static datamember using object name & (.)dot operator
		
		System.out.println("\nx = " + T3.x + "\ty = " + T3.y);			//0 50
	}
}