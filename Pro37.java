/* Labeling blocks : Using break to break out of Inner block/scope.

 Note :- In java, we can Label blocks. i.e. can give naming/labeling to blocks.
 
	break :- break is also used to break Inner blocks in Java. (Note - only inner blocks & not function)
		     Syntax :-
					{
						break label_name;
					}
 */
 
 class Pro37
 {
	public static void main(String args[])
	{
		int x = 10;
		B1:										//labeling blocj
		{
			B2:									//labeling block
			{
				//break B2;				//if you write this statement above below code, will get => error : unreachable statement
				if(x == 10)
				{
					break B2;			//B2 block ka execution stop karo & start execution from next instruction of B2 block.
					//break B1;
				}
				System.out.println("Inner block B2");
			}
			System.out.println("Inner block B1");
		}
		System.out.println("Outer block");
	}
 }