// String Functions :-

class Pro24
{
	public static void main(String args[])
	{
		String str1,str2,res;
		boolean val;
		int ind;
		
		str1 = new String("hello");
		str2 = new String("hello");
		val = str1.equals(str2);
		System.out.println("\n" + val);
		
		val = "jivan".equalsIgnoreCase("JIVAN");
		System.out.println(val);
		
		//-----------------------------------------
		str1 = "this is Java.";
		str2 = "hello this from me";
		val = str1.regionMatches(0,str2,6,4);
		System.out.println("\n"+val);
		
		str1 = "This is Java.";
		val = str1.regionMatches(true,0,str2,6,4);
		System.out.println(val);
		
		//----------------------------------------
		val = str1.startsWith("this");
		System.out.println("\n" + val);
		
		val = str1.startsWith("is",2);
		System.out.println(val);
		
		//---------------------------------------
		val = str1.endsWith("va");
		System.out.println("\n"+val);
		
		val = str1.endsWith("ja");
		System.out.println(val);
		
		//--------------------------------------
		str1 = "apple";
		str2 = "cpple";
		System.out.println("\n" + str1.compareTo(str2));
		
		//--------------------------------------
		str1 = "chapple is mine, apple is yours.";
		ind = str1.indexOf("apple");
		System.out.println("\n"+ind);
		
		ind = str1.indexOf('i');
		System.out.println(ind);
		
		ind = str1.indexOf("apple",3);
		System.out.println(ind);
		
		//-------------------------------------
		ind = str1.lastIndexOf("apple");
		System.out.println("\n"+ind);
		
		ind = str1.lastIndexOf('i');
		System.out.println(ind);
		
		//------------------------------------
		str1 = "apple is mine, apple is yours.";
		res = str1.substring(6);
		System.out.println("\nres = " + res);
		System.out.println("str1 = " + str1);
		
		res = str1.substring(6,13);
		System.out.println("res = " + res);
		
		//-----------------------------------
		str1 = "apple is";
		str2 = " mine.";
		res = str1.concat(str2);
		System.out.println("\nstr1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("res = " + res);
		
		//---------------------------------
		str1 = "hello JIVAN, this is JAVA.";
		res = str1.toLowerCase();
		System.out.println("\ntoLowercase = " + res);
		res = str1.toUpperCase();
		System.out.println("toUpperCase = " + res);
		System.out.println("str1 = " + str1);
		
		//--------------------------------
		str1 = "     hello Jivan, this is Java.     ";
		res = str1.trim();
		System.out.println("\nres  = " + res);
		System.out.println("str1 = " + str1);
	}
}