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

import java.io.*;

class Pro39_InputStreamReader
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    bfr = new BufferedReader(isr);
		
		String str1, str2;
		System.out.print("\nEnter integer : ");
		str1 = bfr.readLine();
		System.out.print("Enter integer : ");
		str2 = bfr.readLine();
		
		//converting String into integer
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		
		int add = x + y;
		System.out.println("\nAddition of " + x + " & " + y + " = " + add);
		
		//------------------------------------------------------
		System.out.print("\nEnter double value : ");
		str1 = bfr.readLine();
		System.out.print("Enter double value : ");
		str2 = bfr.readLine();
		
		//converting String into double
		double a = Double.parseDouble(str1);
		double b = Double.parseDouble(str2);
		
		double res = a + b;
		System.out.println("\nAddition of " + a + " & " + b + " = " + res);
		
		//-------------------------------------------------------
		System.out.print("\nEnter float value : ");
		str1 = bfr.readLine();
		System.out.print("Enter float value : ");
		str2 = bfr.readLine();
		
		//converting String into float
		float p = Float.parseFloat(str1);
		float q = Float.parseFloat(str2);
		
		float ans = p + q;
		System.out.println("\nAddition of " + p + " & " + q + " = " + ans);
		
		//-------------------------------------------------------
		System.out.print("\nEnter short value : ");
		str1 = bfr.readLine();
		System.out.print("Enter short value : ");
		str2 = bfr.readLine();
		
		//converting String into short
		short m = Short.parseShort(str1);
		short n = Short.parseShort(str2);
		
		short ANS = (short)(m + n);
		System.out.println("\nAddition of " + m + " & " + n + " = " + ANS);
		
		//-------------------------------------------------------
		System.out.println("\nEnter boolean value : ");
		str1 = bfr.readLine();
		
		//converting strin into boolean
		boolean val = Boolean.parseBoolean(str1);
		
		System.out.println("\nboolean value = " + val);
	}
}