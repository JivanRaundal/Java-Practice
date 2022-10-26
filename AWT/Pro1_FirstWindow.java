// # Creating First Window using AWT (Abstract Window Toolkit) :-

//NOTE: We have to use inbuilt class Frame from awt package in java.

import java.awt.*;

public class Pro1_FirstWindow
{
	public static void main(String args[])
	{
		Frame obj = new Frame();				//creating Frame class object
		
		obj.setVisible(true);					//boolean value is passed as a parameter
		obj.setSize(500,500);					//pixels are passed as a parameter
		obj.setTitle("MyFirstWindow");			//title(string) is passed as a parameter
		obj.setLocationRelativeTo(null);		//will setLocationRelativeTo screen (null => means set location of Frame at center)
	}
}