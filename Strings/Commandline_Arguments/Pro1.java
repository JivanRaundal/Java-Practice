/* # commandline arguments :-

0) Every commandline argument is treated as a string.
1) All the commandline arguments will be taken in program as string by JVM.
2) It scans all commandline arguments and creates their array which is actually array of strings.
*/

class Pro1
{
	public static void main(String args[])
	{
		System.out.println("\nNumber of commandline arguments = " + args.length);
		
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}