/* Labeling blocks :

 Note :- In java, we can Label blocks. i.e. can give naming/labeling to blocks.
 */
 
 class Pro36
 {
	public static void main(String args[])
	{
		B1:										//labeling blocj
		{
			B2:									//labeling block
			{
				System.out.println("Inner block B2");
			}
			System.out.println("Inner block B1");
		}
		System.out.println("Outer block");
	}
 }