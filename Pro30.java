// Functions :-

class Pro30
{
	public static void main(String args[])
	{
		int x,y;
		x = 10;
		y = 5;
		
		add(x,y);				//Actual parameters
		add(23,45);
		add(x+y,2);
		add(25,y);
	}
	
	public static void add(int a,int b)		//Formal parameters
	{
		int ans;
		ans = a + b;
		System.out.println("\nAddition = " + ans + "\n");
	}
}