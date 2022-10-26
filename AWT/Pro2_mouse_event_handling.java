/* # Mouse Event Handling :-

NOTE: -If event is generated, then their must be somebody who will listen your event. To listen events, we have to define Event Listeners.
      -Listeners are simply classes. 
NOTE: -(hindi) Konse event keliye konse function => java has already decided it and has given you all those functions in an interface 
       named 'MouseListener'
	  -For every event, there is a different method.
	  -Java says, I have connected each event with it's own method. You just have to override that method.
*/

import java.awt.*;
//import java.awt.event.MouseListener;
import java.awt.event.*;

class Myframe extends Frame
{
	public Myframe()
	{
		this.setSize(500,500);
		this.setTitle("Myframe");
		this.setLocationRelativeTo(null);
		this.setBackground(Color.CYAN);					//Color is class & color_names are static datamembers of Color class
		this.setVisible(true);
	}
	
	public void paint(Graphics g)						//overriden method
	{
		//SYNTAX => Font f = new Font("font_name", font_styles, font_size_in_pixels);
		Font f = new Font("times new roman", Font.BOLD | Font.ITALIC, 20);		//you can use Bitwise | (or) for multiple font styles
		//Note=> we have to pass Font class object as a paramete to setFont() method of Graphics class
		g.setFont(f);
		
		//SYNTAX => g.setColor(Color.color_name);			//Note => Color is class & color_name is static datamember of it
		g.setColor(Color.red);
		
		//SYNAX => g.drawString(string, x_coordinate, y_coordinate);
		g.drawString("This is awt Frame " + Thread.currentThread().getName(), 30, 50);
		
		//SYNTAX => g.drawOval(x_coordinate, y_coordinate, width, height);
		g.drawOval(30,90,80,80);
		
		//g.drawLine(10,15,800,700);
		g.drawRect(100,200,20,40);
	}
}

//defining Mouse Event Listener
class MyMouseListener implements MouseListener
{
	//override all methods from MouseListener interface
	
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
		System.out.println("mouse just entered the frame");
	}
	public void mouseExited(MouseEvent e)
	{
		System.out.println("mouse just exited the frame");
	}
}

class Pro2_mouse_event_handling
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		MyMouseListener ml = new MyMouseListener();		//create object of mouse listener class & pass it to addMouseListener() method
		frame.addMouseListener(ml);						//addMouseListener() method will connect your Mouse Event Listener with frame
	}
}