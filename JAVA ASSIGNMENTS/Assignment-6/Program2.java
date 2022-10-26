// 

import java.awt.*;
import java.awt.event.*;

class Myframe2 extends Frame 
{
	String str;
	int x,y;
	
	public Myframe2()
	{
		setSize(600,600);
		setTitle("Myframe1");
		setLocationRelativeTo(null);
		setVisible(true);
		str = "click anywhere in window";
		x = 50;
		y = 70;
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("verdena",Font.BOLD,35));
		g.setColor(Color.red);
		g.drawString(str, x, y);
	}
}

class MyMouseListener2 extends MouseAdapter
{
	Myframe2 frame;
	
	public MyMouseListener2()
	{
		
	}
	public MyMouseListener2(Myframe2 ref)
	{
		frame = ref;
	}
	
	//@Overriden method
	public void mouseClicked(MouseEvent e)
	{
		frame.str = "("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();
	}
}

class Program2
{
	public static void main(String args[])
	{
		Myframe2 frame = new Myframe2();
		frame.addMouseListener(new MyMouseListener2(frame));
		frame.addWindowListener(new WindowCloser(frame));
	}
}
