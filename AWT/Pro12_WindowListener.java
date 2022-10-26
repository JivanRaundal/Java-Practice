// WindowListener interface :-

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	public Myframe()
	{
		setSize(500,500);
		setTitle("Jivan");
		setLocationRelativeTo(null);
		setBackground(Color.CYAN);
		setVisible(true);
	}
}

class MyWindowListener extends WindowAdapter 		// implements WindowListener
{
	Myframe frame;
	
	public MyWindowListener()
	{
		
	}
	public MyWindowListener(Myframe ref)
	{
		frame = ref;
	}
	
	//@Overriden method
	public void windowClosing(WindowEvent e)
	{
		//frame.setVisible(false);
		frame.dispose();
	}
}

class Pro12_WindowListener
{
	public static void main(String args[])
	{
		Myframe obj = new Myframe();
		MyWindowListener wl = new MyWindowListener(obj);
		obj.addWindowListener(wl);
	}
}