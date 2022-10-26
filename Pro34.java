/* function overloading (compile time ploymorphism)

Note :-
	Java compiler follows following steps for function overloading :-
	1) Tries to find exact match
	2) If there is no exact match found. compiler tries to find match by performing some Implicit typecasting. (promotion only)
	3) If compiler does not find match in above 2 cases, then it generates error. In that case go for explicit typecasting.
	   (demotion mostly)
*/

class Pro34
{
	public static void main(String args[])
	{
		add(10);				//fun 1 by exact match
		add(2,3);				//fun 2 by exact match
		short x = 9;
		add(x);					//fun 1 by promotion (implicit typecasting)
		add('A');				//fun 1 by promotion (implicit typecasting)
		//add(3.5,4.5);			//error
		add((float)3.5,(float)4.5);		//fun 3 by demotion (explicit typecasting)
		add((int)3.5,(int)4.5);			//fun 2 by demotion (explicit typecasting)
	}
	
	static void add(int x)						//----(1)
	{
		System.out.println("in 1 int");
	}
	
	static void add(int x,int y)				//----(2)
	{
		System.out.println("in 2 int");
	}
	
	static void add(float x,float y)			//----(3)
	{
		System.out.println("in 2 float");
	}
	
	static void add(double x)					//-----(4)
	{
		System.out.println("in 1 double");
	}

}
	