// Q.16] replace java by CPP. do not use replace() or replaceAll()

class Que16
{
	public static void main(String args[])
	{
		String str = "JAVA is good. JAVA is so large. I like JAVA.";
		
		//we will use replaceFirst();
		while(str.contains("JAVA"))			//returns false if not contains
		{
			str = str.replaceFirst("JAVA","CPP");
		}
		System.out.println("\nModified String = " + str);
	}
}