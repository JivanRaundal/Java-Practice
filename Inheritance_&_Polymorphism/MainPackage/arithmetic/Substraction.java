/* Note : When you define your own package, define every class in different .java file where ClassName & filename should be same and your class
          must be public.
*/

package arithmetic; 					//we use it just to mention that our class belongs to which package.

public class Substraction				//class should be public if want to import it
{
	void substraction(int a,int b)		//default member function : not accessible outside the package
	{
		System.out.println("\nSubstraction = " + (a-b));
	}
}