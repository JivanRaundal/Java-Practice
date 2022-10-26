// Q.15] check how many times ram is present

class Que15
{
	public static void main(String args[])
	{
		String str = "ramaramaraaramaramararaamram";
		
		//check how many times ram is present in string
		int count=0, ind = -1;
		while(true)
		{
			ind = str.indexOf("ram",ind+1);
			if(ind == -1)		//indexOf() method will reurn -1 if string not found
			{
				break;
			}
			count++;
		}
		
		System.out.println("\ncount = " + count);
	}
}

