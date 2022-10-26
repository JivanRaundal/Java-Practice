// CommoWindowCloser class :-

import java.awt.*;
import java.awt.event.*;

public class WindowCloser extends WindowAdapter
{
	Frame frame;
	
	public WindowCloser()
	{
		
	}
	public WindowCloser(Frame frame)
	{
		this.frame = frame;
	}
	public void windowClosing(WindowEvent e)		//@Overriden
	{
		//frame.dispose();
		System.exit(0);
	}
}