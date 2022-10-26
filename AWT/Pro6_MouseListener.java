
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
		str = "Hello World";
		x = 50;
		y = 50;
	}
	
	public void paint(Graphics g)				//Overriden method
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
	public MyMouseListener(Myframe temp)
	{
		this.temp = temp;
	}
	
	//@Overriding methods
	public void mouseClicked(MouseEvent e)
	{
		temp.x = e.getX();
		temp.y = e.getY();
		temp.str = "Clicked at(" + temp.x + "," + temp.y + ")";
		//Note: we cannot call paint() method directly, we have to call repaint() method
		temp.repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		System.out.println("Pressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		System.out.println("Released");
	}
	public void mouseEntered(MouseEvent e)
	{
		System.out.println("Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		System.out.println("Exited");
	}
}

class Pro6_MouseListener
{
	public static void main(String args[])
	{
		Myframe frame = new Myframe();
		
		/*MyMouseListener ml = new MyMouseListener(frame);
		frame.addMouseListener(ml);*/
		frame.addMouseListener(new MyMouseListener(frame));
		
		//To close window we will use CommonWindowListener class i.e. WindowCloser
		/*WindowCloser wc = new WindowCloser(frame);
		frame.addWindowListener(wc); */
		frame.addWindowListener(new WindowCloser(frame));
		
	}
}