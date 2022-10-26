// 

import java.awt.*;
import java.awt.event.*;

class Myframe1 extends Frame 
{
	String str;
	
	public Myframe1()
	{
		setSize(600,600);
		setTitle("Myframe1");
		setLocationRelativeTo(null);
		setVisible(true);
		str = "click anywhere in window";
	}
	public void paint(Graphics g)
	{
		g.drawString(str,50,70);
	}
}

class MyMouseListener1 implements MouseListener
{
	Myframe1 frame;
	
	public MyMouseListener1()
	{
		
	}
	public MyMouseListener1(Myframe1 ref)
	{
		frame = ref;
	}
	
	//@Overriden methods
	public void mouseClicked(MouseEvent e)
	{
		frame.str = "Mouse clicked at("+e.getX()+","+e.getY()+")";
		frame.repaint();
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

class Program1
{
	public static void main(String args[])
	{
		Myframe1 frame = new Myframe1();
		frame.addMouseListener(new MyMouseListener1(frame));
		frame.addWindowListener(new WindowCloser(frame));
	}
}
