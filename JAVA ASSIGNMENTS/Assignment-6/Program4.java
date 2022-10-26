
import java.awt.*;
import java.awt.event.*;

class Myframe4 extends Frame
{
	String str;
	int x,y;
	
	public Myframe4()
	{
		str = "click anywhere in window";
		x = 55;
		y = 100;
		setSize(600,600);
		setTitle("Program4");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("verdena", Font.BOLD, 20));
		g.setColor(Color.red);
		g.drawString(str, x, y);
	}
}

class MyMouseMotionListener4 implements MouseMotionListener
{
	Myframe4 frame;
	
	public MyMouseMotionListener4()
	{
		
	}
	public MyMouseMotionListener4(Myframe4 temp)
	{
		frame = temp;
	}
	
	//@Overriden methods
	public void mouseDragged(MouseEvent e)
	{
		frame.str = "Dragging("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		frame.str = "Moving("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();
	}
}

class Program4
{
	public static void main(String args[])
	{
		Myframe4 frame = new Myframe4();
		
		frame.addMouseMotionListener(new MyMouseMotionListener4(frame));
		frame.addWindowListener(new WindowCloser(frame));
	}
}
