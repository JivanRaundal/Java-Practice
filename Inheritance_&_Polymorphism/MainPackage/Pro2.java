
import arithmetic.*;		//Note : we use import statement to use classes from different packages.

public class Pro2 extends Addition
{
	public static void main(String args[])
	{
		Addition obj = new Addition();
		obj.addition(5,6);
		
		Substraction var = new Substraction();
		//var.substraction(20,10); 			//ERROR
		/* Reason : substraction() is getting called from outside the package. So, this statement will generate error, BCZ substraction() method
		            is default, and default members are not accessible outside the package. Even if their is Inheritance, default members are
					not accessible in different package.
		*/
		
		//obj.sum(4,2);		//error: sum(int,int) has protected access in Addition
		
		// Note : protected members are accessible outside the package only in Derived class using object of that Derive class.
		Pro2 temp = new Pro2();		//object of Derive class
		temp.sum(4,2);				//valid due to Inheritance
		
	}
}