// Q.9] WAP to explain use of break other than with loop & switch case;

// Note :- break statement is also used to break inner block in JAVA.
//		   SYNTX :- break blockname;    (we can label blocks in JAVA)


class Que9
{
	public static void main(String args[])
	{
		int x = 10;
		
		B1:
		{
			B2:
			{
				if(x == 10)
				{
					break B2;				//will break block B2
				}
				System.out.println("Inner block B2");
			}
			System.out.println("Inner block B1");
		}
		System.out.println("Outer block main()");
	}
}