/* # commandline arguments :-

0) Every commandline argument is treated as a string.
1) All the commandline arguments will be taken in program as string by JVM.
2) It scans all commandline arguments and creates their array which is actually array of strings.
*/

class Pro2_add
{
	public static void main(String args[])
	{
		System.out.println("\nNumber of commandline arguments = " + args.length);
		
		int x,y,z;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		z = Integer.parseInt(args[2]);
		
		int sum = x + y + z;
		System.out.println("\nAddition = " + sum);
	}
}