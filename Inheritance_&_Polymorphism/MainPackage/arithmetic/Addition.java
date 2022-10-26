/* Note : When you define your own package, define every class in different .java file where ClassName & filename should be same and your class
          must be public.
*/

package arithmetic; 					//we use it just to mention that our class belongs to which package.

public class Addition					//class should be public always if you want to import it 
{
	public void addition(int a,int b)	//public : accessible in different package also
	{
		System.out.println("\nAddition = " + (a+b));
	}
	
	protected void sum(int a,int b)		//protected members are accessible outside the package only in derived class
	{
		System.out.println("\nSum = " + (a+b));
	}
}