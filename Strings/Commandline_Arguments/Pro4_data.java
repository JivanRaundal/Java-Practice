/* # commandline arguments :-

0) Every commandline argument is treated as a string.
1) All the commandline arguments will be taken in program as string by JVM.
2) It scans all commandline arguments and creates their array which is actually array of strings.
*/

// Note :- If you want to give space seperated string eg for name, then mentioned that string in " ". else space seperated string will
//         be considered as two different strings.  eg :- "Jivan Raundal"

class Pro4_data
{
	public static void main(String args[])
	{
		System.out.println("\nNumber of commandline arguments = " + args.length);
		
		String name;
		int age;

		name = args[0];
		age = Integer.parseInt(args[1]);
		
		System.out.println("\nName = " + name + "\tAge = " + age);
	}
}