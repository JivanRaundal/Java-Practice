/* # WindowListener interface :- 
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	public Myframe()
	{
		setSize(500,500);
		setTitle("Myframe");
		setLocationRelativeTo(null);
		setBackground(new Color(228, 106, 123));
		setVisible(true);
	}
}

class MyWindowListener extends WindowAdapter  	// OR implements WindowListener
{
	Myframe frame;
	
	public MyWindowListener()
	{
		
	}
	public MyWindowListener(Myframe ref)
	{
		frame = ref;
	}
	
	//Overriding method
	public void windowClosing(WindowEvent e)
	{
		//frame.setVisible(false);
		frame.dispose();
		//System.exit(0);
	}
}

class Pro9_WindowListener
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		
		/*MyWindowListener wl = new MyWindowListener(frame);
		frame.addWindowListener(wl); */
		
		frame.addWindowListener(new MyWindowListener(frame));
	}
}