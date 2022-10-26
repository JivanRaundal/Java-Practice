
import java.util.*;

class Pro40_myth
{
	public static void main(String[] args)
	{
		int a=2,b=6,c=15;
		System.out.println(++c + a - b - a + c++);
		
		for(int i=1; i<=10; i/2)			//error, bcz it is not a valid declaration of for loop
		{
			System.out.println(i);
		}
		System.out.println("Loop Terminated");
	}
}