/* # Different method to scan values from user.

- Using 'InputStreamReader' class & 'BufferedReader' class.

1) InputStreamReader => can scan only char by char. Does not have buffer concept. Hence not able to scan large data in one shot.
2) BufferedReader => Has 'readLine()' method to scan whole string. Has buffer concept, Hence large data can be scanned in one shot.
Note :- Both classes belongs to 'io' package. Hence import java.io.*;

-SYNTAX :	InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bfr    = new BufferedReader(isr);
			
-readLine() => non-static method of BufferedReader class. Reads a string from user. and we have to use this method to scan all types
               of data from user.

-Note :- If you entered number, then also readLine() will scan it as a string. To convert String into integer or into any premitive type,
         we have to use 'Integer,parseInt()' method fro converting string into integer. It is static method.
		 Similarly,  double x = Double.parseDoule(str);
				 	 Float  y = Float.parseFloat(str);  ..and so on 	
*/

//import java.io.InputStreamReader;
//import java.io.BufferedReader;
import java.io.*;

class Pro38_InputStreamReader
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);
		
		String str1, str2;
		System.out.println("\nEnter String 1 : ");
		str1 = bfr.readLine();
		System.out.println("Enter String 2 : ");
		str2 = bfr.readLine();
		
		System.out.println("\nString 1 = " + str1);
		System.out.println("String 2 = " + str2);
	}
}