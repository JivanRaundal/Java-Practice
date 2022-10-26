// Code to get List of all Fonts :-

import java.awt.*;

class Pro20_all_fonts_list
{
	public static void main(String args[])
	{
		String fontlist[];
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		fontlist = ge.getAvailableFontFamilyNames();
		
		for(String s : fontlist)
		{
			System.out.println(s);
		}
	}
}