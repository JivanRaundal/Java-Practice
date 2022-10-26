// Q. Scan a String from user. Replace all occurences of JAVA by CPP. Do not use replace() and replaceAll() functions.

import java.util.Scanner;

class Pro36_Q
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("\nEnter String : ");
		str = sc.nextLine();
		
		String S1,S2;
		System.out.print("\nEnter old substring to be replaced : ");
		S1 = sc.nextLine();
		System.out.print("Enter new substring to be replaced : ");
		S2 = sc.nextLine();
		
		//str = "This is java. I like java. java is good.";
		//_replace(str,"java","cpp");
		_replace(str,S1,S2);			//_replace(str, source_str, target_str);
	}
	
	static void _replace(String str,String source,String target)
	{
		int ind=-1,i,j;
		char arr[] = str.toCharArray();
		String res;
		while(str.contains(source))
		{
			ind = str.indexOf(source,ind+1);
			if(ind != -1)
			{
				int l1 = source.length();
				int l2 = target.length();
				int len = l1-l2;
				if(len > 0)
				{	
					//left shift
					for(int k=1; k<=len; k++)
					{
						for(i=ind; i<arr.length-1; i++)
						{
							arr[i] = arr[i+1];
						}
					}
					//adding blank spaces at end
					for(i=(arr.length)-len; i<arr.length; i++)
					{
						arr[i] = ' ';
					}
				}
				else if(len < 0)
				{
					int l = arr.length + 2;
					char temp[] = new char[l + (-len)];				// - - => +
					arr = _copy(arr,temp);
					
					//right shift
					for(int k=1; k<=(-len); k++)
					{
						for(i=(arr.length-1)-k; i>ind; i--)
						{
							arr[i+1] = arr[i];
						}	
					}
				}
				
				i=ind;
				while(i<(ind+target.length()))
				{
					for(j=0; j<target.length(); j++)
					{
						arr[i] = target.charAt(j);
						i++;
					}
				}
				
				str = new String(arr);
			}
		}
		
		System.out.println("\nModified String = " + str);
	}
	
	static char[] _copy(char source[], char target[])		//will copy arr into target & again arr will refer to target to avoid 'ArrayIndexOutOfBoundsException'
	{
		int i;
		for(i=0; i<source.length; i++)
		{
			target[i] = source[i];
		}
		for(i=source.length; i<target.length; i++)
		{
			target[i] = ' ';
		}
		//source = target;
		return target;
	}
} 