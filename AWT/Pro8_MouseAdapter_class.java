/* # MouseAdapter class :- 
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
		setBackground(new Color(228, 106, 123));
		setVisible(true);
		str = " ";
		x = 50;
		y = 50;
	}
	
	public void paint(Graphics g)				//Overriden method
	{
		g.setFont(new Font("times new roman", Font.BOLD, 20));
		g.drawString(str, x, y);
	}
}

class MyMouseListener extends MouseAdapter
{
	Myframe frame;
	
	public MyMouseListener()
	{
		
	}
	public MyMouseListener(Myframe temp)
	{
		frame = temp;
	}
	
	//Overriding methods
	public void mouseClicked(MouseEvent e)
	{
		frame.str = "Clicked at ("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();
	}
	
	public void mouseDragged(MouseEvent e)
	{
		frame.str = "Dragged ("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();
	}
}

class Pro8_MouseAdapter_class
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		
		/*MyMouseListener ml = new MyMouseListener(frame);
		frame.addMouseListener(ml);*/
		
		frame.addMouseListener(new MyMouseListener(frame));
		
		frame.addMouseMotionListener(new MyMouseListener(frame));
		
		//To close window we will use CommonWindowListener class i.e. WindowCloser
		/*WindowCloser wc = new WindowCloser(frame);
		frame.addWindowListener(wc); */
		frame.addWindowListener(new WindowCloser(frame));
	}
}