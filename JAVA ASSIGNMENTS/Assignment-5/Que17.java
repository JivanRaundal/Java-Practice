/* Q.17] WAP to check which of following exceptions are checked or unchecked.
		 -NullPointerException
		 -RuntimeException
		 -Exception
		 -IOException
		 
Note :- exception for which compiler gives error on throwing is Checked exception else it is Unchecked exception 
*/

import java.io.*;

class Que17
{
	public static void main(String args[])
	{
		//NullPointerException ne = new NullPointerException();		//Unchecked exception
		//throw ne;	

		//RuntimeException re = new RuntimeException();				//Unchecked exception
		//throw re;
		
		//Exception e = new Exception();							//Checked exception
		//throw e;
		
		IOException ie = new IOException();							//Checked exception
		throw ie;
	}
}