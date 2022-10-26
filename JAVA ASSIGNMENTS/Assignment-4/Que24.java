// Q. Scan a binary of number from user in String format. convert this binary into decimal format.

import java.util.Scanner;

class Que24
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String binary;
		System.out.println("\nEnter binary of number : ");
		binary = sc.next();									//space seperated string is not allowed
		
		//to reverse string we are using StringBuilder class method reverse() hence convert String into StringBuilder
		StringBuilder str = new StringBuilder(binary);
		str.reverse();
		
		//again converting SringBuilder into string
		binary = str.toString();
		
		//System.out.println(binary);
		
		//find it's decimal number
		int i,num=0;
		for(i=0; i<binary.length(); i++)
		{
			if(binary.charAt(i) == '1')
			{
				num = num + (int)Math.pow(2,i);					//Math.pow() returns double value hence typecasting into 'int'
			}
		}
		
		System.out.println("\nDecimal = " + num);
	}
}