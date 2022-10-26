
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

class MyMouseMotionListener implements MouseMotionListener
{
	Myframe frame;
	
	public MyMouseMotionListener()
	{
		
	}
	public MyMouseMotionListener(Myframe temp)
	{
		frame = temp;
	}
	
	//Overriding methods
	public void mouseDragged(MouseEvent e)
	{
		frame.str = "Dragged ("+e.getX()+","+e.getY()+")";
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		frame.x = e.getX();
		frame.y = e.getY();
		frame.str = "Moved ("+frame.x+","+frame.y+")";
		frame.repaint();
	}
}

class Pro7_MouseMotionListener
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		
		/*MyMouseMotionListener ml = new MyMouseMotionListener(frame);
		frame.addMouseMotionListener(ml);*/
		frame.addMouseMotionListener(new MyMouseMotionListener(frame));
		
		//To close window we will use CommonWindowListener class i.e. WindowCloser
		/*WindowCloser wc = new WindowCloser(frame);
		frame.addWindowListener(wc); */
		frame.addWindowListener(new WindowCloser(frame));
	}
}