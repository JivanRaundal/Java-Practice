// JIVAN's CODE :-

import java.util.*;

class InfyTQ_Q
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter string : ");
		String inputString = sc.nextLine();
		String res = "";			//result string
		
		char[] vowels = new char[inputString.length() + 1];
		char[] consonants = new char[inputString.length() + 1];
		
		int v = 0;			//vowels array index
		int c = 0;			//consonants array index
		for(int i=0; i<inputString.length(); i++)
		{
			char ch = inputString.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowels[v] = ch;
				v++;
			}
			else
			{
				consonants[c] = ch;
				c++;
			}
		}
		
		//now, sorting vowels array & consonants array using inbuilt sort function of Arrays class
		Arrays.sort(vowels);
		Arrays.sort(consonants);
		
		int indVowels = 0;
		int indConsonants = 0;
		while(vowels[indVowels] == 0)
		{
			indVowels++;
			if(indVowels == vowels.length)
				break;
		}
		while(consonants[indConsonants] == 0)
		{
			indConsonants++;
		}
		
		String temp1, temp2;
		if(indVowels == vowels.length)
		{
			//means, no vowels 
			temp1 = "NA";
		}
		else
		{
			temp1 = new String(vowels);
		}
		temp2 = new String(consonants);
		
		int firstChar = 0;
		int lastChar = 0;
		String vowelStr;
		if(temp1.equals("NA"))
		{
			vowelStr = temp1;
			firstChar = -1;
		}
		else
		{
			vowelStr = temp1.substring(indVowels, temp1.length());
			firstChar = inputString.indexOf(vowelStr.charAt(0));
		}
		String consonantStr = temp2.substring(indConsonants, temp2.length()-1);
		lastChar = inputString.lastIndexOf(consonantStr.charAt(consonantStr.length()-1));
		
		res = vowelStr + String.valueOf(firstChar) + consonantStr + String.valueOf(lastChar);	
		
		System.out.println("\nRequired Result = " + res);
	}
}




// ASHWIN's CODE :-

/*
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class InfyTQ_Q
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
         Scanner s = new Scanner(System.in);
		 System.out.print("\nEnter String : ");
        String inputString = s.nextLine();
         String answer="";
        char[] inputChar=inputString.toCharArray();
        
        char[] inputVowels=new char[inputString.length()+1];
        char[] inputCons=new char[inputString.length()+1];
        int v=0;
        int c=0;
        for(int i=0;i<inputString.length();i++)
        {
            char cur=inputString.charAt(i);
            if(cur=='a'||cur=='e'||cur=='i'||cur=='o'||cur=='u')
            {
                inputVowels[v]=cur;
                v++;
            }
            else
            {
                inputCons[c]=cur;
                c++;
            }
        }
   
        if(inputVowels[0]==0)
        {
           answer+="NA-1";
        }
        else
        {
        
            Arrays.sort(inputVowels);
            int noNulls=0;
            while(inputVowels[noNulls]==0)
            {
                noNulls++;
            }
                char firstChar=inputVowels[noNulls];
            answer+=String.valueOf(inputVowels);
            
            
            for(int i=0;i<inputString.length();i++)
            {
                char cur=inputString.charAt(i);
                if(cur==firstChar)
                {
                    answer+=""+i;
                    break;
                }
            }
            
        }
        
        if(inputCons[0]==0)
        {
            answer+="NA-1";
        }
        else
        {
            
            Arrays.sort(inputCons);
            int noNulls=0;
            while(inputCons[noNulls]==0)
            {
                noNulls++;
            }
            char firstChar=inputCons[inputCons.length-1];
            
            answer+=String.valueOf(inputCons);
           // System.out.println(String.valueOf(inputCons));
            
            
            
            int lastPos=0;
            for(int i=0;i<inputString.length();i++)
            {
                char cur=inputString.charAt(i);
                //System.out.println(cur+" ---fC  "+firstChar);
                if(cur==firstChar)
                {
                   lastPos=i;
                }
            }
            answer+=""+lastPos;
            
        }
        
        System.out.println(answer);
    }
}

*/