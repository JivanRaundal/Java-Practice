
import java.awt.*;
import java.awt.event.*;

class Myframe3 extends Frame
{
	String str;
	int x,y;
	
	public Myframe3()
	{
		str = "click anywhere in window";
		x = 55;
		y = 100;
		setSize(600,600);
		setTitle("Program3");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)			//@Overriden
	{
		g.setFont(new Font("verdena", Font.BOLD, 35));
		g.setColor(Color.red);
		g.drawString(str, x, y);
	}
}

class MyMouseListener3 extends MouseAdapter
{
	Myframe3 frame;
	
	public MyMouseListener3()
	{
		
	}
	public MyMouseListener3(Myframe3 ref)
	{
		frame = ref;
	}
	public void mouseClicked(MouseEvent e)				//@Overriden
	{
		frame.str = "Mouse Clicked at("+e.getX()+","+e.getY()+")";
		frame.y = frame.y + 50;				// frame.y is changed each time to move string down.
		frame.repaint();
	}
}

class Program3
{
	public static void main(String args[])
	{
		Myframe3 frame = new Myframe3();
		
		frame.addMouseListener(new MyMouseListener3(frame));
		frame.addWindowListener(new WindowCloser(frame));
	}
}