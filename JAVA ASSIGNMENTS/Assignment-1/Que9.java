// Q.9] WAP to check if given number is pallindrome or not. (while)

import java.util.*;

class Que9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num,original,reverse=0,remainder;
		
		System.out.println("\nEnter number : ");
		num = sc.nextInt();
		original = num;
		
		//reverse number is stored in reverse variable
		while(num != 0)
		{
			remainder = num%10;
			reverse = reverse * 10 + remainder;
			num = num/10;
		}
		
		//number is pallindrome if original number & reverse number are equal
		if(original == reverse)
		{
			System.out.println("\n" + original + " is a pallindrome");
		}
		else
		{
			System.out.println("\n" + original + " is not a pallindrome");
		}
	}
}