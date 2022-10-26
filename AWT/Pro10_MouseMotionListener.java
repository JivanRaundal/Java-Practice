// MouseMotionListener interface :- (Used to handle drag & move events)

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{
	String str;
	int x,y;
	
	public Myframe()
	{
		this.setSize(500,500);
		this.setTitle("Myframe");
		this.setLocationRelativeTo(null);
		this.setBackground(new Color(80, 16, 102));
		this.setVisible(true);
		str = " ";
		x = 50;
		y = 50;
	}
	
	public void paint(Graphics g)
	{
		g.setFont(new Font("times new roman", Font.BOLD, 20));
		g.drawString(str, x, y);
	}
}

class MyMouseMotionListener implements MouseMotionListener 		// OR implements MouseAdapter
{
	Myframe frame;
	
	public MyMouseMotionListener()
	{
		
	}
	public MyMouseMotionListener(Myframe ref)
	{
		frame = ref;
	}
	
	//@Overriding methods
	public void mouseDragged(MouseEvent e)
	{
		frame.str = "Dragged at ("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		frame.str = "Moved at ("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();	
	}
}

class Pro10_MouseMotionListener
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		frame.addMouseMotionListener(new MyMouseMotionListener(frame));
		
		frame.addWindowListener(new WindowCloser(frame));
	}
}
