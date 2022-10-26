// Q.12] Keep Scanning a string from user until user enters '?'.

import java.util.*;

class Que12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("\nKeep entering string OR enter '?' to stop : ");
		
		while(true)
		{
			str = sc.nextLine();
			if(str.charAt(0) == '?')
			{
				break;
			}
			//System.out.println(str);
		}
	}
}
