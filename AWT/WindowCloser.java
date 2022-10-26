/* # CommonWindowListener class :-

*/

import java.awt.*;
import java.awt.event.*;

public class WindowCloser extends WindowAdapter
{
	Frame frame;
	
	public WindowCloser()
	{
		
	}
	public WindowCloser(Frame ref)
	{
		frame = ref;
	}
	
	//Overriding methods
	public void windowClosing(WindowEvent e)
	{
		frame.dispose();
	}
}