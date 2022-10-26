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
		this.setSize(500,500);
		this.setTitle("Myframe");
		this.setLocationRelativeTo(null);
		this.setBackground(new Color(228, 106, 123));
		this.setVisible(true);
		str = "Hello World";
		x = 50;
		y = 50;
	}
	
	public void paint(Graphics g)			//@Overriden
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

class Pro5_MouseEvent_and_repaint
{
	public static void main(String args[])
	{
		Myframe obj = new Myframe();
		MyMouseListener ml = new MyMouseListener(obj);
		obj.addMouseListener(ml);
	}
}