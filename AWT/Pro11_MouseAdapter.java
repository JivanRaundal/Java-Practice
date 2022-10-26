// MouseAdapter class :-

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

class MyMouseListener extends MouseAdapter
{
	Myframe frame;		//composition
	
	public MyMouseListener()
	{
		
	}
	public MyMouseListener(Myframe frame)
	{
		this.frame = frame;
	}
	
	//@Overriding methods
	public void mouseClicked(MouseEvent e)
	{
		frame.str = "Clicked at ("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();	
	}
	
	public void mouseDragged(MouseEvent e)
	{
		frame.str = "Dragged at ("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();	
	}
}

class Pro11_MouseAdapter
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		
		frame.addMouseListener(new MyMouseListener(frame));
		
		frame.addMouseMotionListener(new MyMouseListener(frame));
		
		frame.addWindowListener(new WindowCloser(frame));
	}
}