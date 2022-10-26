// Q.14] substring() function

class Que14
{
	public static void main(String args[])
	{
		String str = "Hello this is main string in Java";
		
		String substr = str.substring(11);		//will create another string starting from 11th index upto end in calling string & returns the reference of new one
		System.out.println("str.substring(11) = " + substr);
		
		String S = str.substring(11,20);		//will consider from 11 to 19th index only
		System.out.println("str.substring(11,20) = " + S);
	}
}