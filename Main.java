
import java.util.*;

class A
{
	public static void show()
	{
		System.out.println("static method called");
	}
}

class Main
{
	public static void main(String args[])
	{
		A obj = null;
		obj.show();
	}
}