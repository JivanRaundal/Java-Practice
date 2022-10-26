/* # 'this' reference variable :- (same as this pointer in c++)

Theory :-
1) this reference variable stores reference of calling object automatically.
2) Need of this reference? => when non-static member function contain local variables having same name as that of datamembers, the 
   priority is given to local variables always.
   In this case, to access datamembers we have to use 'this' reference variable.
3) this reference variable is inbuilt, you don't need to declare & initialize it.
4) It automatically get's initialized with the reference of calling object.
5) We cannot use this reference variable in static functions. BCZ no any calling object is available in static function.
6) We cannot initialize this reference variable manually. eg- this = new Number();		//error
7) this reference variable is also used to return the reference of calling object from non-static member function.
*/

 /*
 Need of this reference? => when non-static member function contain local variables having same name as that of datamembers, the 
							priority is given to local variables always.
							In this case, to access datamembers we have to use 'this' reference variable.
*/

class Number
{
	public int x,y;
	
	public void set(int x,int y)
	{
		//here, priority is given to local var & not datamembers, to differentiate betn local var & datamember, we use this reference.
		this.x = x;				
		this.y = y;
		
		//this = new Number();	//error, we cannot initialize this reference manually.
	}
		
	public void show()
	{
		System.out.println("\nx = " + x + "\ty = " + y);
	}
}

class Pro46
{
	public static void main(String args[])
	{
		Number obj = new Number();
		obj.set(5,10);
		obj.show();					//x = 5		y = 10
	}
}