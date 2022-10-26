/* Mouse Listener :-

Note :- 'MouseEvent' class stores information related to event. It has some inbuilt methods like getX(), getY().

Note :- To call 'paint()' method explicitly, you have to call 'repaint()' method. You cannot call 'paint()' method directly. 
		Treat repaint() method as a member function of class whose paint() method you want to call.
		It is because of thread. (refer notebook)
		
Note :- You can also pass RGB values to Color class Constructor.
        eg- new Color(R,G,B);
		    frame.setBackground(new Color(0,133,249));
*/

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	String str;
	int x,y;
	
	public Myframe()
	{
		setSize(500,500);
		setTitle("Myframe");
		setLocationRelativeTo(null);
		//setBackground(Color.CYAN);
		setBackground(new Color(0,133,249));
		setVisible(true);
		str = "Hello World";
		x = 50;
		y = 50;
	}
	
	public void paint(Graphics g)
	{
		g.setFont(new Font("times new roman", Font.BOLD, 20));
		g.drawString(str, x, y);
	}
}

class MyMouseListener implements MouseListener
{
	Myframe temp;
	
	public MyMouseListener()
	{
		
	}
	public MyMouseListener(Myframe ref)
	{
		temp = ref;
	}
	
	//overiding all methods of interface MouseListener
	public void mouseClicked(MouseEvent e)
	{
		temp.x = e.getX();
		temp.y = e.getY();
		temp.str = "Clicked at (" + temp.x + "," + temp.y + ")";
		//Note :- we can't call paint() method explicitly, to call paint(), we have to call 'repaint()' method
		temp.repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
}

class Pro4_repaint
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		MyMouseListener ml = new MyMouseListener(frame);
		frame.addMouseListener(ml);
	}
}