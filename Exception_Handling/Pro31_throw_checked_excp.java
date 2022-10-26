/*
# Difference between throw & throws :
1) throw  : Actually throws an exception.
2) throws : Just satisfies the compiler and apply restrictions in case of checked exceptions.

Note: we can throw checked  exceptions also using 'throw' keyword.
*/

// eg:

import java.io.*;

class Pro31_throw_checked_excp
{
	public static void main(String args[]) throws InterruptedException
	{
		InterruptedException ie = new InterruptedException();
		throw ie;					//error: unreported exception InterruptedException; must be caught or declared to be thro
	}
}