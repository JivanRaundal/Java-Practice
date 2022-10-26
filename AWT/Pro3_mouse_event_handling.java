/* # Mouse Event Handling :-

NOTE: -If event is generated, then their must be somebody who will listen your event. To listen events, we have to define Event Listeners.
      -Listeners are simply classes. 
NOTE: -(hindi) Konse event keliye konse function => java has already decided it and has given you all those functions in an interface 
       named 'MouseListener'
	  -For every event, there is a different method.
	  -Java says, I have connected each event with it's own method. You just have to override that method.
*/

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
	public MyFrame()
	{
		setSize(600,600);				//this.setSize(600,600);
		setTitle("MyFrame");
		setLocationRelativeTo(null);
		setBackground(Color.CYAN);
		setVisible(true);
	}
	
	//overriding paint() method (no need to call it explicitly, it is called automatically by thread)
	public void paint(Graphics g)
	{
		Font f = new Font("verdena", Font.BOLD | Font.ITALIC, 20);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("This is awt frame " + Thread.currentThread(), 30, 50);
		g.drawOval(30,90,80,80);
		g.drawRect(30,200,100,50);
	}
}

//Mouse Event Listener
class MyMouseListener implements MouseListener
{
	//overriding all methods of MouseListener class
	
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("mouse is clicked");
	}
	public void mousePressed(MouseEvent e)
	{
		System.out.println("mouse is pressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		System.out.println("mouse is released");
	}
	public void mouseEntered(MouseEvent e)
	{
		System.out.println("mouse is just entered the frame");
	}
	public void mouseExited(MouseEvent e)
	{
		System.out.println("mouse is just exited the frame");
	}
}

class Pro3_mouse_event_handling
{
	public static void main(String args[])
	{
		MyFrame frame = new MyFrame();
		MyMouseListener ml = new MyMouseListener();
		frame.addMouseListener(ml);
	}
}